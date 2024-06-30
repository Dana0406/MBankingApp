package com.example.mbankingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mbankingapp.screens.AccountScreen
import com.example.mbankingapp.screens.AddTransactionScreen
import com.example.mbankingapp.screens.AllTransactionsScreen
import com.example.mbankingapp.screens.FilterScreen
import com.example.mbankingapp.screens.SelectAccountScreen
import com.example.mbankingapp.ui.theme.MBankingAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MBankingAppTheme {
                FilterScreen()
            }
        }
    }
}

