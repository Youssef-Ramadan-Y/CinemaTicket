package com.example.cinemamovietickets.ui.screens.home.home_composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.cinemamovietickets.ui.composable.OutlineButton
import com.example.cinemamovietickets.ui.theme.Orange80


@Composable
fun AppBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 32.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        OutlineButton(modifier = Modifier.padding(end = 8.dp),
            text = "Now Showing",
            textColor = Color.White,
            buttonColor = Orange80
        ) {}
        OutlineButton(text = "Coming Soon", textColor = Color.White) {}
    }
}
