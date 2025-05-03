package com.github.aignatev.intellijxdtsyntax.helpers

import com.github.aignatev.intellijxdtsyntax.xdt.KvdtField

fun getInformationTooltip(identifierText: String, kvdtField: KvdtField) =
    """
    <html>
    <b>${identifierText}</b> — <i>${kvdtField.name}</i><br>
    ${getLengthText(kvdtField)}<br>
    <b>Type:</b> ${typeToName(kvdtField.fieldType)}<br>
    ${getValueRange(kvdtField)}
    ${getExplanation(kvdtField)}
    </html>
    """
        .trimIndent()

fun getValueRange(kvdtField: KvdtField): String {
  if (kvdtField.valueRange.isEmpty()) return ""

  return "<br><b>Value range:</b><br>${kvdtField.valueRange.breakLines()}<br>"
}

fun getExplanation(kvdtField: KvdtField): String {
  if (kvdtField.explanation.isEmpty()) return ""

  return "<br><b>Explanation:</b><br>${kvdtField.explanation.breakLines()}<br>"
}

fun getWarningTooltip(identifierText: String) =
    """
    <html>
    Field '${identifierText}' is not found in the known KBV fields catalogue.<br>
    Possible typo or missing definition.
    </html>
    """
        .trimIndent()

fun String.breakLines(): String {
  val lines = this.split("\n")
  return lines.joinToString("<br>")
}

fun typeToName(type: String): String {
  return when (type) {
    "A" -> "alphanumeric"
    "N" -> "numeric"
    "D" -> "date"
    else -> type
  }
}

fun getLengthText(kvdtField: KvdtField): String {
  return kvdtField.let {
    if (it.min == it.max) {
      "<b>Valid length:</b> ${it.min}"
    } else {
      "<b>Valid length:</b> ${it.min}–${it.max} chars."
    }
  }
}
