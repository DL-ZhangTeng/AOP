package com.zhangteng.app.mvvm.vm

import com.zhangteng.mvvm.base.BaseViewModel
import com.zhangteng.app.mvvm.repository.BaseMvvmDbDemoDbRepository

class BaseMvvmDbDemoDbViewModel : BaseViewModel() {
    private val mRepository by lazy { BaseMvvmDbDemoDbRepository() }
}