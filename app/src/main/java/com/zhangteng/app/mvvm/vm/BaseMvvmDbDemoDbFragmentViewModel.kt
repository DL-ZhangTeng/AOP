package com.zhangteng.app.mvvm.vm

import com.zhangteng.mvvm.base.BaseViewModel
import com.zhangteng.app.mvvm.repository.BaseMvvmDbDemoDbFragmentRepository

class BaseMvvmDbDemoDbFragmentViewModel : BaseViewModel() {
    private val mRepository by lazy { BaseMvvmDbDemoDbFragmentRepository() }
}