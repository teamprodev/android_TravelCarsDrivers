package uz.qwerty.travelcarsdrivers.presentation.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.qwerty.travelcarsdrivers.domain.repository.course.CourseRepository
import uz.qwerty.travelcarsdrivers.data.repository.currency.CourseRepositoryImpl
import uz.qwerty.travelcarsdrivers.data.repository.weather.WeatherRepositoryImpl
import uz.qwerty.travelcarsdrivers.domain.repository.weather.WeatherRepository


/**
 * Created by Abdurashidov Shahzod on 24/12/21 22:14.
 * company
 * shahzod9933@gmail.com
 */
@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    fun bindCourseRepository(courseRepositoryImpl: CourseRepositoryImpl): CourseRepository

    @Binds
    fun bindWeatherRepository(weatherRepositoryImpl: WeatherRepositoryImpl): WeatherRepository
}