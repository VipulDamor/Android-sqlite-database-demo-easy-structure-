package com.vips.SqliteDemo.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 *
 */

public class MySQliteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "test.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_PRODUCTMASTER = "ProductMaster";
    public static final String PRODUCTMASTER_PRODUCTID = "ProductID";
    public static final String PRODUCTMASTER_PRODUCTNAME = "ProductName";

    public final String PRODUCTMASTER_CREATE = "create table " + TABLE_PRODUCTMASTER +
            "("+ PRODUCTMASTER_PRODUCTID +
            " Text,"
            + PRODUCTMASTER_PRODUCTNAME + " Text"+ ");";


    public static final String TABLE_PRODUCT_PACKING_MASTER = "ProductPackingMaster";
    public static final String PRODUCT_PACKING_MASTER_PRODUCTID = "ProductID";
    public static final String PRODUCT_PACKING_MASTER_PACKINGID = "packingID";
    public static final String PRODUCT_PACKING_MASTER_PACKINGNAME = "packingName";
    public static final String PRODUCT_PACKING_MASTER_PACKINGQUANTITY = "packingQuantity";
    public static final String PRODUCT_PACKING_MASTER_PACKINGSALESPRICE = "packingsalesPrice";

    public final String PRODUCT_PACKING_MASTER_CREATE = "create table " + TABLE_PRODUCT_PACKING_MASTER +
            "("+ PRODUCT_PACKING_MASTER_PRODUCTID + " Text,"+
            " "+ PRODUCT_PACKING_MASTER_PACKINGID + " Text," +
            " "+ PRODUCT_PACKING_MASTER_PACKINGNAME + " Text," +
            " "+ PRODUCT_PACKING_MASTER_PACKINGQUANTITY + " Text," +
            PRODUCT_PACKING_MASTER_PACKINGSALESPRICE + " Text"+ ");";


    public MySQliteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }




    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(PRODUCTMASTER_CREATE);
        sqLiteDatabase.execSQL(PRODUCT_PACKING_MASTER_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_PRODUCTMASTER);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_PRODUCT_PACKING_MASTER);
    }
}
