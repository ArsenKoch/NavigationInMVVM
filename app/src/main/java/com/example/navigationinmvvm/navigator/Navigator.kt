package com.example.navigationinmvvm.navigator

import androidx.annotation.StringRes
import com.example.navigationinmvvm.screens.base.BaseScreen

interface Navigator {

    fun launch(screen: BaseScreen)

    fun goBack(result: Any? = null)

    fun toast(@StringRes messageRes: Int)

    fun getString(@StringRes messageRes: Int): String
}