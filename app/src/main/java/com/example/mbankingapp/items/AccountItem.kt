package com.example.mbankingapp.items

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mbankingapp.R
import com.example.mbankingapp.ui.theme.AccountDetail
import com.example.mbankingapp.ui.theme.AccountName
import com.example.mbankingapp.ui.theme.AccountNumber
import com.example.mbankingapp.ui.theme.BackgroundGrey
import com.example.mbankingapp.ui.theme.TextGrey

@Composable
fun AccountItem(
    showForwardIcon: Boolean = true
) {
    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(BackgroundGrey)
                .padding(16.dp),
            verticalAlignment = Alignment.Top
        ) {
            Box(
                modifier = Modifier
                    .size(width = 40.dp, height = 16.dp)
                    .padding(8.dp)
                    .background(Color.White)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = AccountName,
                    fontSize = 15.sp,
                    color = Color.White
                )
                Text(
                    text = AccountNumber,
                    fontSize = 13.sp,
                    color = TextGrey
                )
                Text(
                    text = AccountDetail,
                    fontSize = 13.sp,
                    color = TextGrey
                )
            }

            if (showForwardIcon) {
                Icon(
                    painter = painterResource(id = R.drawable.forward),
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .align(Alignment.CenterVertically)
                )
            }
        }
    }
}