package com.example.apibooks2.model

import com.google.gson.annotations.SerializedName

data class Book(
    @SerializedName("title") val title: String //de momento nos da el título
)
