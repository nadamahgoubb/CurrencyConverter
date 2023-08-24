package com.nada.currencyconverter.data.repo

import com.nada.currencyconverter.data.remote.ApiInterface
import javax.inject.Inject

class Repository @Inject constructor(private val api: ApiInterface) {
}