package vn.gmo.gallery.di.module

import dagger.Module

@Module(includes = [DatabaseModule::class, NetworkModule::class, ViewModelModule::class])
internal object AppModule {
    // If you need.
}