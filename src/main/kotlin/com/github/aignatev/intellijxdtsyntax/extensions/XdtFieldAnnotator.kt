package com.github.aignatev.intellijxdtsyntax.extensions

import com.github.aignatev.intellijxdtsyntax.helpers.getInformationTooltip
import com.github.aignatev.intellijxdtsyntax.helpers.getWarningTooltip
import com.github.aignatev.intellijxdtsyntax.intentions.UpdateLineLengthIntention
import com.github.aignatev.intellijxdtsyntax.xdt.kvdtFieldMap
import com.github.aignatev.intellijxdtsyntax.xdt.tokens.XdtElementTypes
import com.github.aignatev.intellijxdtsyntax.xdt.tokens.XdtTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement

class XdtFieldAnnotator : Annotator {
  override fun annotate(element: PsiElement, holder: AnnotationHolder) {
    if (element.node.elementType != XdtElementTypes.XDT_LINE) return

    val identifier = element.node.getChildren(null).find { it.elementType == XdtTypes.IDENTIFIER }

    if (identifier != null) {
      addIdentifierAnnotation(identifier, holder)
    }

    checkAndAnnotateLength(element, holder)
  }

  private fun checkAndAnnotateLength(element: PsiElement, holder: AnnotationHolder) {
    val lineLengthNode =
        element.node.getChildren(null).find { it.elementType == XdtTypes.LINE_LENGTH }

    if (lineLengthNode != null) {
      val writtenLineLength = lineLengthNode.text.trim().toIntOrNull()
      val actualLineLength = element.text.trim().length + 2 // +2 for the CRLF

      if (writtenLineLength != null && actualLineLength != writtenLineLength) {
        val textRange =
            lineLengthNode.textRange.let {
              TextRange((it.endOffset - 3).coerceAtLeast(it.startOffset), it.endOffset)
            }

        holder
            .newAnnotation(
                HighlightSeverity.ERROR,
                "[XDT] Line length mismatch. Expected: $writtenLineLength, Actual: $actualLineLength")
            .range(textRange)
            .withFix(UpdateLineLengthIntention(textRange, actualLineLength))
            .create()
      }
    }
  }

  private fun addIdentifierAnnotation(identifier: ASTNode, holder: AnnotationHolder) {
    val kvdtField = kvdtFieldMap[identifier.text]

    if (kvdtField != null) {
      holder
          .newAnnotation(HighlightSeverity.INFORMATION, "[XDT] field: ${kvdtField.name}")
          .range(identifier.textRange)
          .tooltip(getInformationTooltip(identifier.text, kvdtField))
          .create()
    } else {
      holder
          .newAnnotation(HighlightSeverity.WARNING, "[XDT] Unknown field: '${identifier.text}'")
          .range(identifier.textRange)
          .tooltip(getWarningTooltip(identifier.text))
          .create()
    }
  }
}
