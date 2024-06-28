package com.example.mbankingapp.items

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
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
import com.example.mbankingapp.ui.theme.BackgroundGrey
import com.example.mbankingapp.ui.theme.CompanyName
import com.example.mbankingapp.ui.theme.Data
import com.example.mbankingapp.ui.theme.Status
import com.example.mbankingapp.ui.theme.Summ
import com.example.mbankingapp.ui.theme.TextGrey

@Composable
fun TransactionItem() {
    Column {
        Card(
            shape = MaterialTheme.shapes.extraSmall,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(BackgroundGrey)
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = CompanyName,
                        fontSize = 17.sp,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = Data,
                        fontSize = 13.sp,
                        color = TextGrey
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = Status,
                        fontSize = 13.sp,
                        color = TextGrey
                    )
                }

               Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = Summ,
                        fontSize = 17.sp,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Icon(
                        painter = painterResource(id = R.drawable.forward),
                        contentDescription = null,
                        tint = Color.Unspecified
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(0.2.dp))

        Divider(
            color = TextGrey,
            modifier = Modifier
                .fillMaxWidth()
                .height(0.2.dp)
                .padding(horizontal = 16.dp)
                .background(TextGrey)
        )
    }
}