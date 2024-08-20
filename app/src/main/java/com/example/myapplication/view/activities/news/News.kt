package com.example.myapplication.view.activities.news

import android.annotation.SuppressLint
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.RetroFitAPI
import com.example.myapplication.data.model.Articles
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class news : AppCompatActivity(), CategoryRVAdapter.CategoryClickInterface {

    private lateinit var NewsRV: RecyclerView
    private lateinit var CategoryRV: RecyclerView
    private var articlesArrayList = ArrayList<Articles>()
    private var categoryRVModalArrayList = ArrayList<CategoryRVModal>()
    private lateinit var categoryRVAdapter: CategoryRVAdapter
    private lateinit var newsRVAdapter: NewsRVAdapter
    private lateinit var loadingPB: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val actionBar = supportActionBar
        actionBar?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this,
            R.color.nav_color
        )))

        NewsRV = findViewById(R.id.idRVNews)
        CategoryRV = findViewById(R.id.idRVCategories)
        loadingPB = findViewById(R.id.loadingPB)
        newsRVAdapter = NewsRVAdapter(articlesArrayList, this)
        categoryRVAdapter = CategoryRVAdapter(categoryRVModalArrayList, this, this)
        NewsRV.layoutManager = LinearLayoutManager(this)
        NewsRV.adapter = newsRVAdapter
        CategoryRV.adapter = categoryRVAdapter
        getCategories()
        getnews("All")
        newsRVAdapter.notifyDataSetChanged()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun getCategories() {
        categoryRVModalArrayList.add(
            CategoryRVModal(
                "Fundamental Rights",
                "https://www.pexels.com/photo/people-having-a-concert-1190297/"
            )

        )





        categoryRVAdapter.notifyDataSetChanged()
    }

    fun getnews(Category: String) {
        articlesArrayList.clear()

        val CategoryUrl =

            "https://newsapi.org/v2/everything?q=fundamental+rights+india+and+supreme+court&from=2023-02-28&sortBy=publishedAt&apiKey=80e71f59294440f5bbbf0abe3be8abf0"
        ////




        val URL = "https://newsapi.org"


        val retrofit = Retrofit.Builder()
            .baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RetroFitAPI::class.java)

        val retrofitdata = retrofit.getNewsByCategory(CategoryUrl)

//        val call: Call<NewsModal> = if (Category == "All")
//        {
//            retroFitAPI.getAllNews(Allurl)
//        } else {
//            retroFitAPI.getNewsByCategory(CategoryUrl)
//        }


        if (retrofitdata != null) {
            retrofitdata.enqueue(object : Callback<NewsModal?> {
                override fun onResponse(call: Call<NewsModal?>, response: Response<NewsModal?>) {
                    val newsModal = response.body()
                    val articles = newsModal!!.articles
                    for (i in articles.indices) {
                        articlesArrayList.add(
                            Articles(
                                articles[i].title,
                                articles[i].url,
                                articles[i].content,
                                articles[i].description,
                                articles[i].urlToImage
                            )
                        )
                    }
                    newsRVAdapter.notifyDataSetChanged()
                }

                override fun onFailure(call: Call<NewsModal?>, t: Throwable) {
                    Log.d("news","onFaliure"+t.message)

                }
            })
        }





    }

    override fun onCategoryClick(position: Int) {
        val cAtegory = categoryRVModalArrayList[position].getCategory()
        getnews(cAtegory)
    }
}