package com.example.afbanking.Model.data.repos.impl

import com.example.afbanking.Model.data.network.AFBankApi
import com.example.afbanking.Model.data.repos.ITransactionRepo
import com.example.afbanking.Model.domain.model.UserDto
import com.example.afbanking.Model.domain.model.toUser
import javax.inject.Inject

class UserRepoImplementation @Inject constructor(
    private val apiCall: AFBankApi
): ITransactionRepo{

    /**
     * Remember to call these methods in a coroutine
     **/

    suspend fun getUserByRNum(routingNum: String): UserDto {
        return apiCall.getUserByRoutNum(routingNum)
    }

    override suspend fun getUserByRoutingNum(routingNumber: String): UserDto {
        return apiCall.getUserByRoutNum(routingNumber)
    }

    //Takes in an amount and adds to current account balance
    override suspend fun depositById(routingNum: String, amount: Double) {
        val bu = getUserByRNum(routingNum).toUser()
        bu.accountBalance + amount
        //return apiCall.updateBalance()
    }

    //Takes in an amount and subtracts from current account balance
    override suspend fun withdrawById(routingNum: String, amount: Double){
        val bu = getUserByRNum(routingNum).toUser()
        //return bu.accountBalance - amount
    }

    override suspend fun updateAccountBalance(oldAmount: Double, newAmount: Double) {
    }
}