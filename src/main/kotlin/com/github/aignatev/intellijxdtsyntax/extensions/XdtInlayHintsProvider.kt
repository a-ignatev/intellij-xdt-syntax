package com.github.aignatev.intellijxdtsyntax.extensions

import com.github.aignatev.intellijxdtsyntax.helpers.getInformationTooltip
import com.github.aignatev.intellijxdtsyntax.helpers.getWarningTooltip
import com.github.aignatev.intellijxdtsyntax.xdt.kvdtFieldMap
import com.github.aignatev.intellijxdtsyntax.xdt.tokens.XdtElementTypes
import com.github.aignatev.intellijxdtsyntax.xdt.tokens.XdtTypes
import com.intellij.codeInsight.hints.*
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import javax.swing.JComponent
import javax.swing.JPanel

@Suppress("UnstableApiUsage")
class XdtInlayHintsProvider : InlayHintsProvider<NoSettings> {
  override val name: String
    get() = "XDT field hints"

  override val key: SettingsKey<NoSettings> = SettingsKey("XDT.InlayHints")
  override val previewText =
      """
      0138000con0
      017910320780210
      01091064
      01002253
      01002254
      """

  override fun createConfigurable(settings: NoSettings): ImmediateConfigurable {
    return object : ImmediateConfigurable {
      override fun createComponent(listener: ChangeListener): JComponent {
        return JPanel()
      }
    }
  }

  override fun getCollectorFor(
      file: PsiFile,
      editor: Editor,
      settings: NoSettings,
      sink: InlayHintsSink
  ): InlayHintsCollector {
    return object : FactoryInlayHintsCollector(editor) {
      override fun collect(element: PsiElement, editor: Editor, sink: InlayHintsSink): Boolean {
        if (element.node.elementType != XdtElementTypes.XDT_LINE) return true

        val identifier =
            element.node.getChildren(null).find { it.elementType == XdtTypes.IDENTIFIER }

        if (identifier != null) {
          val kvdtField = kvdtFieldMap[identifier.text]

          if (kvdtField != null) {
            sink.addInlineElement(
                element.textRange.endOffset,
                relatesToPrecedingText = false,
                factory.withTooltip(
                    getInformationTooltip(identifier.text, kvdtField),
                    factory.smallText(kvdtField.name)),
                true)
          } else {
            sink.addInlineElement(
                element.textRange.endOffset,
                relatesToPrecedingText = false,
                factory.withTooltip(
                    getWarningTooltip(identifier.text),
                    factory.smallText(
                        "Field '${identifier.text}' is not found in the known KBV fields catalogue.")),
                true)
          }
        }

        return true
      }
    }
  }

  override fun createSettings() = NoSettings()
}
