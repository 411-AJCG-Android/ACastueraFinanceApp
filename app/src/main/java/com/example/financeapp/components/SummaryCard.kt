package com.example.financeapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.financeapp.models.SummaryCard
import com.example.financeapp.ui.theme.CarneClaro
import com.example.financeapp.ui.theme.DarkText
import com.example.financeapp.ui.theme.FinanceAppTheme
import com.example.financeapp.ui.theme.GrayText
import com.example.financeapp.ui.theme.LightGreenish
import com.example.financeapp.ui.theme.LightPurple

@Composable
fun Cards(
    card: List<SummaryCard>,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(220.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        CardGrande(
            card = card[0],
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CardPequeña(
                card = card[1],
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            )
            CardPequeña(
                card = card[2],
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            )
        }
    }
}

@Composable
fun CardGrande(
    card: SummaryCard,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = card.color),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = "Activity Icon",
                    modifier = Modifier.size(36.dp),
                    tint = DarkText
                )
                Text(
                    text = card.title,
                    style = typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                    color = DarkText
                )
                Text(
                    text = "de la Semana",
                    fontSize = 12.sp,
                    color = GrayText
                )
            }
        }
    }
}

@Composable
fun CardPequeña(
    card: SummaryCard,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = card.color),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = card.title,
                    style = typography.bodyLarge,
                    color = GrayText
                )
                Text(
                    text = "$${card.amount}",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = DarkText
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSummaryCards() {
    val cards = listOf(
        SummaryCard("Actividad", 0.0, LightGreenish),
        SummaryCard("Ventas", 280.99, CarneClaro),
        SummaryCard("Ganancias", 280.99, LightPurple)
    )
    FinanceAppTheme {
        Cards(
            card = cards,
            modifier = Modifier.padding(top = 34.dp, start = 16.dp, end = 16.dp)
        )
    }
}