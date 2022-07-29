package com.example.afbanking.model.data.repos

import com.example.afbanking.model.domain.model.UserDto

interface ITransactionRepo {
    suspend fun getUserByRoutingNum(routingNumber: String): UserDto
    suspend fun depositById(routingNumber: String, amount: Double)
    suspend fun withdrawById(routingNumber: String, amount: Double)
    //suspend fun updateAccountBalance(oldAmount: Double, newAmount: Double)
}