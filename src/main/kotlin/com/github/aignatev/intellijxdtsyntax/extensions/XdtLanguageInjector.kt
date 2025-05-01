package com.github.aignatev.intellijxdtsyntax.extensions

import com.github.aignatev.intellijxdtsyntax.helpers.looksLikeXdt
import com.github.aignatev.intellijxdtsyntax.xdt.XdtLanguage
import com.intellij.lang.injection.MultiHostInjector
import com.intellij.lang.injection.MultiHostRegistrar
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiLanguageInjectionHost

class XdtLanguageInjector : MultiHostInjector {
  override fun elementsToInjectIn(): List<Class<out PsiElement>> {
    return listOf(PsiLanguageInjectionHost::class.java)
  }

  override fun getLanguagesToInject(registrar: MultiHostRegistrar, context: PsiElement) {
    if (context !is PsiLanguageInjectionHost || !context.isValidHost) return

    val rawText = context.text ?: return
    if (!looksLikeXdt(rawText)) return

    val start = if (rawText.startsWith("\"\"\"")) 3 else 1
    val end = rawText.length - if (rawText.endsWith("\"\"\"")) 3 else 1
    if (start >= end) return

    registrar.startInjecting(XdtLanguage)
    registrar.addPlace(null, null, context, TextRange(start, end))
    registrar.doneInjecting()
  }
}
