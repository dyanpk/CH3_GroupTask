package com.a.hackathon3_groupa.presentation.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.a.hackathon3_groupa.data.ProductDataSourceImpl
import com.a.hackathon3_groupa.databinding.ActivityMainBinding
import com.a.hackathon3_groupa.presentation.detail.DetailActivity

class MainActivity : AppCompatActivity() {

    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        // TODO nanti ini dipindah ke click adapter ygy
        DetailActivity.navigate(this,     ProductDataSourceImpl().getProductData()[1])
        //id nya nanti sesuai item yang diklik, ini contoh cara pindah ke detail
    }
}