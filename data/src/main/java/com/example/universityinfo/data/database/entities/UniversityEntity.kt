package com.example.universityinfo.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "university_entity")
data class UniversityEntity(
    @PrimaryKey(autoGenerate = true)
    val _id : Long,
    val name : String,

)
