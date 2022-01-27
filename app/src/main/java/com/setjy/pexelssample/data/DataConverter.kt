package com.setjy.pexelssample.data

import com.setjy.pexelssample.data.network.PhotoResponse
import com.setjy.pexelssample.domain.model.PhotoDomain

object DataConverter {
    fun convertToDomain(photos: PhotoResponse): PhotoDomain {
        val photo = photos.photos[0]
        return PhotoDomain(photo.source.url,photo.photographer)

    }
}