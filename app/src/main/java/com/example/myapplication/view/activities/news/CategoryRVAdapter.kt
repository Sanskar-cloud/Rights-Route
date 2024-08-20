package com.example.myapplication.view.activities.news

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.squareup.picasso.Picasso

class CategoryRVAdapter(
    var categoryRVModals: ArrayList<CategoryRVModal>,
    var context: Context,
    var categoryClickInterface: CategoryClickInterface
) :
    RecyclerView.Adapter<CategoryRVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View
        view = LayoutInflater.from(parent.context).inflate(R.layout.category_rv_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val categoryRVModal = categoryRVModals[position]
        holder.CategoryTV.setText(categoryRVModal.getCategory())
        Picasso.get().load(categoryRVModal.getCategoryImageUrl()).into(holder.CategoryIV)
        holder.itemView.setOnClickListener { categoryClickInterface.onCategoryClick(holder.adapterPosition) }
    }

    override fun getItemCount(): Int {
        return categoryRVModals.size
    }

    interface CategoryClickInterface {
        @SuppressLint("NotifyDataSetChanged")
        fun onCreate(savedInstanceState: Bundle?)
        fun onCategoryClick(position: Int)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val CategoryTV: TextView
        val CategoryIV: ImageView

        init {
            CategoryTV = itemView.findViewById(R.id.idTVCategory)
            CategoryIV = itemView.findViewById(R.id.idIVCategory)
        }
    }
}
