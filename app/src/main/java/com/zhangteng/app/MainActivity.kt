package com.zhangteng.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zhangteng.aop.annotation.TimeLog

class MainActivity : AppCompatActivity() {
    @TimeLog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}