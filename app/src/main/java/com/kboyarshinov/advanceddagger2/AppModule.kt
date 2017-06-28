package com.kboyarshinov.advanceddagger2

import com.stepango.mylibrary.ui.RealToaster
import com.stepango.mylibrary.ui.Toaster
import dagger.Module
import dagger.Provides
import dagger.Reusable

@Module
class AppModule {
    @Provides
    @Reusable
    internal fun provideToaster(application: StoreApp): Toaster {
        return RealToaster(application)
    }
}
