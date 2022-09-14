package com.zhangteng.app.mvp.presenter

import com.zhangteng.mvp.base.BasePresenter
import com.zhangteng.app.mvp.model.BaseMvpDemoModel
import com.zhangteng.app.mvp.model.imodel.IBaseMvpDemoModel
import com.zhangteng.app.mvp.presenter.ipresenter.IBaseMvpDemoPresenter
import com.zhangteng.app.mvp.view.IBaseMvpDemoView

class BaseMvpDemoPresenter : BasePresenter<IBaseMvpDemoView, IBaseMvpDemoModel>(),
    IBaseMvpDemoPresenter {
    init {
        this.mModel = BaseMvpDemoModel()
    }
}