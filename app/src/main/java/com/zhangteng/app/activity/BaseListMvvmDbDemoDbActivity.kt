package com.zhangteng.app.activity

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.scwang.smart.refresh.layout.SmartRefreshLayout
import com.zhangteng.app.R
import com.zhangteng.app.adapter.BaseListMvvmDemoAdapter
import com.zhangteng.app.databinding.ActivityBaseListMvvmDbDemoDbBinding
import com.zhangteng.app.http.entity.ArticlesBean
import com.zhangteng.app.mvvm.vm.BaseListMvvmDbDemoDbViewModel
import com.zhangteng.mvvm.mvvm.BaseListMvvmDbActivity

class BaseListMvvmDbDemoDbActivity :
    BaseListMvvmDbActivity<BaseListMvvmDbDemoDbViewModel, ActivityBaseListMvvmDbDemoDbBinding, ArticlesBean, BaseListMvvmDemoAdapter>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_list_mvvm_db_demo_db)
    }

    override fun initView() {
        super.initView()
        mViewModel.items.observe(this) {
            showDataSuccess(Int.MAX_VALUE, it)
        }
    }

    override fun initData() {
        refreshData(true)
    }

    override fun createAdapter(): BaseListMvvmDemoAdapter {
        return BaseListMvvmDemoAdapter(mList)
    }

    override fun getRecyclerView(): RecyclerView {
        return mDatabind.recyclerView
    }

    override fun getSmartRefreshLayout(): SmartRefreshLayout {
        return mDatabind.smartRefreshLayout
    }

    override fun loadData(i: Int) {
        mViewModel.getProjectList(
            294
        )
    }

    override fun setLayoutManager() {
        setLinearLayoutManager(LinearLayoutManager.VERTICAL)
    }
}