package com.setjy.pexelssample.presenter.base

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.setjy.pexelssample.app.PexelsApplication

abstract class BaseFragment<V : BaseView, P : BasePresenter<V>> :Fragment(),BaseView {

    protected lateinit var presenter: P

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initPresenter()
        val di = (requireContext().applicationContext as PexelsApplication).globalDI
        presenter.globalDI=di
    }



}