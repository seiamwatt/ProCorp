package com.example.procorpv1.Data
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context


@Database(entities = [Item::class], version = 1, exportSchema = false)
 abstract class InventoryDatabase : RoomDatabase() {

     // declare an abstract function that returns the ItemDao so that the database knows about the DAO.
     abstract fun ItemDao() : ItemDao

    companion object {
        @Volatile
        private var Instance: InventoryDatabase? = null

        fun getDatabase(context: Context): InventoryDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, InventoryDatabase::class.java, "item_database").fallbackToDestructiveMigration()
                    .build()
                    .also { Instance = it }
            }
        }




    }
}