package com.example.app.domain.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitCllient{
    private const val BASE_URL = "https://sch.sooplive.co.kr/"

    val api : SoopLiveApi by lazy{
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SoopLiveApi::class.java)
    }
}