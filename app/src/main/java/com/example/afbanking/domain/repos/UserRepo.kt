package com.example.afbanking.domain.repos

import com.example.afbanking.data.network.dto.UserDto

interface UserRepo {
    suspend fun getUserByRNum(routingNum: String): UserDto
    suspend fun depositById(routingNum: String, amount: Double): Double
    suspend fun withdrawById(routingNum: String, amount: Double): Double
}