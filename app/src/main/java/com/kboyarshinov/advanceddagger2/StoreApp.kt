package com.kboyarshinov.advanceddagger2

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class StoreApp : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<StoreApp>
            = DaggerStoreAppComponent.builder().create(this)
}
