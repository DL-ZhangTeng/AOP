package com.zhangteng.baselibrary.mvvm.repository

import com.zhangteng.mvvm.base.BaseNetRepository

class BaseListMvvmDbDemoDbFragmentRepository : BaseNetRepository() {

    private val mService by lazy {
        //HttpUtils.getInstance().ConfigGlobalHttpUtils().createService(Api::class.java)
    }
}