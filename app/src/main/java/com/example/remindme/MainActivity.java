package com.example.remindme;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
//        setSupportActionBar(toolbar);
    }

    private void initToolbar() {
            toolbar =  findViewById(R.id.toolbar);
            toolbar.setTitle(R.string.app_name);
            toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    return false;
                }
            });
            toolbar.inflateMenu(R.menu.menu);
//            setSupportActionBar(toolbar);
    }
}
