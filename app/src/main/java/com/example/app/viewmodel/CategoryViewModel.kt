package com.example.app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.app.domain.model.CategoryItem
import com.example.app.domain.repository.CategoryRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CategoryViewModel : ViewModel() {
    private val repository = CategoryRepository()
    private val _categories = MutableStateFlow<List<CategoryItem>>(emptyList())
    val categories = _categories.asStateFlow()

    fun fetchCategories() {
        viewModelScope.launch {
            _categories.value = repository.fetchCategories()
        }
    }
}