package com.example.universityinfo.data.response

import com.google.gson.annotations.SerializedName

data class UniversityListResponseModel(
    @SerializedName("country") val country: String,
    @SerializedName("state-province") val state: String,
    @SerializedName("name") val universityName: String,
    @SerializedName("alpha_two_code") val countryCode: String,
    @SerializedName("web_pages") val websites: List<String>
)
