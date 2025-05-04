package com.github.aignatev.intellijxdtsyntax.intentions

import com.intellij.codeInsight.intention.IntentionAction
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiFile

class UpdateLineLengthIntention(private val textRange: TextRange, private val correctLength: Int) :
    IntentionAction {
  override fun getText() = "Replace line length with $correctLength"

  override fun getFamilyName() = "XDT quick fixes"

  override fun isAvailable(project: Project, editor: Editor?, file: PsiFile?) = true

  override fun invoke(project: Project, editor: Editor?, file: PsiFile?) {
    if (editor == null || file == null) return

    editor.document.replaceString(
        textRange.startOffset, textRange.endOffset, correctLength.toString().padStart(3, '0'))
  }

  override fun startInWriteAction() = true
}
