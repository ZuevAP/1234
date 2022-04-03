package ru.netology

class FileAttachment: Attachment{
    override val type: String = "file"
    val file: File = File()
}
