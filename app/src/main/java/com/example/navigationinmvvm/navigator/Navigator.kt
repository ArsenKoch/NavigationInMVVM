package com.example.navigationinmvvm.navigator

import androidx.annotation.StringRes

interface Navigator {

    fun launch()

    fun goBack(result: Any? = null)

    fun toast(@StringRes messageRes: Int)

    fun getString(@StringRes messageRes: Int): String
}