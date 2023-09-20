package com.a.hackathon3_groupa.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CategoryResponse(
    val no : Int,
    val name : String,
    val imageUrl : String
) : Parcelable
