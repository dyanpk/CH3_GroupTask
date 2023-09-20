package com.a.hackathon3_groupa.data

import com.a.hackathon3_groupa.model.CategoryResponse

interface CategoryDataSource {
    fun getCategoryData() : List<CategoryResponse>
}

class CategoryDataSourceImpl : CategoryDataSource {
    override fun getCategoryData(): List<CategoryResponse> {
        return  mutableListOf(
            CategoryResponse(
                no = 1,
                name = "Groceries",
                imageUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/categories/ic_category_groceries.png"
            ),
            CategoryResponse(
                no = 1,
                name = "Fruits",
                imageUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/categories/ic_category_fruits.png"
            ),
            CategoryResponse(
                no = 1,
                name = "Spices",
                imageUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/categories/ic_category_spices.png"
            ),
            CategoryResponse(
                no = 1,
                name = "Herbs",
                imageUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/categories/ic_category_herbs.png"
            ),
            CategoryResponse(
                no = 1,
                name = "Seasoning",
                imageUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/categories/ic_category_seasoning.png"
            ),
            CategoryResponse(
                no = 1,
                name = "Meat",
                imageUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/categories/ic_category_meat.png"
            ),
        )
    }

}