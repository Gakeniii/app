package com.example.newsprojectpractice.api

import com.example.newsprojectpractice.models.NewsResponse
import com.example.newsprojectpractice.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET

interface NewAPI{
    @GET("v2/top-headlines")
    suspend fun getHeadlines(
            @retrofit2.http.Query("country")
            countryCode: String = "us",
            @retrofit2.http.Query("page")
            pageNumber: Int = 1,
            @retrofit2.http.Query("apiKey")
            apiKey: String = API_KEY
    ): Response<NewsResponse>
    @GET("v2/everything")
    suspend fun searchForNews(
        @retrofit2.http.Query("q")
        searchQuery: String,
        @retrofit2.http.Query("page")
        pageNumber: Int = 1,
        @retrofit2.http.Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsResponse>

}