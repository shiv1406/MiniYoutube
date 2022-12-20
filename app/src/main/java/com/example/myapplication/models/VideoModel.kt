package com.example.myapplication.models

class VideoModel {
    var regionCode: String? = null
    var kind: String? = null
    var nextPageToken: String? = null
    var pageInfo: PageInfo? = null
    var etag: String? = null
    lateinit var items: Array<Items>
    @JvmName("getItems1")
    fun getItems(): Array<Items> {
        return items
    }
}
