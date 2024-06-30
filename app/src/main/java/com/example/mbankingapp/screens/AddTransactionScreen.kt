package com.example.mbankingapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.layoutId
import com.example.mbankingapp.customFields.CustomButton
import com.example.mbankingapp.customFields.EditableField
import com.example.mbankingapp.customFields.RegularText
import com.example.mbankingapp.customFields.TitleText
import com.example.mbankingapp.ui.theme.Amount
import com.example.mbankingapp.ui.theme.AmountEditText
import com.example.mbankingapp.ui.theme.ButtonOkay
import com.example.mbankingapp.ui.theme.DateEditText
import com.example.mbankingapp.ui.theme.TrApllEditText
import com.example.mbankingapp.ui.theme.TrApplied
import com.example.mbankingapp.ui.theme.TrDate
import com.example.mbankingapp.ui.theme.TrNumber
import com.example.mbankingapp.ui.theme.TrNumberEditText
import com.example.mbankingapp.ui.theme.TrStatus
import com.example.mbankingapp.ui.theme.TrStatusEditText
import com.example.mbankingapp.ui.theme.Transaction

@Composable
fun AddTransactionScreen() {
    MaterialTheme {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
                .padding(24.dp),
            constraintSet = ConstraintSet {
                val transaction = createRefFor(Transaction)
                val trApplied = createRefFor(TrApplied)
                val trApplEditText = createRefFor(TrApllEditText)
                val trNumber = createRefFor(TrNumber)
                val trNumberEditText = createRefFor(TrNumberEditText)
                val trDate = createRefFor(TrDate)
                val dateEditText = createRefFor(DateEditText)
                val trStatus = createRefFor(TrStatus)
                val trStatusEditText = createRefFor(TrStatusEditText)
                val amount = createRefFor(Amount)
                val amountEditText = createRefFor(AmountEditText)
                val button = createRefFor(ButtonOkay)

                constrain(transaction) {
                    top.linkTo(parent.top, margin = 12.dp)
                }
                constrain(trApplied) {
                    top.linkTo(transaction.bottom, margin = 32.dp)
                    start.linkTo(transaction.start)
                }
                constrain(trApplEditText) {
                    top.linkTo(trApplied.bottom, margin = 8.dp)
                    start.linkTo(trApplied.start)
                }
                constrain(trNumber) {
                    top.linkTo(trApplEditText.bottom, margin = 16.dp)
                    start.linkTo(parent.start)
                }
                constrain(trNumberEditText) {
                    top.linkTo(trNumber.bottom, margin = 8.dp)
                    start.linkTo(parent.start)
                }
                constrain(trDate) {
                    top.linkTo(trNumberEditText.bottom, margin = 16.dp)
                    start.linkTo(parent.start)
                }
                constrain(dateEditText) {
                    top.linkTo(trDate.bottom, margin = 8.dp)
                    start.linkTo(parent.start)
                }
                constrain(trStatus) {
                    top.linkTo(dateEditText.bottom, margin = 16.dp)
                    start.linkTo(parent.start)
                }
                constrain(trStatusEditText) {
                    top.linkTo(trStatus.bottom, margin = 8.dp)
                    start.linkTo(parent.start)
                }
                constrain(amount) {
                    top.linkTo(trStatusEditText.bottom, margin = 16.dp)
                    start.linkTo(parent.start)
                }
                constrain(amountEditText) {
                    top.linkTo(amount.bottom, margin = 8.dp)
                    start.linkTo(parent.start)
                }
                constrain(button) {
                    top.linkTo(amountEditText.bottom, margin = 32.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            }
        ) {
            TitleText("Transaction", Modifier.layoutId(Transaction))
            RegularText("Transaction was applied in", Modifier.layoutId(TrApplied))
            EditableField("", false, Modifier.layoutId(TrApllEditText) )
            RegularText("Transaction number", Modifier.layoutId(TrNumber))
            EditableField("",false, Modifier.layoutId(TrNumberEditText))
            RegularText("Date", Modifier.layoutId(TrDate))
            EditableField("",false, Modifier.layoutId(DateEditText))
            RegularText("Transaction status", Modifier.layoutId(TrStatus))
            EditableField("",false, Modifier.layoutId(TrStatusEditText))
            RegularText("Amount", Modifier.layoutId(Amount))
            EditableField("",false, Modifier.layoutId(AmountEditText))
            CustomButton("Okay", Modifier.layoutId(ButtonOkay))
        }
    }
}

