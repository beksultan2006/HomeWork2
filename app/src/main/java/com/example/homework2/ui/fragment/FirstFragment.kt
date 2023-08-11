package com.example.homework2.ui.fragment


import android.os.Bundle
import com.example.homework2.R
import com.example.homework2.base.BaseFragment
import com.example.homework2.databinding.FragmentFirstBinding


class FirstFragment : BaseFragment<FragmentFirstBinding>(FragmentFirstBinding::inflate) {

    override fun setupUI() {

        binding.button.setOnClickListener {
            val text = binding.editText.text.toString()
            val secondFragment = SecondFragment()
            val bundle = Bundle().apply {
                putString(TEXT_KEY, text)
            }
            secondFragment.arguments = bundle
            requireActivity().supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, secondFragment)
                .addToBackStack(null)
                .commit()
        }
    }

    override fun setupObServer() {

    }

  companion object{
      const val TEXT_KEY = "KEY1_TEXT"
  }
}