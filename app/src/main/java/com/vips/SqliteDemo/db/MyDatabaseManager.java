package com.vips.SqliteDemo.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;


import java.util.ArrayList;
import java.util.List;

import static com.vips.SqliteDemo.db.MySQliteHelper.TABLE_PRODUCTMASTER;
import static com.vips.SqliteDemo.db.MySQliteHelper.TABLE_PRODUCT_PACKING_MASTER;

/**
 *
 */

public class MyDatabaseManager {

    private Context context;
    private MySQliteHelper dbHelper;
    private SQLiteDatabase database;

    public MyDatabaseManager(Context paramContext) {
        this.context = paramContext;
        this.dbHelper = getInstance(paramContext);
    }

    public synchronized MySQliteHelper getInstance(Context context) {
        if (dbHelper == null) {
            dbHelper = new MySQliteHelper(context);
        }
        return dbHelper;
    }

    public void close() {
        this.dbHelper.close();
    }

    public MyDatabaseManager open() throws SQLException {
        dbHelper = new MySQliteHelper(context);
        try {
            database = dbHelper.getWritableDatabase();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }



    public void deleteallData(){
        database.execSQL("delete from "+ TABLE_PRODUCTMASTER);
        database.execSQL("delete from "+ TABLE_PRODUCT_PACKING_MASTER);
    }


}
