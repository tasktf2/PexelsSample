package com.setjy.pexelssample.presenter.base

import com.setjy.pexelssample.di.GlobalDI

abstract class BasePresenter <V:BaseView> {
    var thisView: V? = null
    lateinit var globalDI:GlobalDI
}