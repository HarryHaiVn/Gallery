package vn.gmo.gallery.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import vn.gmo.gallery.BuildConfig

@Database(entities = [PhotoEntity::class],
        version = BuildConfig.VERSION_CODE, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract val photoDao: PhotoDao
}