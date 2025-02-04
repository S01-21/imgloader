package com.example.app.domain.api

import com.example.app.domain.model.CategoryResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface SoopLiveApi {
    @GET("api.php")
    suspend fun getCategories(
        @Query("m") m: String = "categoryList",
        @Query("szOrder") szOrder: String = "view_cnt",
        @Query("nPageNo") nPageNo: Int = 1,
        @Query("nListCnt") nListCnt: Int = 120
        ): CategoryResponse
}