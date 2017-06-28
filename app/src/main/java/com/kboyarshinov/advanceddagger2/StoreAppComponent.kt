package com.kboyarshinov.advanceddagger2

import com.kboyarshinov.advanceddagger2.payment.PaymentsModule

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@AppScope
@Component(modules = arrayOf(AppModule::class, PaymentsModule::class, AndroidSupportInjectionModule::class, ActivityBindingModule::class))
interface StoreAppComponent : AndroidInjector<StoreApp> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<StoreApp>() {
        internal abstract fun appModule(appModule: AppModule): Builder
    }
}
