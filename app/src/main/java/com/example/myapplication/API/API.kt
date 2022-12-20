package com.example.myapplication.API

import com.example.myapplication.models.VideoModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface API {
    @GET("search")
    fun getVideoDetails(
        @Query("key") key: String?,
        @Query("channelId") channelId: String?,
        @Query("part") part: String?,
        @Query("order") order: String?,
        @Query("maxResults") maxResult: String?,
        @Query("type") type: String?
    ): Call<VideoModel>
}