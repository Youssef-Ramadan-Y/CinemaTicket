package com.example.cinemamovietickets.ui.screens.ticket.ticket_composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinemamovietickets.ui.composable.Circle

@Composable
fun ChairState(
    text: Int = 0,
    circleTint: Color
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Circle(tint = circleTint, modifier = Modifier.padding(end = 12.dp))
        Text(text = stringResource(text), fontSize = 12.sp, color = Color.Gray)
    }
}