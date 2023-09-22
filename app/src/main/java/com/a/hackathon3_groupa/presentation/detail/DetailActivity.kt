package com.a.hackathon3_groupa.presentation.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.a.hackathon3_groupa.databinding.ActivityDetailBinding
import com.a.hackathon3_groupa.model.ProductResponse

class DetailActivity : AppCompatActivity() {
    companion object{
        private const val PRODUCT_DETAIL = "PRODUCT_DETAIL"

        fun navigate(
            context: Context,
            product: ProductResponse,
        ) = with(context) {
            startActivity(
                Intent(this, DetailActivity::class.java).apply {
                    putExtra(PRODUCT_DETAIL, product)
                }
            )
        }
    }
    private val binding : ActivityDetailBinding by lazy {
        ActivityDetailBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.tvItemPrice.text = "IDR $productPrice"
        binding.tvQuantity.text = quantity.toString()
        binding.btnPlus.setOnClickListener {
            increaseQuantity()
        }

        binding.btnMinus.setOnClickListener {
            decreaseQuantity()
        }
    }
    private fun increaseQuantity() {
        if (quantity < 10) { // Batasan jumlah maksimal (misalnya, 10)
            quantity++
            updatePrice()
        }
    }

    private fun decreaseQuantity() {
        if (quantity > 1) { // Jumlah minimum adalah 1
            quantity--
            updatePrice()
        }
    }

    private fun updatePrice() {
        val totalPrice = productPrice * quantity
        binding.tvQuantity.text = quantity.toString()
        binding.tvItemPrice.text = "IDR $totalPrice"
    }
    private var quantity = 1 // Jumlah awal produk
    private val productPrice = 18000 // Harga produk

}
