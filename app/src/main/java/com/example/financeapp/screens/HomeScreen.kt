package com.example.financeapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.financeapp.components.Cards
import com.example.financeapp.components.Header
import com.example.financeapp.components.TransactionsLists
import com.example.financeapp.models.SummaryCard
import com.example.financeapp.models.User
import com.example.financeapp.models.transaccionList
import com.example.financeapp.models.user
import com.example.financeapp.ui.theme.AzulBlanco
import com.example.financeapp.ui.theme.AzulBlancoGris
import com.example.financeapp.ui.theme.CarneClaro
import com.example.financeapp.ui.theme.FinanceAppTheme
import com.example.financeapp.ui.theme.LightGreenish
import com.example.financeapp.ui.theme.LightPurple

@Composable
fun HomeScreen(
    innerPadding: PaddingValues
) {
    val colors = MaterialTheme.colorScheme
    val cards = listOf(
        SummaryCard("Actividad", 0.0, LightGreenish),
        SummaryCard("Ventas", 280.99, CarneClaro),
        SummaryCard("Ganancias", 280.99, LightPurple)
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(AzulBlancoGris)
            .padding(innerPadding)
    ) {
        Header(user)

        Cards(
            card = cards,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 20.dp, end = 20.dp)
        )

        Column(modifier = Modifier.weight(1f)){
            TransactionsLists(transacciones = transaccionList)
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun HomeScreenPreview(){
    FinanceAppTheme() {
        HomeScreen(
            innerPadding = PaddingValues(0.dp)
        )
    }
}
