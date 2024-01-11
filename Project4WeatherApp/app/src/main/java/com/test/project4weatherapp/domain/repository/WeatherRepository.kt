package com.test.project4weatherapp.domain.repository

import com.test.project4weatherapp.domain.util.Resource
import com.test.project4weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}