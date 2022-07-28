package com.example.afbanking.Model.data.repos

import com.example.afbanking.Model.domain.model.UserDto

interface ITransactionRepo {
    suspend fun getUserByRoutingNum(routingNumber: String): UserDto
    suspend fun depositById(routingNumber: String, amount: Double)
    suspend fun withdrawById(routingNumber: String, amount: Double)
    suspend fun updateAccountBalance(oldAmount: Double, newAmount: Double)
}