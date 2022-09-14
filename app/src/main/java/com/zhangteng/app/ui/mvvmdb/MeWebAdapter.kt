package com.zhangteng.app.ui.mvvmdb

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.zhangteng.base.base.BaseAdapter
import com.zhangteng.app.R
import com.zhangteng.app.databinding.ItemUsedwebBinding
import com.zhangteng.app.http.entity.ArticlesBean

class MeWebAdapter : BaseAdapter<ArticlesBean, BaseDataBindingHolder<ItemUsedwebBinding>>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseDataBindingHolder<ItemUsedwebBinding> {
        return BaseDataBindingHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_usedweb, parent, false)
        )
    }

    override fun onBindViewHolder(
        holder: BaseDataBindingHolder<ItemUsedwebBinding>,
        item: ArticlesBean?,
        position: Int
    ) {
        holder.dataBinding?.itemData = item
        holder.dataBinding?.executePendingBindings()
    }
}

open class BaseDataBindingHolder<BD : ViewDataBinding>(view: View) :
    BaseAdapter.DefaultViewHolder(view) {

    val dataBinding = DataBindingUtil.bind<BD>(view)
}