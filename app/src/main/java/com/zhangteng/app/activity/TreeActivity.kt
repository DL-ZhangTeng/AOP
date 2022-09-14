package com.zhangteng.app.activity

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.scwang.smart.refresh.layout.SmartRefreshLayout
import com.zhangteng.base.base.BaseListActivity
import com.zhangteng.app.R
import com.zhangteng.app.adapter.TreeAdapter
import com.zhangteng.app.bean.TreeBean

class TreeActivity : BaseListActivity<TreeBean, TreeAdapter>() {
    private var data = ArrayList<TreeBean?>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_list)
    }

    override fun initData() {
        loadData(1)
    }

    override fun setLayoutManager() {
        mRecyclerView?.layoutManager = LinearLayoutManager(this)
    }

    override fun getRecyclerView(): RecyclerView {
        return findViewById(R.id.recycler_view)
    }

    override fun getSmartRefreshLayout(): SmartRefreshLayout {
        return findViewById(R.id.refresh_layout)
    }

    override fun createAdapter(): TreeAdapter {
        val rootTree = TreeBean().apply {
            id = "1"
            label = "1"
            children = ArrayList()
            parent = null
        }
        val oneTree = TreeBean().apply {
            id = "2"
            label = "2"
            children = ArrayList()
            parent = null
        }
        rootTree.children?.add(oneTree)

        val twoTree = TreeBean().apply {
            id = "3"
            label = "3"
            children = ArrayList()
            parent = null
        }
        oneTree.children?.add(twoTree)

        data.add(rootTree)
        return TreeAdapter(data, 1)
    }

    override fun loadData(page: Int) {
        showDataSuccess(1, data)
    }
}