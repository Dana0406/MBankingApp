package com.example.mbankingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.mbankingapp.screens.AllTransactionsScreen
import com.example.mbankingapp.ui.theme.MBankingAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MBankingAppTheme {
                AllTransactionsScreen()
            }
        }
    }
}

