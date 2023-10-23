package com.example.challenge5fn

import android.app.Application
import androidx.room.Room
import com.example.challenge5fn.database.AppDatabase
import com.google.firebase.database.FirebaseDatabase

class MyApplication : Application() {
    companion object {
        lateinit var database: AppDatabase
        lateinit var firebaseDatabase: FirebaseDatabase
    }

    override fun onCreate() {
        super.onCreate()

        // Inisialisasi database Room
        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "app-database"
        ).build()

        // Inisialisasi Firebase Realtime Database
        firebaseDatabase = FirebaseDatabase.getInstance()
    }
}