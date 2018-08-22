package vn.gmo.gallery.di.module

import dagger.Module
import vn.gmo.gallery.di.ViewModelModule

@Module(includes = [DatabaseModule::class, NetworkModule::class, ViewModelModule::class])
class AppModule {
    // If you need.
}