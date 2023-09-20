package com.a.hackathon3_groupa.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProductResponse(
    val no : Int,
    val name : String,
    val price : Double,
    val weight : Int,
    val supplier : String,
    val rating : Double,
    val desc : String,
    val imageUrl : String
) : Parcelable
