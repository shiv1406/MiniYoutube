package com.example.myapplication

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var imageView: ImageView
    var textView: TextView

    init {
        imageView = itemView.findViewById(R.id.imageView)
        textView = itemView.findViewById(R.id.textView)
    }
}
