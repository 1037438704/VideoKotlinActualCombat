package com.example.videokotlinactualcombat.base

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.videokotlinactualcombat.ui.aty.MainActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

abstract class BaseActivity : AppCompatActivity(),AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
        initData()
    }

    abstract fun getLayoutId(): Int

    protected open fun initListener(){}

    protected open fun initData() {}

    protected fun myToast(msg: String) {
        runOnUiThread { toast(msg) }
    }

    protected inline fun <reified T:BaseActivity>startActivityAndFinish(){
        //进入主界面
        startActivity<T>()
        finish()
    }
}