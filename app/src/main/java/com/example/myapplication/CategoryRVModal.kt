package com.example.myapplication

class CategoryRVModal(private var Category: String, private var CategoryImageUrl: String) {

    fun getCategory(): String {
        return Category
    }

    fun setCategory(category: String) {
        Category = category
    }

    fun getCategoryImageUrl(): String {
        return CategoryImageUrl
    }

    fun setCategoryImageUrl(categoryImageUrl: String) {
        CategoryImageUrl = categoryImageUrl
    }
}
