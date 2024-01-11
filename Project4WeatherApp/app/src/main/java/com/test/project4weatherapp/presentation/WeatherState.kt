package com.test.project4weatherapp.presentation

import com.test.project4weatherapp.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean =false,
    val error: String? =null
) {
}