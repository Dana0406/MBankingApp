package com.example.mbankingapp.rcViews

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mbankingapp.items.AccountItem

@Composable
fun AccountRecyclerView() {
    LazyColumn(
        modifier = Modifier.fillMaxWidth()
    ) {
        items(1) {
            AccountItem()
        }
    }
}

@Preview
@Composable
fun PreviewAccountRecyclerView() {
    AccountRecyclerView()
}