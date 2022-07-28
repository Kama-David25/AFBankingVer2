package com.example.afbanking.Model.data.network

import com.example.afbanking.Model.data.repos.ITransactionRepo
import com.example.afbanking.Model.domain.model.UserDto
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

interface AFBankApi{


    @GET("/bankUser/{userId}")
    suspend fun getUserByRoutingNum(routingNumber: String): UserDto

    @PUT("/bankUser/{id}")
    suspend fun depositById(@Path("userID")routingNumber: String, amount: Double) {
    }

    suspend fun withdrawById(routingNumber: String, amount: Double) {
    }

    suspend fun updateAccountBalance(oldAmount: Double, newAmount: Double) {
    }
}