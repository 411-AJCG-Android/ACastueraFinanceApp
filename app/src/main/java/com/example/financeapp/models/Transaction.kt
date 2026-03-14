package com.example.financeapp.models

data class Transaction (
    val nombre: String,
    val categoria: String,
    val monto: Double,
    val hora: String
)

val transaccionList = listOf(
    Transaction(nombre = "Supermarket",categoria = "Groceries", monto = 45.99, hora = "10:30 AM"),
    Transaction(nombre = "Gas Station", categoria =  "Fuel", monto = -30.50, hora = "12:15 PM"),
    Transaction(nombre = "Coffee Shop", categoria = "Food and Drinks", monto = 5.75, hora = "8:00 AM"),
    Transaction(nombre = "Electronics Store", categoria = "Electronics", monto = -120.00, hora = "3:45 PM"),
    Transaction(nombre = "Bookstore", categoria = "Books", monto = 22.50, hora = "11:00 AM"),
    Transaction(nombre = "Restaurant", categoria = "Dining", monto = 68.30, hora = "7:30 PM"),
    Transaction(nombre = "Supermarket", categoria = "Groceries", monto = 45.99, hora = "10:30 AM"),
    Transaction(nombre = "Gas Station", categoria =  "Fuel", monto = -30.50, hora = "12:15 PM"),
    Transaction(nombre = "Coffee Shop", categoria = "Food and Drinks", monto = 5.75, hora = "8:00 AM"),
    Transaction(nombre = "Electronics Store", categoria = "Electronics", monto = -120.00, hora = "3:45 PM"),
    Transaction(nombre = "Bookstore", categoria = "Books", monto = 22.50, hora = "11:00 AM"),
)