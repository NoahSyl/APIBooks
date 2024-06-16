package com.example.apibooks2.viewModel

import androidx.lifecycle.ViewModel
import com.example.apibooks2.model.Book
import com.example.apibooks2.repository.BookRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class BookViewModel @Inject constructor(
    private val repo: BookRepository
) : ViewModel() {

    private val _books = MutableStateFlow<List<Book>>(emptyList()) //lista de libros
    val books: StateFlow<List<Book>> = _books

    suspend fun searchBooks(query: String) {
        val result = repo.searchBooks(query)
        _books.value = result
    }

}