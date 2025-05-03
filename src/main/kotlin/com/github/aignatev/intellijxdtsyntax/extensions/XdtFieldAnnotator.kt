package com.github.aignatev.intellijxdtsyntax.extensions

import com.github.aignatev.intellijxdtsyntax.helpers.getInformationTooltip
import com.github.aignatev.intellijxdtsyntax.helpers.getWarningTooltip
import com.github.aignatev.intellijxdtsyntax.xdt.kvdtFieldMap
import com.github.aignatev.intellijxdtsyntax.xdt.tokens.XdtElementTypes
import com.github.aignatev.intellijxdtsyntax.xdt.tokens.XdtTypes
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement

class XdtFieldAnnotator : Annotator {
  override fun annotate(element: PsiElement, holder: AnnotationHolder) {
    if (element.node.elementType != XdtElementTypes.XDT_LINE) return

    val identifier = element.node.getChildren(null).find { it.elementType == XdtTypes.IDENTIFIER }

    if (identifier != null) {
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
}
