package com.zhangteng.app.ui.mvvmdb

import android.os.Bundle
import com.zhangteng.app.R
import com.zhangteng.app.databinding.MvvmDbActivityBinding
import com.zhangteng.mvvm.mvvm.BaseMvvmDbActivity

class MvvmDbActivity : BaseMvvmDbActivity<MvvmDbActivityViewModel, MvvmDbActivityBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mvvm_db_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MvvmDbFragment.newInstance())
                .commitNow()
        }
    }

    override fun initView() {

    }

    override fun initData() {

    }
}