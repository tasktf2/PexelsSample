package com.setjy.pexelssample.data.repo

import com.setjy.pexelssample.data.DataConverter
import com.setjy.pexelssample.data.network.PexelsApi
import com.setjy.pexelssample.domain.model.PhotoDomain
import io.reactivex.rxjava3.core.Single

class PexelsRepoImpl(private val api: PexelsApi) : PexelsRepo {

    override fun getPhoto(query: String): Single<PhotoDomain> {
        return api.getPhoto(query).map(DataConverter::convertToDomain)
    }
}