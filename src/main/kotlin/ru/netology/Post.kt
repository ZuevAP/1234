package ru.netology

data class Post(
    var id: Int,
    var ownerId: Int? = null,
    var fromId: Int? = null,
    var createdById: Int? = null,
    var date: Int? = null,
    val text: String,
    var replyOwnerId: Int? = null,
    var replyPostId: Int? = null,
    val friendsOnly: Boolean? = null ,
    val comments: Comments? = null,
    val copyright: String? = null,
    val likes: Likes? = null,
    val reports: Reports? = null,
    val views: Views? = null,
    val postType: String? = null,
    var signerId: Int? = null,
    val canPin: Boolean? = null,
    val canDelete: Boolean? = null,
    val canEdit: Boolean? = null,
    val isPinned: Boolean? = null,
    val markedAsAds: Boolean? = null,
    val isFavorite: Boolean? = null,
    var postponedId: Int? = null

) {


    override fun toString(): String {
        return "ID:$id \n$text "
    }


}
