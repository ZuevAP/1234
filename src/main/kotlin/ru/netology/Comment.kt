package ru.netology

class Comment (
    val id: Int? = null,
    val postId: Int? = null,
    val fromId: Int? = null,
    val date: Int? = null,
    val text: String? = null,
    val donut: Donut? = null,
    val replyToUser: Int? = null,
    val replyToComment: Int? = null,
    val attachment: Array<Attachment>? = null,
    val thread: Thread? = null
){
}