package com.example.afbanking.model.data.network

import com.example.afbanking.model.domain.model.UserDto
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path


const val BASE_URL = "http://localhost:3000/"

interface AFBankApiRequest{

    @GET("/bankUser/{userId}")
    suspend fun getUserByRoutingNum(@Path("userId")routingNumber: String): UserDto

    @PUT("/bankUser/{id}")
    suspend fun depositById(@Path("userID") amount: Double) {
    }
}