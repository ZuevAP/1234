package ru.netology

import kotlin.collections.ArrayList

//val posts:MutableList<Post> = mutableListOf()



fun main () {

    val service = WallService()
    val elements = ArrayList<Attachment>()
    val video = VideoAttachment()
    val audio = AudioAttachment()


    val myPost = Post(
        0,
        0,
        0,
        0,
        0,
        "Текст поста 1",
        0,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        0

    )

    val myPost2 = Post(
        0,
        0,
        0,
        0,
        0,
        "Текст поста 2",
        0,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        0
    )

    val myPost3 = Post(
        0,
        0,
        0,
        0,
        0,
        "Текст поста 3",
        0,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        0

    )
    val myPost4 = Post(
        0,
        0,
        0,
        0,
        0,
        "Текст поста 4",
        0,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        0
    )

    val myPost5 = Post(
        0,
        0,
        0,
        0,
        0,
        "Текст поста 5",
        0,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        0

    )
    service.add(myPost)
    service.add(myPost2)
    service.add(myPost3)
    service.add(myPost4)
    service.add(myPost5)

    elements.add(video)
    elements.add(audio)




}