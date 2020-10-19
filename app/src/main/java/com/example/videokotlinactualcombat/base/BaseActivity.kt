package com.example.videokotlinactualcombat.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug
import org.jetbrains.anko.toast

abstract class BaseActivity : AppCompatActivity(),AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(getLayoutId())
        initView()
        initData()
        initEvent()
        debug { "哈哈哈" }
    }

    private fun initEvent() {
    }

    abstract fun getLayoutId(): Int

    protected fun initView() {
    }

    protected fun initData() {

    }

    protected fun myToast(msg: String) {
        runOnUiThread { toast(msg) }
    }

}