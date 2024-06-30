package com.example.mbankingapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mbankingapp.R
import com.example.mbankingapp.rcViews.AccountRecyclerView
import com.example.mbankingapp.rcViews.RecentTransactionsRecyclerView

@Composable
fun AllTransactionsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.back_button),
                contentDescription = "Back",
                modifier = Modifier
                    .size(24.dp)
                    .padding(top = 6.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "All transactions",
                color = Color.White,
                fontSize = 17.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Image(
                painter = painterResource(id = R.drawable.filter_icon),
                contentDescription = "Filter",
                modifier = Modifier
                    .size(24.dp)
                    .padding(top = 6.dp)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            shape = MaterialTheme.shapes.medium,
            modifier = Modifier
                .background(Color.Black)
                .fillMaxWidth()
        ) {
            RecentTransactionsRecyclerView()
        }
    }
}

