package com.example.navigationinmvvm.navigator

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import com.example.navigationinmvvm.screens.base.BaseScreen

class MainNavigator(
    application: Application
) : AndroidViewModel(application), Navigator {

    override fun launch(screen: BaseScreen) {
        TODO("Not yet implemented")
    }

    override fun goBack(result: Any?) {
        TODO("Not yet implemented")
    }

    override fun toast(messageRes: Int) {
        Toast.makeText(getApplication(), messageRes, Toast.LENGTH_LONG).show()
    }

    override fun getString(messageRes: Int): String {
        return getApplication<Application>().getString(messageRes)
    }
}