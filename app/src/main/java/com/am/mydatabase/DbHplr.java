package com.am.mydatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHplr extends SQLiteOpenHelper {
    SQLiteDatabase sqLiteDatabase;
    public DbHplr(Context context) {
        super(context, "details.db", null, 1);
        sqLiteDatabase=getWritableDatabase();
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query= "create table student(Name text, Location text)";
        db.execSQL(query);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }

    public void savdetals(String s1, String s2){
        ContentValues contentValues = new ContentValues();
        contentValues.put("Name",s1);
        contentValues.put("Location",s2);
        sqLiteDatabase.insert("student",null,contentValues);
    }
}
