package ru.netology

class AudioAttachment : Attachment{
    override val type: String = "audio"
    val video: Video = Video()
}