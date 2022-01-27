package com.setjy.pexelssample.domain

import com.setjy.pexelssample.domain.model.PhotoDomain
import com.setjy.pexelssample.presenter.model.PhotoItem
import io.reactivex.rxjava3.core.Single

object DomainConverter {
    fun convertToPresenter(photoDomain:PhotoDomain): PhotoItem {

        return PhotoItem(photoDomain.url,photoDomain.photographer)
    }
}