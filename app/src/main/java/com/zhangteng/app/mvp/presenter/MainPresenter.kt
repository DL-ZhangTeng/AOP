package com.zhangteng.app.mvp.presenter

import com.zhangteng.mvp.base.BaseLoadingPresenter
import com.zhangteng.app.mvp.model.MainModel
import com.zhangteng.app.mvp.model.imodel.IMainModel
import com.zhangteng.app.mvp.presenter.ipresenter.IMainPresenter
import com.zhangteng.app.mvp.view.IMainView

class MainPresenter : BaseLoadingPresenter<IMainView, IMainModel>(), IMainPresenter {
    init {
        this.mModel = MainModel()
    }

    override fun testString(): String? {
        return mModel?.testString()
    }
}