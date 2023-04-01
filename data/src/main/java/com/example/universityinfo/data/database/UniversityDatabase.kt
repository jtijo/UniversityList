package com.example.universityinfo.data.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class UniversityDatabase : RoomDatabase() {

    abstract fun universityDao(): UniversityDao

    companion object {

        private var INSTANCE: UniversityDatabase? = null

        fun getUniversityDatabase(context: Context): UniversityDatabase? {
            if (INSTANCE == null) {
                synchronized(UniversityDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        UniversityDatabase::class.java,
                        "university_db"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE
        }
    }
}