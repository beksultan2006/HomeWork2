package com.example.homework2.ui.fragment

import com.example.homework2.base.BaseFragment
import com.example.homework2.databinding.FragmentSecondBinding


class SecondFragment : BaseFragment<FragmentSecondBinding>(FragmentSecondBinding::inflate) {
    override fun setupUI() {
        val result = arguments?.getString(FirstFragment.TEXT_KEY)
        binding.txtTitle.text = result

    }


    override fun setupObServer() {

    }
}