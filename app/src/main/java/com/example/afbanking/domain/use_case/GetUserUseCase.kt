package com.example.afbanking.domain.use_case

import com.example.afbanking.common.Resource
import com.example.afbanking.data.network.dto.toUser
import com.example.afbanking.domain.model.User
import com.example.afbanking.domain.repos.UserRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetUserUseCase @Inject constructor(
    private val uR: UserRepo
){
    operator fun invoke(routingNum: String): Flow<Resource<User>> = flow{
        try {
            emit(Resource.Loading())
            val user = uR.getUserByRNum(routingNum).toUser()
            emit(Resource.Success(user))
        }catch(e: HttpException){
            emit(Resource.Error(e.localizedMessage ?: "Unexpected Error."))
        }catch(e: IOException){
            emit(Resource.Error("Error! Check Connection."))
        }
    }
}