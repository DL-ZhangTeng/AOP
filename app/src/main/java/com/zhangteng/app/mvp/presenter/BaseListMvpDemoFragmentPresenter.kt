package com.zhangteng.app.mvp.presenter

import com.zhangteng.mvp.base.BasePresenter
import com.zhangteng.app.mvp.model.BaseListMvpDemoFragmentModel
import com.zhangteng.app.mvp.model.imodel.IBaseListMvpDemoFragmentModel
import com.zhangteng.app.mvp.presenter.ipresenter.IBaseListMvpDemoFragmentPresenter
import com.zhangteng.app.mvp.view.IBaseListMvpDemoFragmentView

class BaseListMvpDemoFragmentPresenter :
    BasePresenter<IBaseListMvpDemoFragmentView, IBaseListMvpDemoFragmentModel>(),
    IBaseListMvpDemoFragmentPresenter {
    init {
        this.mModel = BaseListMvpDemoFragmentModel()
    }
}