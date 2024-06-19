package com.example.apibooks2.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.apibooks2.model.Book
import com.example.apibooks2.viewModel.BookViewModel

@Composable
fun BookList(viewModel: BookViewModel) {
    val books by viewModel.books.collectAsState()
    val query = remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = query.value,
            onValueChange = { query.value = it },
            label = { Text("Search Books") },
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Button(
            onClick = { viewModel.searchBooks(query.value) },
            modifier = Modifier.padding(bottom = 16.dp)
        ) {
            Text("Search")
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {
            items(books) { book ->
                BookItem(book = book)
            }
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
    }
}