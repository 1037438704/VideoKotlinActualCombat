package com.example.videokotlinactualcombat.ui.aty

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.videokotlinactualcombat.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //横屏代码
        setRequestedOrientation(
            ActivityInfo
                .SCREEN_ORIENTATION_LANDSCAPE
        )
        setContentView(R.layout.activity_main2)
    }
}