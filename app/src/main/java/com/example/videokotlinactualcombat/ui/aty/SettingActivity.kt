package com.example.videokotlinactualcombat.ui.aty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.videokotlinactualcombat.R
import com.example.videokotlinactualcombat.base.BaseActivity
import com.example.videokotlinactualcombat.util.ToolBarManager
import org.jetbrains.anko.find

class SettingActivity : BaseActivity() ,ToolBarManager{

    override val toolbar: Toolbar by lazy { find<Toolbar>(R.id.tooblar) }

    override fun getLayoutId(): Int {
        return  R.layout.activity_setting
    }

    override fun initData() {
        initSettingToolbar()
    }


}