package com.wondertek.henews;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;

/**
 * Created by wangyang on 2016/11/2.
 */
public class BaseActivity extends Activity{
    public float width;
    public float height;

    //onCreate->onStart->onResume(至于前台会从新回调)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("wy=====", "onCreate====");
        initVariables();
        initViews(savedInstanceState);
        loadData();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("wy=====", "onStart====");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("wy=====", "onResume====");
    }

    //当切换activity或者应用置于后台会onPause->onStop
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("wy=====", "onPause====");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("wy=====", "onStop====");
    }

    //当切换到该页面会onRestart->onStart->onResume
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("wy=====", "onRestart====");
    }

    //用户退出当前Activity,onPause->onStop->onDestroy
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("wy=====", "onDestroy====");
    }


    protected void initVariables(){
        //初始化变量，包括Intent携带的数据
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        width = dm.widthPixels*dm.density;
        height = dm.heightPixels*dm.density;
    }
    protected void initViews(Bundle savedInststanceState){
        //加载布局文件，初始化控件，为按钮注册监听事件
    }
    protected void loadData(){
        //视具体业务而定，把每次启动Activity都要进行的操作放在这里
    }
}
