package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.models.Items
import com.squareup.picasso.Picasso


class MyAdapter(var context: Context, items: Array<Items>) :
    RecyclerView.Adapter<MyViewHolder>() {
    var items: Array<Items>

    init {
        this.items = items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.setText(items[position].getSnippet()!!.getTitle())
        Picasso.get().load(items[position].getSnippet()!!.getThumbnails()!!.getHigh()!!.getUrl())
            .into(holder.imageView)

        //String str=items[position].getId().getVideoId(); for playing videos
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
