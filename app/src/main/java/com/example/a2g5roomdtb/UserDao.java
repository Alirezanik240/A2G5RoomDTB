package com.example.a2g5roomdtb;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface UserDao {

        @Insert
        void insertUser(User... users);

}
