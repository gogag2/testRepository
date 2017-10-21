package com.example.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
/**
 * Created by bk_1ko on 07/10/17.
 */

public class CustomView extends View {
    public CustomView(Context context) {
        super(context);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.w("bk_1.ko", "CustomView dispatchTouchEvent() >> " + ev.getAction());

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.w("bk_1.ko", "CustomView onTouchEvent() >> " + ev.getAction());

        return true;
    }
}
