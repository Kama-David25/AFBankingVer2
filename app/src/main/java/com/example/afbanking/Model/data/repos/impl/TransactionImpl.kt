package com.example.afbanking.Model.data.repos.impl

import com.example.afbanking.Model.data.network.AFBankApi
import com.example.afbanking.Model.data.repos.ITransactionRepo
import com.example.afbanking.Model.domain.model.UserDto
import com.example.afbanking.Model.domain.model.toUser
import javax.inject.Inject

class TransactionImpl @Inject constructor(
    private val apiCall: AFBankApi
): ITransactionRepo{

    /**
     * Remember to call these methods in a coroutine
     **/

    override suspend fun getUserByRoutingNum(routingNumber: String): UserDto {
        return apiCall.getUserByRoutingNum(routingNumber)
    }

    //Takes in an amount and adds to current account balance
    override suspend fun depositById(routingNum: String, amount: Double) {
        val bu = getUserByRoutingNum(routingNum).toUser()
        bu.accountBalance + amount
        //return apiCall.updateBalance()
    }

    //Takes in an amount and subtracts from current account balance
    override suspend fun withdrawById(routingNum: String, amount: Double){
        val bu = getUserByRoutingNum(routingNum).toUser()
        //return bu.accountBalance - amount
    }

    override suspend fun updateAccountBalance(oldAmount: Double, newAmount: Double) {
    }
}