package com.setjy.pexelssample.app

import android.app.Application
import com.setjy.pexelssample.di.GlobalDI

class PexelsApplication: Application() {
    val globalDI:GlobalDI by lazy { GlobalDI() }
}