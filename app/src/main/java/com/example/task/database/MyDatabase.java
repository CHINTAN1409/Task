package com.example.task.database;
import android.content.Context;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class MyDatabase extends SQLiteAssetHelper {

    public static final String  DATABASE_NAME = "Task.db";
    public static final int DATABASE_VERSION =1;
    public MyDatabase(Context context) {
        super(context, DATABASE_NAME,  null, DATABASE_VERSION);
    }
}
