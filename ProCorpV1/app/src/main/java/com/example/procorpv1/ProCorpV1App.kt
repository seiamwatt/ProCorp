package com.example.procorpv1

import android.app.Application
import com.example.procorpv1.Data.AppContainer
import com.example.procorpv1.Data.AppDataContainer

class ProCorpV1App : Application() {

    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: AppContainer

    override fun onCreate(){
        super.onCreate()
        container = AppDataContainer(this)
    }
}

