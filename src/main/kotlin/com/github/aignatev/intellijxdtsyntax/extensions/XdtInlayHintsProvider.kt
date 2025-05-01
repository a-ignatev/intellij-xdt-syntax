package com.github.aignatev.intellijxdtsyntax.extensions

import com.github.aignatev.intellijxdtsyntax.xdt.fieldMap
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
    get() = "XDT Field Hints"

  override val key: SettingsKey<NoSettings> = SettingsKey("XDT.InlayHints")
  override val previewText = "0138000sampledata"

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
          val fieldDefinition = fieldMap[identifier.text]
          val fieldName = fieldDefinition?.name ?: "field is not found in the fields catalog!"
          val textPresentation = factory.smallText(fieldName)
          val lengthText =
              fieldDefinition?.let {
                val min = it.min
                val max = it.max
                if (min == max) {
                  "Valid length: $min"
                } else {
                  "Valid length: $min–$max chars."
                }
              }
          val tooltipPresentation =
              factory.withTooltip(
                  """
                  ${identifier.text} — $fieldName
                  $lengthText
                  """
                      .trimIndent(),
                  textPresentation)

          sink.addInlineElement(
              element.textRange.endOffset,
              relatesToPrecedingText = false,
              tooltipPresentation,
              true)
        }
        return true
      }
    }
  }

  override fun createSettings() = NoSettings()
}
