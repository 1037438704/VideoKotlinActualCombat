package com.example.videokotlinactualcombat.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.jetbrains.anko.runOnUiThread
import org.jetbrains.anko.toast


abstract class BaseFragment :Fragment(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return initView()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initListener()
        initData()
    }
    abstract  fun initView(): View?
    //初始化
    private fun init() {
    }

    //初始化数据
    protected fun initData(){

    }
    //时间以及适配器处理
    protected fun initListener() {
    }

    fun myToast(msg : String){
        context?.runOnUiThread { toast(msg) }
    }
}