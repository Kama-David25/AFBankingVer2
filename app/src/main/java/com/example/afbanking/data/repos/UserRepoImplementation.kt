package com.example.afbanking.data.repos

import com.example.afbanking.data.network.AFBankApi
import javax.inject.Inject

class UserRepoImplementation @Inject constructor(
    private val apiCall: AFBankApi
){

}