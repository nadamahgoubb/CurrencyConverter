package com.nada.currencyconverter.domain.useCase

import com.nada.currencyconverter.base.BaseResponse
import com.nada.currencyconverter.base.BaseUseCase
import com.nada.currencyconverter.base.DevResponse
import com.nada.currencyconverter.base.NetworkResponse
import com.nada.currencyconverter.data.repo.Repository
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@ViewModelScoped
class HomeUseCase @Inject constructor(private val repository: Repository) :
    BaseUseCase<DevResponse<Any>, Any>() {


    override fun executeRemote(params: Any?): Flow<NetworkResponse<DevResponse<Any>, BaseResponse>> {

        return  flow {
                emit(null)
            } as Flow<NetworkResponse<DevResponse<Any>, BaseResponse>>


    }
}


