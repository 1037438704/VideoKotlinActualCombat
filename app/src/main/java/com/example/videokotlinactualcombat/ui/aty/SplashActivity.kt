package com.example.videokotlinactualcombat.ui.aty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.videokotlinactualcombat.R
import com.example.videokotlinactualcombat.base.BaseActivity

class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    override fun getLayoutId(): Int {
        return  R.layout.activity_splash
    }
}