package com.example.app.domain.model

import com.google.gson.annotations.SerializedName

data class CategoryResponse(
    @SerializedName("result") val result: Int,
    @SerializedName("data") val data: CategoryData
)

data class CategoryData(
    @SerializedName("is_more") val isMore: Boolean,
    @SerializedName("offset") val offset: Int,
    @SerializedName("list") val categories: List<CategoryItem>
)

data class CategoryItem(
    @SerializedName("category_no") val categoryNo: String,
    @SerializedName("category_name") val categoryName: String,
    @SerializedName("view_cnt") val viewCount: Int,
    @SerializedName("fixed_tags") val fixedTags: List<String>,
    @SerializedName("cate_img") val categoryImage: String
)