package com.github.aignatev.intellijxdtsyntax.xdt

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType

class XdtSyntaxHighlighter : SyntaxHighlighterBase() {
  override fun getHighlightingLexer(): Lexer = XdtLexerAdapter()

  override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
    return when (tokenType) {
      XdtTypes.LINE_LENGTH -> arrayOf(XdtHighlightingColors.LINE_LENGTH)
      XdtTypes.IDENTIFIER -> arrayOf(XdtHighlightingColors.IDENTIFIER)
      XdtTypes.DATA -> arrayOf(XdtHighlightingColors.DATA)
      else -> emptyArray()
    }
  }
}
