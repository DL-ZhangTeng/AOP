package com.zhangteng.app.mvvm.vm

import com.zhangteng.app.mvvm.repository.BaseListMvvmDemoFragmentRepository
import com.zhangteng.mvvm.base.BaseViewModel

class BaseListMvvmDemoFragmentViewModel : BaseViewModel() {
    private val mRepository by lazy { BaseListMvvmDemoFragmentRepository() }
}