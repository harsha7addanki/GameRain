package com.fztl.harsha.gamerain;

import android.graphics.Canvas;
import android.view.MotionEvent;

public interface GRCode {
    public void run(Canvas canvas);
    public void update();
    public default void onTouch(MotionEvent event){
    };
}
