package com.nada.currencyconverter.presentation.fragments.home


import android.app.Application
import com.nada.currencyconverter.base.BaseViewModel
import com.nada.currencyconverter.domain.useCase.HomeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(app: Application, val useCase: HomeUseCase) :
    BaseViewModel<HomeAction>(app) {

}
