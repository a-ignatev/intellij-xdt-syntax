package com.github.aignatev.intellijxdtsyntax.xdt

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey

object XdtHighlightingColors {
  val LINE_LENGTH =
      TextAttributesKey.createTextAttributesKey(
          "XDT_LINE_LENGTH", DefaultLanguageHighlighterColors.LINE_COMMENT)

  val IDENTIFIER =
      TextAttributesKey.createTextAttributesKey(
          "XDT_IDENTIFIER", DefaultLanguageHighlighterColors.KEYWORD)

  val DATA =
      TextAttributesKey.createTextAttributesKey("XDT_DATA", DefaultLanguageHighlighterColors.STRING)
}
