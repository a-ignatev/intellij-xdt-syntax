package com.github.aignatev.intellijxdtsyntax.xdt

data class KvdtField(
    val key: String,
    val name: String,
    val min: Int,
    val max: Int,
    val fieldType: String,
    val valueRange: String,
    val explanation: String
)
