package com.github.aignatev.intellijxdtsyntax.xdt

import com.intellij.psi.tree.IElementType

class XdtTokenType(debugName: String) : IElementType(debugName, XdtLanguage)

object XdtTypes {
  val LINE_LENGTH = XdtTokenType("LINE_LENGTH")
  val IDENTIFIER = XdtTokenType("IDENTIFIER")
  val DATA = XdtTokenType("DATA")
}
