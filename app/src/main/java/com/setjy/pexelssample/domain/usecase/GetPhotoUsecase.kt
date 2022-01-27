package com.setjy.pexelssample.domain.usecase

import com.setjy.pexelssample.data.repo.PexelsRepo
import com.setjy.pexelssample.domain.DomainConverter
import com.setjy.pexelssample.presenter.model.PhotoItem
import io.reactivex.rxjava3.core.Single

class GetPhotoUsecase(private val repo: PexelsRepo) : BaseUsecase {
    fun execute(query: String): Single<PhotoItem> {
        return repo.getPhoto(query)
            .map(DomainConverter::convertToPresenter)
            .execution()
    }
}