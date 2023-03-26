package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.*
import com.example.myapplication.CategoryRVModal
import com.example.myapplication.NewsRVAdapter
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
                "Supreme Court",
                "https://www.pexels.com/photo/people-having-a-concert-1190297/"
            )
        )


        categoryRVAdapter.notifyDataSetChanged()
    }

    fun getnews(Category: String) {
        articlesArrayList.clear()

        val CategoryUrl =
            "https://gnews.io/api/v4/search?q=supreme+court+india&country=in&&apikey=169749425022e79418746ed5d09b260c"
        val URL = "https://gnews.io"


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