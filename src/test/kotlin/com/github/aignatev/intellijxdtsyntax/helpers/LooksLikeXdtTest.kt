package com.github.aignatev.intellijxdtsyntax.helpers

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class LooksLikeXdtTest {

  @Test
  fun `accepts valid 3 xdt lines after blanks`() {
    val text =
        "\"\"\"\n            0138000con0\n            017910320780210\n            01091064\n        \"\"\""

    assertTrue(looksLikeXdt(text))
  }

  @Test
  fun `rejects less than 3 xdt lines`() {
    val text = "\"\"\n            0138000con0\n            017910320780210\n        \"\"\""

    assertFalse(looksLikeXdt(text))
  }

  @Test
  fun `rejects non multi-line strings`() {
    val text = "\"Hello world\""

    assertFalse(looksLikeXdt(text))
  }

  @Test
  fun `rejects non multi-line strings even if they look like xdt line`() {
    val text = "\"0138000con0\""

    assertFalse(looksLikeXdt(text))
  }

  @Test
  fun `rejects non multi-line strings even if they look like xdt line and it's more than 3 lines`() {
    val text = "\"0138000con0\n017910320780210\n01091064\n01091064\n01091064\""

    assertFalse(looksLikeXdt(text))
  }

  @Test
  fun `rejects where there is noise before xdt`() {
    val text =
        "\"\"\"\n            Hello world\n            0138000con0\n            017910320780210\n            01091064\n        \"\"\""

    assertFalse(looksLikeXdt(text))
  }

  @Test
  fun `accepts many blank lines before xdt`() {
    val text =
        "\"\"\"\n\n\n\n\n\n\n\n\n\n            0138000con0\n            017910320780210\n            01091064\n        \"\"\""

    assertTrue(looksLikeXdt(text))
  }

  @Test
  fun `rejects random text without any xdt lines`() {
    val text = "\"\"\n            Random\n            Text\n            Here\n        \"\"\""

    assertFalse(looksLikeXdt(text))
  }

  @Test
  fun `accepts more than three xdt lines`() {
    val text =
        "\"\"\"\n            0138000con0\n            017910320780210\n            01091064\n            01002253\n            01002254\n        \"\"\""

    assertTrue(looksLikeXdt(text))
  }
}
