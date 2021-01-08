package com.faircorp.model

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ApiServices {
    val windowsApiService : WindowApiService by lazy {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://dev-mind.fr/training/android/")
            .build()
            .create(WindowApiService::class.java)
    }
}
// could change to http://app-e5e8ad05-41c8-472a-94d8-b5374e07003c.cleverapps.io/api/
// but I do not have the same field to display: as so I have to change it