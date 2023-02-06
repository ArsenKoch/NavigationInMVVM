package com.example.navigationinmvvm.screens.hello

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.navigationinmvvm.R
import com.example.navigationinmvvm.navigator.Navigator
import com.example.navigationinmvvm.screens.base.BaseViewModel
import com.example.navigationinmvvm.screens.edit.EditFragment

class HelloViewModel(
    private val navigator: Navigator,
    screen: HelloFragment.Screen
) : BaseViewModel() {

    private val _currentMessage = MutableLiveData<String>()
    val currentMessage: LiveData<String> = _currentMessage

    init {
        _currentMessage.value = navigator.getString(R.string.hello_boy)

    }

    override fun onResult(result: Any) {
        if (result is String) {
            _currentMessage.value = result
        }
    }

    fun onEditPressed() {
        navigator.launch(EditFragment.Screen(initialValue = currentMessage.value!!))
    }
}