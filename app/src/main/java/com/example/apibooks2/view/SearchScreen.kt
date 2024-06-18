package com.example.apibooks2.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.apibooks2.model.Book
import com.example.apibooks2.viewModel.BookViewModel

@Composable
fun BookList(viewModel: BookViewModel) {
    val books by viewModel.books.collectAsState(emptyList())
    

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            items(books) { book ->
                BookItem(book = book)
            }
        }
    }




@Composable
fun BookItem(book: Book) {
    Column(
        modifier = Modifier
            .padding(8.dp)
    ) {

        Text(text = "Title: ${book.title}")

        // Add other fields from the Book model as needed
    }
}
