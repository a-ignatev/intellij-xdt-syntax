package com.github.aignatev.intellijxdtsyntax.helpers

private val xdtLineRegex = Regex("""^\s*\d{3}\d{4}.*$""")

fun looksLikeXdt(text: String): Boolean {
  if (!text.startsWith("\"\"\"")) return false

  val lines = text.lines()

  val nonBlankLines = lines.dropWhile { it.isBlank() || it.startsWith("\"\"\"") }

  val xdtLines = nonBlankLines.takeWhile { xdtLineRegex.matches(it) }

  return xdtLines.size >= 3
}
