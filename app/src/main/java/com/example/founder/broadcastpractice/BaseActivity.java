package com.example.founder.broadcastpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by founder on 7/3/15.
 */
public class BaseActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }
    protected void onDestroy(){
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
