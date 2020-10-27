package com.example.videokotlinactualcombat.util

import com.example.videokotlinactualcombat.R
import com.example.videokotlinactualcombat.base.BaseFragment
import com.example.videokotlinactualcombat.ui.fgt.HomeFragmnet
import com.example.videokotlinactualcombat.ui.fgt.MvFragmnet
import com.example.videokotlinactualcombat.ui.fgt.VBangFragmnet
import com.example.videokotlinactualcombat.ui.fgt.YueDanFragmnet


/*
* 管理Fragmnet的Util类
* */
class FragmentUtil private constructor(){//私有构造方法

    val homeFragment by lazy { HomeFragmnet() }
    val mvFragment by lazy { MvFragmnet() }
    val vBangFragmnet by lazy { VBangFragmnet() }
    val yueDanFragmnet by lazy { YueDanFragmnet() }

    //这种事惰性加载用到了才会去创建  加载的时候只加载一次
    companion object{
        val fragmentUtil by lazy { FragmentUtil() }
    }

    /*
    * 根据tabid获取对应的fragment
    * */
    fun getFragmnet(tabId:Int):BaseFragment?{
        when(tabId){
            R.id.tab_home -> return homeFragment
            R.id.tab_mv -> return mvFragment
            R.id.tab_v -> return vBangFragmnet
            R.id.tab_yue -> return yueDanFragmnet
        }
        return null
    }
}