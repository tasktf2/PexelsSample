package com.setjy.pexelssample.data.network

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface PexelsApi {
    @GET("v1/search")
    fun getPhoto(@Query("query") query:String):Single<PhotoResponse>
}