package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.API.SingltonRetrofitObject
import com.example.myapplication.models.Items
import com.example.myapplication.models.VideoModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    var progressBar: ProgressBar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        progressBar = findViewById(R.id.progress_circular)
        recyclerView!!.setLayoutManager(LinearLayoutManager(this))
        recyclerView!!.hasFixedSize()
        doApiCall()
    }

    private fun doApiCall() {
        val videoModelCall: Call<VideoModel> =
            SingltonRetrofitObject.getmInstance()!!.getAPI()!!.getVideoDetails(
                getString(R.string.youtubeAPIKey),
                "UCoF2NslstOjGAyQL3p7D_xQ", "snippet", "date", "50", "video"
            )
        videoModelCall.enqueue(object : Callback<VideoModel> {
            override fun onResponse(call: Call<VideoModel>, response: Response<VideoModel>) {
                setRecyclerView(response.body()!!.getItems())
            }

            override fun onFailure(call: Call<VideoModel>, t: Throwable) {}
        })
    }

    private fun setRecyclerView(items: Array<Items>) {
        val myAdapter = MyAdapter(this, items)
        recyclerView!!.adapter = myAdapter
        recyclerView!!.visibility = View.VISIBLE
        progressBar!!.visibility = View.GONE
    }

    fun profile(view: View)
    {
        var i=Intent(this@MainActivity,signIn::class.java)
        startActivity(i)
    }
}