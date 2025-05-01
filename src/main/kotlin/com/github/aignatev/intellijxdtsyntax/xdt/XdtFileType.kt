package com.github.aignatev.intellijxdtsyntax.xdt

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object XdtFileType : LanguageFileType(XdtLanguage) {
  override fun getName() = "XDT File"

  override fun getDescription() = "XDT syntax file"

  override fun getDefaultExtension() = "xdt"

  override fun getIcon(): Icon? = null
}
