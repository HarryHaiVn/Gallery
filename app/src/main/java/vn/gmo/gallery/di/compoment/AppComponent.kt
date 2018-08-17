package vn.gmo.gallery.di.compoment

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import vn.gmo.gallery.App
import vn.gmo.gallery.di.builder.ActivityBuilder
import vn.gmo.gallery.di.module.AppModule
import vn.gmo.gallery.di.module.DatabaseModule
import vn.gmo.gallery.utils.GlideModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
            AndroidSupportInjectionModule::class,
            ActivityBuilder::class,
            AppModule::class
        ])
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): Builder

        fun database(database: DatabaseModule): Builder

        fun build(): AppComponent
    }

    override fun inject(app: App)

    fun inject(glideModule: GlideModule)
}