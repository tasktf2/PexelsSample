package com.setjy.pexelssample.data.network

import com.google.gson.annotations.SerializedName
import io.reactivex.rxjava3.core.Single

data class PhotoResponse(
    val photos: List<PhotoRemote>
)

data class PhotoRemote(
    @SerializedName("id") val id: String,
    @SerializedName("src") val source: Source,
    @SerializedName("photographer") val photographer: String
)

data class Source(@SerializedName("large") val url: String)
