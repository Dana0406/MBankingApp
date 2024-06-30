package com.example.mbankingapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mbankingapp.customFields.CustomButton
import com.example.mbankingapp.customFields.EditableField
import com.example.mbankingapp.customFields.RegularText
import com.example.mbankingapp.ui.theme.Amount
import com.example.mbankingapp.ui.theme.TrApplied
import com.example.mbankingapp.ui.theme.TrNumber
import com.example.mbankingapp.ui.theme.TrStatus
import com.example.mbankingapp.ui.theme.Transaction

@Preview
@Composable
fun AddTransactionScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(24.dp)
    ) {
        Text(
            text = Transaction,
            fontSize = 28.sp,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(32.dp))
        RegularText(text = TrApplied)
        Spacer(modifier = Modifier.height(8.dp))
        EditableField(value = "")
        Spacer(modifier = Modifier.height(16.dp))
        RegularText(text = TrNumber)
        Spacer(modifier = Modifier.height(8.dp))
        EditableField(value = "")
        Spacer(modifier = Modifier.height(16.dp))
        RegularText(text = TrStatus)
        Spacer(modifier = Modifier.height(8.dp))
        EditableField(value = "")
        Spacer(modifier = Modifier.height(16.dp))
        RegularText(text = Amount)
        Spacer(modifier = Modifier.height(8.dp))
        EditableField(value = "")
        Spacer(modifier = Modifier.height(32.dp))
        CustomButton(text = "Okay")
    }
}

