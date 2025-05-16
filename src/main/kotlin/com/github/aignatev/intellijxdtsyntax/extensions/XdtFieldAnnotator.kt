package com.github.aignatev.intellijxdtsyntax.extensions

import com.github.aignatev.intellijxdtsyntax.helpers.getInformationTooltip
import com.github.aignatev.intellijxdtsyntax.helpers.getWarningTooltip
import com.github.aignatev.intellijxdtsyntax.intentions.UpdateLineLengthIntention
import com.github.aignatev.intellijxdtsyntax.xdt.KvdtField
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

    val children = element.node.getChildren(null)
    val lineLengthNode = children.find { it.elementType == XdtTypes.LINE_LENGTH }
    val identifierNode = children.find { it.elementType == XdtTypes.IDENTIFIER }
    val dataNode = children.find { it.elementType == XdtTypes.DATA }

    val kvdtField = kvdtFieldMap[identifierNode?.text]

    if (identifierNode != null) {
      addIdentifierAnnotation(identifierNode, kvdtField, holder)
    }

    if (lineLengthNode != null && dataNode != null) {
      validateLineLength(lineLengthNode, dataNode, holder)
    }

    if (kvdtField != null && dataNode != null) {
      validateDataLength(dataNode, kvdtField, holder)
    }
  }

  private fun addIdentifierAnnotation(
      identifierNode: ASTNode,
      kvdtField: KvdtField?,
      holder: AnnotationHolder
  ) {
    if (kvdtField != null) {
      holder
          .newAnnotation(HighlightSeverity.INFORMATION, "[XDT] field: ${kvdtField.name}")
          .range(identifierNode.textRange)
          .tooltip(getInformationTooltip(identifierNode.text, kvdtField))
          .create()
    } else {
      holder
          .newAnnotation(HighlightSeverity.WARNING, "[XDT] Unknown field: '${identifierNode.text}'")
          .range(identifierNode.textRange)
          .tooltip(getWarningTooltip(identifierNode.text))
          .create()
    }
  }

  private fun validateLineLength(
      lineLengthNode: ASTNode,
      dataNode: ASTNode,
      holder: AnnotationHolder
  ) {
    val dataLength = dataNode.text.length
    val declaredLineLength = lineLengthNode.text.trimStart().toInt()
    val actualLineLength = dataLength + 3 + 4 + 2 // +3 line length, +4 identifier, +2 CRLF

    if (actualLineLength != declaredLineLength) {
      val textRange =
          lineLengthNode.textRange.let {
            TextRange((it.endOffset - 3).coerceAtLeast(it.startOffset), it.endOffset)
          }

      holder
          .newAnnotation(
              HighlightSeverity.ERROR,
              "[XDT] Line length mismatch. Declared: $declaredLineLength, Actual: $actualLineLength")
          .range(textRange)
          .withFix(UpdateLineLengthIntention(textRange, actualLineLength))
          .create()
    }
  }

  private fun validateDataLength(
      dataNode: ASTNode,
      kvdtField: KvdtField,
      holder: AnnotationHolder
  ) {
    val dataLength = dataNode.text.length
    val min = kvdtField.min
    val max = kvdtField.max

    if (dataLength < min || dataLength > max) {
      val expectedLength = if (min == max) min else "$min-$max"

      holder
          .newAnnotation(
              HighlightSeverity.WARNING,
              "[XDT] Data length mismatch. Expected: $expectedLength, Actual: $dataLength")
          .range(dataNode.textRange)
          .create()
    }
  }
}
