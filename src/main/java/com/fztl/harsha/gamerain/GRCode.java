package com.fztl.harsha.gamerain;

import android.graphics.Canvas;

public interface GRCode {
    public void run(Canvas canvas);
    public void update();
    public void onTouch(boolean clicked);
}
