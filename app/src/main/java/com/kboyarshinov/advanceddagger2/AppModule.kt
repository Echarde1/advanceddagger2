package com.kboyarshinov.advanceddagger2

import com.kboyarshinov.advanceddagger2.ui.RealToaster
import com.kboyarshinov.advanceddagger2.ui.Toaster
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
