package com.kboyarshinov.advanceddagger2

import com.kboyarshinov.advanceddagger2.data.ProductsModule
import com.kboyarshinov.advanceddagger2.store.StoreActivity
import com.kboyarshinov.advanceddagger2.store.StoreModule
import com.kboyarshinov.advanceddagger2.store.StoreScope

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    @StoreScope
    @ContributesAndroidInjector(modules = arrayOf(StoreModule::class, ProductsModule::class))
    abstract fun contributeStoreActivityInjector(): StoreActivity
}
