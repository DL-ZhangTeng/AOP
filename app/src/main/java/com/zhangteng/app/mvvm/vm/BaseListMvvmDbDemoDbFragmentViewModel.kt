package com.zhangteng.app.mvvm.vm

import com.zhangteng.app.mvvm.repository.BaseListMvvmDbDemoDbFragmentRepository
import com.zhangteng.mvvm.base.BaseViewModel

class BaseListMvvmDbDemoDbFragmentViewModel : BaseViewModel() {
    private val mRepository by lazy { BaseListMvvmDbDemoDbFragmentRepository() }
}