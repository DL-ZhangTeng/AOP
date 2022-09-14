package com.zhangteng.app.mvvm.vm

import com.zhangteng.mvvm.base.BaseViewModel
import com.zhangteng.app.mvvm.repository.BaseMvvmDemoFragmentRepository

class BaseMvvmDemoFragmentViewModel : BaseViewModel() {
    private val mRepository by lazy { BaseMvvmDemoFragmentRepository() }
}