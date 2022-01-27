package com.setjy.pexelssample.presenter.view

import com.setjy.pexelssample.presenter.base.BaseView

interface PhotoView : BaseView {
    fun showPhoto(url: String, photographer: String)
    fun showError(error:String)

}
