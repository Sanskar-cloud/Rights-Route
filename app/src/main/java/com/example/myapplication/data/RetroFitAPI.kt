package com.example.myapplication.data


import com.example.myapplication.view.activities.news.NewsModal
import retrofit2.http.GET
import retrofit2.http.Url

interface RetroFitAPI {
    @GET
    fun getAllNews(@Url url: String?): retrofit2.Call<NewsModal?>?

    @GET
    fun getNewsByCategory(@Url url: String?): retrofit2.Call<NewsModal?>?
}