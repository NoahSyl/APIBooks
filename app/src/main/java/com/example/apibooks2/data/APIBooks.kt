package com.example.apibooks2.data

import com.example.apibooks2.model.BookResponse
import com.example.apibooks2.util.Constants.Companion.ENDPOINT
import retrofit2.http.GET
import retrofit2.http.Query


interface APIBooks {

    @GET(ENDPOINT)
    suspend fun searchBook(@Query("q") query: String): BookResponse

}