package com.example.app.domain.repository

import com.example.app.domain.api.RetrofitCllient
import com.example.app.domain.model.CategoryItem

class CategoryRepository {
    suspend fun fetchCategories(): List<CategoryItem> {
        return try {
            RetrofitCllient.api.getCategories().data.categories
        } catch (e: Exception) {
            e.printStackTrace()
            emptyList()
        }
    }
}