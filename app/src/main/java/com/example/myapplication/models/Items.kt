package com.example.myapplication.models

class Items {
    var snippet: Snippet? = null
    var kind: String? = null
    var etag: String? = null
    var id: Id? = null
    @JvmName("getSnippet1")
    fun getSnippet(): Snippet? {
        return snippet
    }
}