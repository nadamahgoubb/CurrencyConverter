package com.nada.currencyconverter.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ObservableBoolean
import androidx.databinding.ViewDataBinding
import com.nada.currencyconverter.common.bindView


abstract class BaseActivity<B : ViewDataBinding> : AppCompatActivity() {

    val baseShowProgress = ObservableBoolean()

    public override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = bindView()
    }

    public override fun onResume() {
        super.onResume()
    }

    lateinit var binding: B


}