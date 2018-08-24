package vn.gmo.gallery.room

import androidx.room.Database
import androidx.room.RoomDatabase
import vn.gmo.gallery.BuildConfig

@Database(entities = [PhotoEntity::class],
        version = BuildConfig.VERSION_CODE, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract val photoDao: PhotoDao
}