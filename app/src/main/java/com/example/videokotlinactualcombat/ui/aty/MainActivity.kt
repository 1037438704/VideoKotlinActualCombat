package com.example.videokotlinactualcombat.ui.aty

import androidx.appcompat.widget.Toolbar
import com.example.videokotlinactualcombat.R
import com.example.videokotlinactualcombat.base.BaseActivity
import com.example.videokotlinactualcombat.util.ToolBarManager
import org.jetbrains.anko.find

class MainActivity : BaseActivity(),ToolBarManager{

    override val toolbar: Toolbar by lazy { find<Toolbar>(R.id.tooblar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_main;
    }

    override fun initData() {
        initMainToolBar()
    }

}