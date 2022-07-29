package com.example.afbanking.model.data.network

import com.example.afbanking.model.domain.model.UserDto
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

interface AFBankApi{

    @GET("/bankUser/{userId}")
    suspend fun getUserByRoutingNum(@Path("userId")routingNumber: String): UserDto

    @PUT("/bankUser/{id}")
    suspend fun depositById(@Path("userID") amount: Double) {
    }
}