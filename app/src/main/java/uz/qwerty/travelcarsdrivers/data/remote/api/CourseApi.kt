package uz.qwerty.travelcarsdrivers.data.remote.api

import retrofit2.Response
import retrofit2.http.GET
import uz.qwerty.travelcarsdrivers.data.remote.response.course.CurrencyItem
import uz.qwerty.travelcarsdrivers.domain.models.NewCurrencyResponse


/**
 * Created by Abdurashidov Shahzod on 24/12/21 21:35.
 * company QQBank
 * shahzod9933@gmail.com
 */

interface CourseApi {

    @GET("json/")
    suspend fun getNewCurrency(): Response<List<CurrencyItem>>

    @GET("json/")
    suspend fun getAllCourse(): Response<NewCurrencyResponse>

    @GET("json/")
    suspend fun getCurrency(): Response<List<CurrencyItem>>

    @GET("json/")
    suspend fun newCurrency(): Response<List<NewCurrencyResponse>>

}