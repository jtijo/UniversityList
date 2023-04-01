package com.example.universityinfo.data.api

import com.example.universityinfo.data.response.UniversityListResponseModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("search")
    suspend fun getUniversityListByCountry(@Query("country") country: String): List<UniversityListResponseModel>
}