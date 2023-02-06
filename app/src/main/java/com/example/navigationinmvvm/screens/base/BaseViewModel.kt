package com.example.navigationinmvvm.screens.base

import androidx.lifecycle.ViewModel

open class BaseViewModel: ViewModel() {

    open fun onResult(result: Any) {}
}