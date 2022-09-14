package com.zhangteng.app.mvp.model

import com.zhangteng.mvp.base.BaseModel
import com.zhangteng.app.mvp.model.imodel.IMainModel

class MainModel : BaseModel(), IMainModel {
    override fun testString(): String? {
        return "test"
    }
}