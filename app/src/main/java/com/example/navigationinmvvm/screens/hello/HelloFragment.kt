package com.example.navigationinmvvm.screens.hello

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationinmvvm.databinding.FragmentHelloBinding
import com.example.navigationinmvvm.screens.base.BaseFragment
import com.example.navigationinmvvm.screens.base.BaseScreen
import com.example.navigationinmvvm.screens.base.BaseViewModel
import com.example.navigationinmvvm.screens.base.screenViewModel

class HelloFragment : BaseFragment() {

    class Screen : BaseScreen

    override val viewModel by screenViewModel<HelloViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentHelloBinding.inflate(inflater, container, false)

        binding.btnEdit.setOnClickListener { viewModel.onEditPressed() }

        viewModel.currentMessage.observe(viewLifecycleOwner) {
            binding.tvValue.text = it
        }

        return binding.root
    }
}