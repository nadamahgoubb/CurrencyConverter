package com.nada.currencyconverter.presentation.fragments.home

import com.nada.currencyconverter.base.Action


sealed class HomeAction() : Action {

    data class ShowLoading(val show: Boolean) : HomeAction()
    data class ShowFailureMsg(val message: String?) : HomeAction()


}
