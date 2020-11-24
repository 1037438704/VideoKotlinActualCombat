package com.example.videokotlinactualcombat.ui.aty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.videokotlinactualcombat.R
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.support.v4.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}