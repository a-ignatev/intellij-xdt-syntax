package com.github.aignatev.intellijxdtsyntax.extensions

import com.github.aignatev.intellijxdtsyntax.xdt.XdtLanguage
import com.github.aignatev.intellijxdtsyntax.xdt.XdtLexerAdapter
import com.github.aignatev.intellijxdtsyntax.xdt.file.XdtFile
import com.github.aignatev.intellijxdtsyntax.xdt.tokens.XdtElementTypes
import com.github.aignatev.intellijxdtsyntax.xdt.tokens.XdtTypes
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiBuilder
import com.intellij.lang.PsiParser
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class XdtParserDefinition : ParserDefinition {
  companion object {
    val FILE = IFileElementType(XdtLanguage)
  }

  override fun createLexer(project: com.intellij.openapi.project.Project?) = XdtLexerAdapter()

  override fun createParser(project: com.intellij.openapi.project.Project?): PsiParser {
    return PsiParser { root, builder ->
      val marker = builder.mark()

      while (!builder.eof()) {
        parseLine(builder)
      }

      marker.done(root)
      builder.treeBuilt
    }
  }

  private fun parseLine(builder: PsiBuilder) {
    if (builder.eof()) return

    val lineMarker = builder.mark()
    var valid = true
    var advanced = false

    if (builder.tokenType == XdtTypes.LINE_LENGTH) {
      builder.advanceLexer()
      advanced = true
    } else {
      valid = false
    }

    if (builder.tokenType == XdtTypes.IDENTIFIER) {
      builder.advanceLexer()
      advanced = true
    } else {
      valid = false
    }

    if (builder.tokenType == XdtTypes.DATA) {
      builder.advanceLexer()
      advanced = true
    }

    // consume newline if exists
    if (builder.tokenType == TokenType.WHITE_SPACE) {
      builder.advanceLexer()
      advanced = true
    }

    // Fail-safe advance if nothing consumed
    if (!advanced && !builder.eof()) {
      builder.advanceLexer()
      valid = false
    }

    if (!valid) {
      lineMarker.done(XdtElementTypes.XDT_BAD_LINE)
    } else {
      lineMarker.done(XdtElementTypes.XDT_LINE)
    }
  }

  override fun getFileNodeType() = FILE

  override fun getCommentTokens(): TokenSet = TokenSet.EMPTY

  override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

  override fun createElement(node: ASTNode): PsiElement {
    return ASTWrapperPsiElement(node)
  }

  override fun createFile(viewProvider: FileViewProvider): PsiFile {
    return XdtFile(viewProvider)
  }

  override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode) =
      ParserDefinition.SpaceRequirements.MAY
}
