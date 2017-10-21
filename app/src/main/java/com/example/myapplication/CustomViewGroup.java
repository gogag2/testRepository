package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * Created by bk_1ko on 07/10/17.
 */

public class CustomViewGroup extends FrameLayout {
    public CustomViewGroup(@NonNull Context context) {
        super(context);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("bk_1.ko", "CustomViewGroup dispatchTouchEvent() >> " + ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.i("bk_1.ko", "CustomViewGroup onTouchEvent() >> " + ev.getAction());
        boolean ret = super.onTouchEvent(ev);
        return ret;
    }
}
