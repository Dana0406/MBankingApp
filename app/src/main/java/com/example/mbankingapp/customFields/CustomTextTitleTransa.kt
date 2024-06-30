package com.example.mbankingapp.customFields

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun TitleText(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        color = Color.White,
        fontSize = 28.sp,
        modifier = modifier
    )
}