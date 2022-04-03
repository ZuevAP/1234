package ru.netology

class VideoAttachment : Attachment{
    override val type: String = "video"
    val video: Video = Video()
}