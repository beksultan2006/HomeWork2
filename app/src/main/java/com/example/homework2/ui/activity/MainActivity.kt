package com.example.homework2.ui.activity

import com.example.homework2.R
import com.example.homework2.base.BaseActivity
import com.example.homework2.databinding.ActivityMainBinding
import com.example.homework2.ui.fragment.FirstFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun inflateViewBinding() = ActivityMainBinding.inflate(layoutInflater)

    override fun initUI() {
        super.initUI()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FirstFragment())
            .addToBackStack(null)
            .commit()
    }
}