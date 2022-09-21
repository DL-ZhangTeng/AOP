package com.zhangteng.app

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.zhangteng.aop.annotation.CheckLogin
import com.zhangteng.aop.annotation.TimeLog

class MainActivity : AppCompatActivity() {

    @TimeLog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @TimeLog
    @CheckLogin("com.zhangteng.app.LoginActivity")
    public fun onLogin(v: View) {

    }
}