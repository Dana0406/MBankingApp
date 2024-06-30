package com.example.mbankingapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mbankingapp.customFields.CustomButton
import com.example.mbankingapp.customFields.EditableField
import com.example.mbankingapp.customFields.RegularText

@Composable
fun FilterScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(horizontal = 16.dp)
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .background(Color.Black, shape = RoundedCornerShape(16.dp))
                .padding(horizontal = 16.dp, vertical = 24.dp)
        ) {
            Text(
                text = "Filter by date",
                color = Color.White,
                fontSize = 34.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Column(modifier = Modifier.fillMaxWidth()) {
                Spacer(modifier = Modifier.height(8.dp))
                RegularText(text = "Start Date")
                Spacer(modifier = Modifier.height(8.dp))
                EditableField("", showCalendarIcon = true)
                Spacer(modifier = Modifier.height(16.dp))
                RegularText(text = "End Date")
                Spacer(modifier = Modifier.height(8.dp))
                EditableField("", showCalendarIcon = true)
                Spacer(modifier = Modifier.height(24.dp))
                CustomButton("Submit", Modifier.align(Alignment.CenterHorizontally))
            }
        }
    }
}