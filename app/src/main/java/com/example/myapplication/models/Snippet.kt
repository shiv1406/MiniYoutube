package com.example.myapplication.models

class Snippet {
    var publishTime: String? = null
    var publishedAt: String? = null
    var description: String? = null
    var title: String? = null
    var thumbnails: Thumbnails? = null
    var channelId: String? = null
    var channelTitle: String? = null
    var liveBroadcastContent: String? = null
    @JvmName("getTitle1")
    fun getTitle(): String? {
        return title
    }

    @JvmName("setTitle1")
    fun setTitle(title: String?) {
        this.title = title
    }

    @JvmName("getThumbnails1")
    fun getThumbnails(): Thumbnails? {
        return thumbnails
    }
}

