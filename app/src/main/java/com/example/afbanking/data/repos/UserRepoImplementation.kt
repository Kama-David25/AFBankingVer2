package com.example.afbanking.data.repos

import com.example.afbanking.data.network.AFBankApi
import com.example.afbanking.data.network.dto.UserDto
import com.example.afbanking.data.network.dto.toUser
import com.example.afbanking.domain.repos.UserRepo
import javax.inject.Inject

class UserRepoImplementation @Inject constructor(
    private val apiCall: AFBankApi
): UserRepo{

    /**
     * Remember to call these methods in a coroutine
     **/

    override suspend fun getUserByRNum(routingNum: String): UserDto {
        return apiCall.getUserByRoutNum(routingNum)
    }

    //Takes in an amount and adds to current account balance
    override suspend fun depositById(routingNum: String, amount: Double): Double {
        val bu = getUserByRNum(routingNum).toUser()
        return bu.accountBalance + amount
    }

    //Takes in an amount and subtracts from current account balance
    override suspend fun withdrawById(routingNum: String, amount: Double): Double {
        val bu = getUserByRNum(routingNum).toUser()
        return bu.accountBalance - amount
    }
}