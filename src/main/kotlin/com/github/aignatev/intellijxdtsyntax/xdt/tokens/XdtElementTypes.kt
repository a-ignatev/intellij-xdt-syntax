package com.github.aignatev.intellijxdtsyntax.xdt.tokens

import com.github.aignatev.intellijxdtsyntax.xdt.XdtLanguage
import com.intellij.psi.tree.IElementType

object XdtElementTypes {
  val XDT_LINE = IElementType("XDT_LINE", XdtLanguage)
  val XDT_BAD_LINE = IElementType("XDT_BAD_LINE", XdtLanguage)
}
