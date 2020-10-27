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
import com.example.videokotlinactualcombat.R
import com.example.videokotlinactualcombat.base.BaseFragment

class YueDanFragmnet : BaseFragment() {
    override fun initView(): View? {
        val tv = TextView(context);
        tv.gravity = Gravity.CENTER
        tv.setTextColor(Color.RED)
        tv.text = javaClass.simpleName
        return  tv
    }

}