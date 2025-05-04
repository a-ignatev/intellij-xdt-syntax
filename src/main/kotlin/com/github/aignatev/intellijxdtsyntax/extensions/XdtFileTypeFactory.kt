package com.github.aignatev.intellijxdtsyntax.extensions

import com.github.aignatev.intellijxdtsyntax.xdt.file.XdtFileType
import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory

class XdtFileTypeFactory : FileTypeFactory() {
  override fun createFileTypes(consumer: FileTypeConsumer) {
    consumer.consume(XdtFileType, "xdt;con;gdt;vik")
  }
}
