package com.example.cjcu.test0531;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by CJCU on 2018/5/31.
 */

public class MyDBHelper extends SQLiteOpenHelper {
    private static MyDBHelper instance;

    public static MyDBHelper getInstance(Context context){
    if(instance==null){
        instance = new MyDBHelper(context,"my.db",null,1);
    }
    return instance;
    }

    public MyDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE exp " +
                "(_id INTEGER PRIMARY KEY NOT NULL , " +
                "cdate DATETIME NOT NULL , " +
                "info VARCHAR, " +
                "amount INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
