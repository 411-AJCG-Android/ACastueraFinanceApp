package com.example.financeapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.financeapp.models.User
import com.example.financeapp.ui.theme.CarneClaro
import com.example.financeapp.ui.theme.GrayText

@Composable
fun Header(user: User) {
    val colors = MaterialTheme.colorScheme
    val typography = MaterialTheme.typography

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, start = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = { },
                modifier = Modifier
                    .clip(CircleShape)
                    .background(CarneClaro)
            ) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "profile",
                    tint = colors.onBackground,
                    modifier = Modifier.size(48.dp)

                )
            }
            Column(
                modifier = Modifier
                    .padding(start = 12.dp)
                    .weight(1f)
            ) {
                Text(
                    text = "Hola ${user.nombre}",
                    style = typography.titleLarge.copy(fontWeight = FontWeight.Bold, fontSize = typography.titleLarge.fontSize * 1.1f),
                    color = colors.onSurface
                )
                Text(
                    text = "Bienvenido",
                    style = typography.bodyLarge,
                    color = GrayText
                )
            }
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "menu",
                    modifier = Modifier.size(28.dp),
                    tint = colors.onSurface
                )
            }
        }
    }
}
