package com.github.aignatev.intellijxdtsyntax.xdt.file

import com.github.aignatev.intellijxdtsyntax.xdt.XdtLanguage
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

object XdtIcons {
  val File = IconLoader.getIcon("/icons/xdt_file.svg", XdtIcons::class.java)
}

object XdtFileType : LanguageFileType(XdtLanguage) {
  override fun getName() = "XDT"

  override fun getDescription() = "XDT"

  override fun getDefaultExtension() = "xdt"

  override fun getIcon(): Icon = XdtIcons.File
}
