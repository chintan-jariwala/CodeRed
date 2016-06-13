package com.example.samberg.codered;

import android.app.Application;

import com.orm.SugarContext;

/**
 * Created by samberg on 6/13/2016.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SugarContext.init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        SugarContext.terminate();
    }
}
