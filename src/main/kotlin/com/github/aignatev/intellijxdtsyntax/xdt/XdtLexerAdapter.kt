package com.github.aignatev.intellijxdtsyntax.xdt

import XdtLexer
import com.intellij.lexer.FlexAdapter

class XdtLexerAdapter : FlexAdapter(XdtLexer(null))
