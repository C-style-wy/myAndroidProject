package com.wondertek.henews.activity.home;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

import com.wondertek.henews.BaseActivity;
import com.wondertek.henews.R;

/**
 * Created by wangyang on 2016/11/2.
 */
public class TabBarActivity extends BaseActivity {

    private long exitTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_bar);
    }

    //返回键监听事件
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN){
            if((System.currentTimeMillis()-exitTime) > 2000){
                Toast.makeText(getApplicationContext(), "再按一次退出程序", Toast.LENGTH_SHORT).show();
                exitTime = System.currentTimeMillis();
            } else {
                finish();
                System.exit(0);
            }
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }
}
