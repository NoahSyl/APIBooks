package com.example.apibooks2.repository

import com.example.apibooks2.data.APIBooks
import com.example.apibooks2.model.Book
import javax.inject.Inject

/*TODO: añadir controles de respuesta*/

class BookRepository @Inject constructor(
    private val api: APIBooks
) {
    suspend fun searchBooks(query: String): List<Book> {
        val response = api.searchBook(query)
        return response.docs
    }
}