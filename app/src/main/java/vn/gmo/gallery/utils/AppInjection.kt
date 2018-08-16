package vn.gmo.gallery.utils

import android.content.Context
import vn.gmo.gallery.App
import vn.gmo.gallery.di.compoment.AppComponent

object AppInjection {
    fun of(context: Context?): AppComponent {
        return (context as App).applicationInjector() as AppComponent
    }
}