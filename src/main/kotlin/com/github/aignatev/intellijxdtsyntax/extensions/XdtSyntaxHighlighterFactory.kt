package com.github.aignatev.intellijxdtsyntax.extensions

import com.github.aignatev.intellijxdtsyntax.xdt.XdtSyntaxHighlighter
import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory

class XdtSyntaxHighlighterFactory : SingleLazyInstanceSyntaxHighlighterFactory() {
  override fun createHighlighter() = XdtSyntaxHighlighter()
}
