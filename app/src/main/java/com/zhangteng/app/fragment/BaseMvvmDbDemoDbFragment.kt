package com.zhangteng.app.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zhangteng.app.R
import com.zhangteng.app.databinding.FragmentBaseMvvmDbDemoDbBinding
import com.zhangteng.app.mvvm.vm.BaseMvvmDbDemoDbFragmentViewModel
import com.zhangteng.mvvm.mvvm.BaseMvvmDbFragment

class BaseMvvmDbDemoDbFragment :
    BaseMvvmDbFragment<BaseMvvmDbDemoDbFragmentViewModel, FragmentBaseMvvmDbDemoDbBinding>() {

    companion object {
        fun newInstance() = BaseMvvmDbDemoDbFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_base_mvvm_db_demo_db, container, false)
    }

    override fun initView(view: View, savedInstanceState: Bundle?) {

    }

    override fun initData(savedInstanceState: Bundle?) {
        super.initData(savedInstanceState)

    }
}