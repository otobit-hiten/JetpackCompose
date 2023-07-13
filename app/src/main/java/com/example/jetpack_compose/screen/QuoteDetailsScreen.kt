package com.example.jetpack_compose.screen

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose.DataManager
import com.example.jetpack_compose.model.Quote

@Composable
fun QuoteDetails(quote: Quote) {

    
    BackHandler() {
        DataManager.switchPage(null)
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize(1f)) {

        Card(
            modifier = Modifier.padding(32.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier= Modifier
                    .padding(16.dp, 24.dp)
                    .fillMaxWidth(1f)
            ) {
                Image(imageVector = Icons.Filled.Favorite, contentDescription = "", modifier = Modifier.size(50.dp))
                Text(text = quote.quote.toString(), modifier = Modifier.fillMaxWidth(1f))
                Text(text = quote.author.toString(), modifier = Modifier.fillMaxWidth(1f))
            }
        }

    }
}