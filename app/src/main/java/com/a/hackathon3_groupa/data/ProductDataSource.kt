package com.a.hackathon3_groupa.data

import com.a.hackathon3_groupa.model.ProductResponse

interface ProductDataSource {
    fun getProductData() : List<ProductResponse>
}

class ProductDataSourceImpl : ProductDataSource {
    override fun getProductData(): List<ProductResponse> {
        return  mutableListOf(
            ProductResponse(
                no = 1,
                name = "Banana",
                price =  18000.00,
                weight = 1,
                supplier = "Banana Farm",
                rating = 4.9,
                desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                imageUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_banana.jpg"
            ),
            ProductResponse(
                no = 2,
                name = "Apple",
                price =  19000.00,
                weight = 1,
                supplier = "Apple Farm",
                rating = 4.8,
                desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                imageUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_apple.jpg"
            ),
            ProductResponse(
                no = 3,
                name = "Onion",
                price =  12000.00,
                weight = 1,
                supplier = "Onion Farm",
                rating = 4.6,
                desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                imageUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_onion.jpg"
            ),
            ProductResponse(
                no = 4,
                name = "Spinach",
                price =  12000.00,
                weight = 1,
                supplier = "Spinach Farm",
                rating = 5.0,
                desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                imageUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_spinach.jpg"
            ),
            ProductResponse(
                no = 5,
                name = "Pineapple",
                price =  12000.00,
                weight = 1,
                supplier = "Pineapple Farm",
                rating = 4.0,
                desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                imageUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_pineapple.jpg"
            ),
            ProductResponse(
                no = 6,
                name = "Cabbage",
                price =  14000.00,
                weight = 1,
                supplier = "Cabbage Farm",
                rating = 4.7,
                desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                imageUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_cabbage.jpg"
            ),
            ProductResponse(
                no = 7,
                name = "Carrot",
                price =  10000.00,
                weight = 1,
                supplier = "Carrot Farm",
                rating = 4.6,
                desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                imageUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_carrot.jpg"
            ),
            ProductResponse(
                no = 8,
                name = "Potato",
                price =  11000.00,
                weight = 1,
                supplier = "Carrot Farm",
                rating = 4.4,
                desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                imageUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_potato.jpg"
            ),
            ProductResponse(
                no = 9,
                name = "Lemon",
                price =  8000.00,
                weight = 1,
                supplier = "Lemon Farm",
                rating = 4.6,
                desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                imageUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_lemon.jpg"
            ),
            ProductResponse(
                no = 10,
                name = "Pumpkin",
                price =  21000.00,
                weight = 1,
                supplier = "Pumpkin Farm",
                rating = 4.7,
                desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                imageUrl = "https://raw.githubusercontent.com/hermasyp/CH3-asset-code-challenge/master/product_image/img_product_pumpkin.jpg"
            ),
        )
    }

}