package com.example.financeapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.financeapp.models.Transaction
import com.example.financeapp.models.transaccionList
import com.example.financeapp.ui.theme.FinanceAppTheme
import com.example.financeapp.ui.theme.GrayText

@Composable
fun TransactionsLists(transacciones: List<Transaction>) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text= "Transactions",
                fontSize= 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "See All",
                color = GrayText
            )
        }
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(bottom = 16.dp)
        ) {
            items(transacciones) { transaction ->
                TransactionI(transaction)
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewTransactionsList() {
    FinanceAppTheme {
        TransactionsLists(transacciones = transaccionList)
    }
}

