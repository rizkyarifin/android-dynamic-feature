package com.sample.news_feature.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sample.news_feature.R
import com.sample.news_feature.model.NewsDataClass
import kotlinx.android.synthetic.main.list_layout.view.*

class NewsAdapter(private val items: List<NewsDataClass>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textViewTitle.text = items[position].title
        holder.textViewDescription.text = items[position].description
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false))
    }
}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val textViewTitle = view.textViewTitle
    val textViewDescription = view.textViewDescription
}
