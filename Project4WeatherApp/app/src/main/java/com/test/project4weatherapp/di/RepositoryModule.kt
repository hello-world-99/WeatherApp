package com.test.project4weatherapp.di

import com.test.project4weatherapp.data.location.DefaultLocationTracker
import com.test.project4weatherapp.data.repository.WeatherRepositoryImpl
import com.test.project4weatherapp.domain.location.LocationTracker
import com.test.project4weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindWeatherRepository(weatherRepositoryImpl: WeatherRepositoryImpl): WeatherRepository
}