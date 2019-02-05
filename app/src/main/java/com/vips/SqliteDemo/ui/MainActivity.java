package com.vips.SqliteDemo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vips.SqliteDemo.App;
import com.vips.SqliteDemo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        App.getMyDatabaseManager();//todo database will be created
    }
}
