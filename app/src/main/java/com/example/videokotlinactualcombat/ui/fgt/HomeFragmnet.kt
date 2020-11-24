package com.example.videokotlinactualcombat.ui.fgt

import android.graphics.Color
import android.graphics.Color.RED
import android.hardware.camera2.params.RggbChannelVector.RED
import android.os.Bundle
import android.provider.CalendarContract
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.videokotlinactualcombat.R
import com.example.videokotlinactualcombat.adapter.HomeAdapter
import com.example.videokotlinactualcombat.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragmnet : BaseFragment() {
    override fun initView(): View? {
        return  View.inflate(context,R.layout.fragment_home,null)
    }

    override fun initListener() {
        super.initListener()
        recyclerView.layoutManager = LinearLayoutManager(context);
        //适配
        val adapter = HomeAdapter()
        recyclerView.adapter = adapter;
        loadDatas();
    }
   fun loadDatas(){

    }

}