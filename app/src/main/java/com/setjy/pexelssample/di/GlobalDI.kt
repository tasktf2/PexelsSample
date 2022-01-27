package com.setjy.pexelssample.di

import com.setjy.pexelssample.data.network.NetworkService
import com.setjy.pexelssample.data.network.PexelsApi
import com.setjy.pexelssample.data.repo.PexelsRepo
import com.setjy.pexelssample.data.repo.PexelsRepoImpl
import com.setjy.pexelssample.domain.usecase.GetPhotoUsecase
import retrofit2.Retrofit

class GlobalDI {
    private val retrofit: Retrofit = NetworkService.retrofit
    private val pexelsApi = provideApi(retrofit)
    private val pexelsRepo = provideRepo(pexelsApi)
    val getPhotoUsecase:GetPhotoUsecase=provideUsecase(pexelsRepo)

    private fun provideApi(retrofit: Retrofit) = retrofit.create(PexelsApi::class.java)
    private fun provideRepo(api: PexelsApi) = PexelsRepoImpl(api)
    private fun provideUsecase(repo: PexelsRepo)=GetPhotoUsecase(repo)
}