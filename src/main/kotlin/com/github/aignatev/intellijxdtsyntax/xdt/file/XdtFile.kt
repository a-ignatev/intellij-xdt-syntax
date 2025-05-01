package com.github.aignatev.intellijxdtsyntax.xdt.file

import com.github.aignatev.intellijxdtsyntax.xdt.XdtLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider

class XdtFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, XdtLanguage) {
  override fun getFileType() = XdtFileType
}
