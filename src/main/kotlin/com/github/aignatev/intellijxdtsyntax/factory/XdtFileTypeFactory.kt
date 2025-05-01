package com.github.aignatev.intellijxdtsyntax.factory

import com.github.aignatev.intellijxdtsyntax.xdt.XdtFileType
import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory

class XdtFileTypeFactory : FileTypeFactory() {
  override fun createFileTypes(consumer: FileTypeConsumer) {
    consumer.consume(XdtFileType, "xdt")
  }
}
