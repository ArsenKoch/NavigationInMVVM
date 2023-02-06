package com.example.navigationinmvvm.screens.edit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationinmvvm.databinding.FragmentEditBinding
import com.example.navigationinmvvm.screens.base.BaseFragment
import com.example.navigationinmvvm.screens.base.BaseScreen
import com.example.navigationinmvvm.screens.base.screenViewModel

class EditFragment : BaseFragment() {

    class Screen(
        val initialValue: String
    ) : BaseScreen

    override val viewModel by screenViewModel<EditViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentEditBinding.inflate(inflater, container, false)

        binding.btnCancel.setOnClickListener { viewModel.onCancelPressed() }
        binding.btnSave.setOnClickListener { viewModel.onSavePressed(binding.etValue.text.toString()) }

        viewModel.initialMessageEvent.observe(viewLifecycleOwner) {
            it.getValue()?.let { message -> binding.etValue.setText(message) }
        }

        return binding.root
    }
}