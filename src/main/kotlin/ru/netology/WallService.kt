package ru.netology

class WallService {

    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun createComment(comment: Comment): Comment {
        for (post in posts) {
            if (post.id == comment.postId) {
                comments += comment
                return comments.last()
            }
        }
        throw PostNotFoundException("Такой пост не найден")
    }



    fun add(post: Post): Post {


        posts += post.copy(id = if (posts.isEmpty()) 1 else posts.last().id + 1)


        return posts.last()
    }


    fun update(post: Post): Boolean {
        for ((index, item) in posts.withIndex()) {
            if (item.id == post.id) {
                posts[index] = post.copy(ownerId = post.ownerId, date = post.date)
                return true
            }
        }
        return false
    }

}