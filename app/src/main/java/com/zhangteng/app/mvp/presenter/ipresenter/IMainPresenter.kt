package com.zhangteng.app.mvp.presenter.ipresenter

import com.zhangteng.mvp.base.IPresenter
import com.zhangteng.app.mvp.model.imodel.IMainModel
import com.zhangteng.app.mvp.view.IMainView

interface IMainPresenter : IPresenter<IMainView, IMainModel> {
    fun testString(): String?
}