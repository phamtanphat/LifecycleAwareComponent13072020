package com.example.lifecycleawarecomponent13072020;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("BBB","OnCreate service");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("BBB","onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.d("BBB","onDestroy");
        super.onDestroy();
    }
}
