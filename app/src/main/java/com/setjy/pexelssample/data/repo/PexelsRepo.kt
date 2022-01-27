package com.setjy.pexelssample.data.repo

import com.setjy.pexelssample.domain.model.PhotoDomain
import io.reactivex.rxjava3.core.Single

interface PexelsRepo {
    fun getPhoto(query: String): Single<PhotoDomain>
}