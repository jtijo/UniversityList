package com.example.universityinfo.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "country_entity")
data class CountryEntity(
    @PrimaryKey(autoGenerate = true)
    val _id : Long,
    val countryName : String,
    val searchKeyword : String
)
