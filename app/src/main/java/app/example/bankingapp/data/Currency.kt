package app.example.bankingapp.data

import androidx.compose.ui.graphics.vector.ImageVector

data class Currency (
    val name: String,
    val buy: Float,
    val sale: Float,
    val icon: ImageVector
)