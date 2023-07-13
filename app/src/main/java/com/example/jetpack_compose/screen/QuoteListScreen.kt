package com.example.jetpack_compose.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose.model.Quote

@Composable
fun QuoteListScreen(data: Array<Quote>, onClick: (quote:Quote) -> Unit){

    Column() {
        Text(text = "Quotes", style = MaterialTheme.typography.titleLarge, modifier = Modifier.padding(20.dp))
        QuoteList(data = data,onClick)
    }
}