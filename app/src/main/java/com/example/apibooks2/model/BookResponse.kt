package com.example.apibooks2.model

import com.google.gson.annotations.SerializedName

data class BookResponse(
    @SerializedName("docs") val docs: List<Book> //creamos una lista con los libros
)