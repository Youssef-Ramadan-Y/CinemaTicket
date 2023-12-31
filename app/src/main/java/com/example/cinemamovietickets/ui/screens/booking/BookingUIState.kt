package com.example.cinemamovietickets.ui.screens.booking

import com.example.cinemamovietickets.data.model.MoviesModel

data class BookingUIState(
    val imageId: Int = 0,
    val movie : MoviesModel? = null,
    val isLoading: Boolean = false,
    val error: String = "",
)