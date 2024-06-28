package com.example.mbankingapp.rcViews

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mbankingapp.items.TransactionItem


@Composable
fun RecentTransactionsRecyclerView() {
    LazyColumn(
        modifier = Modifier.fillMaxWidth()
    ) {
        items(4) {
            TransactionItem()
        }
    }
}

@Preview
@Composable
fun PreviewRecentTransactionsRecyclerView() {
    RecentTransactionsRecyclerView()
}