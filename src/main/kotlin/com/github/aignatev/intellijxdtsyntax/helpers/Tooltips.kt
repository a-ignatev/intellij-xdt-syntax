package com.github.aignatev.intellijxdtsyntax.helpers

import com.github.aignatev.intellijxdtsyntax.xdt.KvdtField

fun getInformationTooltip(identifierText: String, kvdtField: KvdtField) =
    """
    <html>
    <b>${identifierText}</b> — <i>${kvdtField.name}</i><br>
    ${kvdtField.lengthText()}
    </html>
    """
        .trimIndent()

fun getWarningTooltip(identifierText: String) =
    """
    <html>
    Field '${identifierText}' is not found in the known KBV fields catalogue.<br>
    Possible typo or missing definition.
    </html>
    """
        .trimIndent()

fun KvdtField.lengthText(): String {
  val min = min
  val max = max

  return if (min == max) {
    "Valid length: $min"
  } else {
    "Valid length: $min–$max chars."
  }
}
