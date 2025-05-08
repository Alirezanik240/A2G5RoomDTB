package com.example.a2g5roomdtb;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(version = 1,exportSchema = false,entities = {User.class})
public abstract class TDatabase extends RoomDatabase {
    public static TDatabase getInstance(Context context){
        return Room.databaseBuilder(context , TDatabase.class,"DBRoom").allowMainThreadQueries().build();
    }
        public abstract UserDao userDao();

}
