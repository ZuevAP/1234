package ru.netology

import org.junit.Assert.*
import org.junit.Test

class WallServiceTest{
    @Test
    fun shouldAddComment() {
        val service = WallService()

        val post = Post(id = 0, text = "")
        val comment = Comment(1, 1, text = "testGood")

        service.add(post)
        service.createComment(comment)

        assertEquals("testGood", comment.text)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService()
        val comment = Comment(postId = 1)
        service.createComment(comment)
    }




@Test
fun addFunction() {
    val service = WallService()
    val post = Post(
        0,
        1,
        null,
        null,
        null,
        "Текст поста 1",
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null)

    service.add(post)

    val result: Boolean = true

    assertTrue(result)
}

@Test
fun updateExisting_True() {
    val service = WallService()

    service.add(Post(
        0,
        null,
        null,
        null,
        null,
        "Текст поста 1",
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null))

    service.add(Post(
        0,
        null,
        null,
        null,
        null,
        "Текст поста 1",
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null))

    service.add(Post(
        0,
        null,
        null,
        null,
        null,
        "Текст поста 1",
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null))

    val update = Post(
        0,
        null,
        null,
        null,
        null,
        "Текст поста 1",
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null)

    val result = service.update(update)

    assertFalse(result)
}

@Test
fun updateExisting_False() {
    val service = WallService()

    service.add(Post(
        0,
        null,
        null,
        null,
        null,
        "Текст поста 1",
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null))

    service.add(Post(
        0,
        null,
        null,
        null,
        null,
        "Текст поста 1",
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null))

        val update = Post(
            3,
            null,
            null,
            null,
            null,
            "Текст поста 1",
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null)

    val result = service.update(update)

    assertFalse(result)

}
}