package com.example.videokotlinactualcombat.ui.aty

import androidx.appcompat.widget.Toolbar
import com.example.videokotlinactualcombat.R
import com.example.videokotlinactualcombat.base.BaseActivity
import com.example.videokotlinactualcombat.util.FragmentUtil
import com.example.videokotlinactualcombat.util.ToolBarManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.find

class MainActivity : BaseActivity(),ToolBarManager{

    override val toolbar: Toolbar by lazy { find<Toolbar>(R.id.tooblar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_main;
    }

    override fun initData() {
        initMainToolBar()
    }

    override fun initListener() {
        //设置tab切换监听
        bottomBar.setOnTabSelectListener {
//            it 代表参数
            val transaction = supportFragmentManager.beginTransaction()
            FragmentUtil.fragmentUtil.getFragmnet(it)?.let { it1 ->
                transaction.replace(R.id.container,
                    it1,it.toString())
            }
            transaction.commit()
        }
    }
}