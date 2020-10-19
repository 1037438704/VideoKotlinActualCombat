package com.example.videokotlinactualcombat.util

import android.content.Intent
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat.startActivity
import com.example.videokotlinactualcombat.R
import com.example.videokotlinactualcombat.ui.aty.SettingActivity


/*
* 所有页面的toolbar页面的基类
*
* */
interface ToolBarManager {

    val toolbar: Toolbar

    /*
    * 初始化主界面中的toolbar
    * */
    fun initMainToolBar(){
        toolbar.setTitle("阿狸影音")
        toolbar.inflateMenu(R.menu.main)
        //kotlin 和 java调用特性
        //如果java接口中只有一个未实现的方法 可以省略接口对象  直接用{}表示未实现的方法
        toolbar.setOnMenuItemClickListener{
            toolbar.context.startActivity(Intent(toolbar.context,SettingActivity::class.java))
            true
        }

//        toolbar.setOnMenuItemClickListener(object :Toolbar.OnMenuItemClickListener{
//            override fun onMenuItemClick(item: MenuItem?): Boolean {
//                when(item?.itemId){
//                    R.id.setting->{
//                        //跳转到设置页面
//                        toolbar.context.startActivity(Intent(toolbar.context,SettingActivity::class.java))
//                    }
//                }
//                return  true;
//            }
//        })
    }

    /*
    * 处理设置页面的tooblar
    * */
    fun initSettingToolbar(){
        toolbar.setTitle("设置界面")
    }


}