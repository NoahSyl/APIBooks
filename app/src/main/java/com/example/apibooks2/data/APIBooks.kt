package com.example.apibooks2.data


interface APIBooks {

    @GET(ENDPOINT)
    suspend fun searchBook(@Query("q") query: String): BookResponse

}