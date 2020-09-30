package com.example.lifecycleawarecomponent13072020;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

public class MyListenerActivity implements LifecycleObserver {
    Context context;

    public MyListenerActivity(Context context) {
        this.context = context;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void createActivity(){
        Log.d("BBB","onCreateAcitivty");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void startActivity(){
        context.startService(new Intent(context,MyService.class));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void stopActivty(){
        context.stopService(new Intent(context,MyService.class));
    }

}
