package com.example.mbankingapp.customFields

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun EditableField(value: String, modifier: Modifier = Modifier) {
    BasicTextField(
        value = remember { value },
        onValueChange = {},
        textStyle = TextStyle(color = Color.White),
        cursorBrush = SolidColor(Color.White),
        modifier = modifier
            .background(Color.Black, shape = RoundedCornerShape(8.dp))
            .border(1.dp, Color.White, shape = RoundedCornerShape(8.dp))
            .padding(8.dp)
            .height(32.dp)
            .fillMaxWidth()
    )
}