package com.example.universityinfo.data.database.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "website_entity",
    foreignKeys = arrayOf(
        ForeignKey(
            entity = UniversityEntity::class,
            parentColumns = arrayOf("_id"),
            childColumns = arrayOf("university_id"),
            onUpdate = ForeignKey.CASCADE,
            onDelete = ForeignKey.CASCADE
        )
    ),
    indices = arrayOf(Index(value = ["university_id"]))
)
data class WebsiteEntity(
    @PrimaryKey(autoGenerate = true)
    val _id: Long,
    val university_id: Long,
    val web_address: String
)
