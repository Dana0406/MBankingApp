package com.example.mbankingapp.rcViews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mbankingapp.items.AccountItem

@Composable
fun AccountRecyclerView(showForwardIcon: Boolean = true) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(5) {
            if(showForwardIcon) AccountItem(true)
            else AccountItem(false)
        }
    }
}