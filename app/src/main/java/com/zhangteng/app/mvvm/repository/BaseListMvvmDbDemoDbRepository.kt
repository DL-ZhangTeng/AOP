package com.zhangteng.app.mvvm.repository

import com.zhangteng.app.http.Api
import com.zhangteng.app.http.BaseResult
import com.zhangteng.app.http.entity.HomeListBean
import com.zhangteng.app.http.entity.NavTypeBean
import com.zhangteng.mvvm.base.BaseNetRepository
import com.zhangteng.rxhttputils.http.HttpUtils

class BaseListMvvmDbDemoDbRepository : BaseNetRepository() {

    private val mService by lazy {
        HttpUtils.getInstance().ConfigGlobalHttpUtils().createService(Api::class.java)
    }

    suspend fun getProjectList(page: Int, cid: Int): BaseResult<HomeListBean> {
        return mService.getProjectList(page, cid)
    }

    /**
     * 先请求tab数据
     * */
    suspend fun getData(): BaseResult<List<NavTypeBean>> {
        return mService.naviJson()
    }

    /**
     * 用Flow流的方式
     * 操作符比较繁琐
     * */
    suspend fun getFirstData(): BaseResult<List<NavTypeBean>> {
        return mService.naviJson()
    }
}