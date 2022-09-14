package com.zhangteng.app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.zhangteng.base.base.BaseAdapter
import com.zhangteng.app.R

import com.zhangteng.app.bean.BaseListDemoBean

class BaseListDemoAdapter : BaseAdapter<BaseListDemoBean, BaseAdapter.DefaultViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DefaultViewHolder {
        return DefaultViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_base_list_demo, parent, false)
        )
    }

    override fun onBindViewHolder(
        holder: DefaultViewHolder,
        item: BaseListDemoBean?,
        position: Int
    ) {

    }
}