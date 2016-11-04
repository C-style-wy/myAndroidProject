package com.wondertek.henews.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.wondertek.henews.R;
import com.wondertek.henews.activity.home.TabBarActivity;
import com.wondertek.henews.base.BaseActivity;

public class MainActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, TabBarActivity.class);
        MainActivity.this.startActivity(intent);
    }

    @Override
    protected void initVariables() {
        super.initVariables();
        Log.d("wy=====", "initVariables===");
    }

    @Override
    protected void initViews(Bundle savedInststanceState) {
        super.initViews(savedInststanceState);
        Log.d("wy=====", "initViews===");
    }

    @Override
    protected void loadData() {
        super.loadData();
        Log.d("wy=====", "loadData===");
    }
}
