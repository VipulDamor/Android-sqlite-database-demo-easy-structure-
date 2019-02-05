package com.vips.SqliteDemo;

import android.app.Application;

import com.vips.SqliteDemo.db.MyDatabaseManager;

/**
 *
 */

public class App extends Application {

    private static App mAppInstance;
    private static MyDatabaseManager myDatabaseManager;





    @Override
    public void onCreate() {
        super.onCreate();
        if (myDatabaseManager==null){
            myDatabaseManager = new MyDatabaseManager(this).open();
        }
        mAppInstance = this;

    }

    public static MyDatabaseManager getMyDatabaseManager(){
        return myDatabaseManager;
    }
    public static App getAppInstance() {
        return mAppInstance;
    }

}
