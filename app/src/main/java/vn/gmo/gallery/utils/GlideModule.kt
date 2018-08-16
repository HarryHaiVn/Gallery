package vn.gmo.gallery.utils
//
//import android.content.Context
//import com.bumptech.glide.Glide
//import com.bumptech.glide.GlideBuilder
//import com.bumptech.glide.Registry
//import com.bumptech.glide.annotation.Excludes
//import com.bumptech.glide.annotation.GlideModule
//import com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule
//import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader
//import com.bumptech.glide.load.model.GlideUrl
//import com.bumptech.glide.module.AppGlideModule
//import okhttp3.OkHttpClient
//import java.io.InputStream
//import javax.inject.Inject
//
//@Excludes(OkHttpLibraryGlideModule::class)
//@GlideModule
//class GlideModule : AppGlideModule() {
//
//    @Inject
//    lateinit var okHttpClient: OkHttpClient
//
//    override fun registerComponents(context: Context, glide: Glide, registry: Registry) {
//        super.registerComponents(context, glide, registry)
//        registry.replace(GlideUrl::class.java, InputStream::class.java, OkHttpUrlLoader.Factory(okHttpClient))
//    }
//
//    override fun applyOptions(context: Context, builder: GlideBuilder) {
//        AppInjection.of(context).inject(this)
//        super.applyOptions(context, builder)
//    }
//}
