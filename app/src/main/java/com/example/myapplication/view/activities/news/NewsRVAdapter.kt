package com.example.myapplication.view.activities.news

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.model.Articles
import com.squareup.picasso.Picasso

class NewsRVAdapter(
    private val articlesArrayList: ArrayList<Articles>,
    private val context: Context
) : RecyclerView.Adapter<NewsRVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.news_rv_item, parent, false
        )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val articles = articlesArrayList[position]
        holder.titleTV.text = articles.title
        holder.subTitleTV.text = articles.description
        Picasso.get().load(articles.urlToImage).into(holder.newsIV)
        holder.itemView.setOnClickListener {
            val intent = Intent(context, NewsDetailActivity::class.java).apply {
                putExtra("Title", articles.title)
                putExtra("Content", articles.content)
                putExtra("Desc", articles.description)
                putExtra("Image", articles.urlToImage)
                putExtra("Url", articles.url)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = articlesArrayList.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTV: TextView = itemView.findViewById(R.id.idTVHeading)
        val subTitleTV: TextView = itemView.findViewById(R.id.idTVsubHeading)
        val newsIV: ImageView = itemView.findViewById(R.id.idIVNews)
    }

}