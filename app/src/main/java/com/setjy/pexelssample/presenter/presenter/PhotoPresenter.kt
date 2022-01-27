package com.setjy.pexelssample.presenter.presenter

import android.util.Log
import com.setjy.pexelssample.domain.usecase.GetPhotoUsecase
import com.setjy.pexelssample.presenter.base.BasePresenter
import com.setjy.pexelssample.presenter.view.PhotoView

class PhotoPresenter : BasePresenter<PhotoView>() {
    private val getUsecase: GetPhotoUsecase by lazy {globalDI.getPhotoUsecase }

    fun getPhoto(query: String) {
        val validQuery = if (query.isEmpty()) DEFAULT_QUERY else query
        getUsecase.execute(validQuery)
            .subscribe(
                { photoItem ->
                    thisView?.showPhoto(photoItem.url, photoItem.photographer)
                },
                { Log.d("xxx", "error is $it")
                    thisView?.showError(it.toString())})

    }

    companion object {
        private const val DEFAULT_QUERY: String = "tits"
    }
}