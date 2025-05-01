package com.github.aignatev.intellijxdtsyntax.factory

import com.github.aignatev.intellijxdtsyntax.xdt.XdtSyntaxHighlighter
import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory

class XdtSyntaxHighlighterFactory : SingleLazyInstanceSyntaxHighlighterFactory() {
  override fun createHighlighter() = XdtSyntaxHighlighter()
}
