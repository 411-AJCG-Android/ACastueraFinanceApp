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
import com.example.financeapp.components.Header
import com.example.financeapp.ui.theme.FinanceAppTheme


@Composable
fun HomeScreen(
    innerPadding: PaddingValues
) {
    val colors = MaterialTheme.colorScheme

    Column(
        modifier = Modifier
            .fillMaxWidth()
            //.background(colors.tertiaryContainer)
            .padding(innerPadding)
    ) {
        Header(innerPadding)
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
