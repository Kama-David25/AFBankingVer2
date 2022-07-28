package com.example.afbanking.Model.data.network

import com.example.afbanking.Model.data.repos.ITransactionRepo
import com.example.afbanking.Model.domain.model.UserDto
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

interface AFBankApi: ITransactionRepo {

    @GET("/bankUser/{userId}")
    suspend fun getUserByRoutNum(@Path("userId") userId: String): UserDto

    suspend fun depositByID(@Path("userId") userId: String)
    override suspend fun getUserByRoutingNum(routingNumber: String): UserDto {
        TODO("Not yet implemented")
    }

    @PUT("/bankUser/{userId}")
    override suspend fun depositById(@Path("userID")routingNumber: String, amount: Double) {
        TODO("Not yet implemented")
    }

    override suspend fun withdrawById(routingNumber: String, amount: Double) {
        TODO("Not yet implemented")
    }

    override suspend fun updateAccountBalance(oldAmount: Double, newAmount: Double) {
        TODO("Not yet implemented")
    }
}