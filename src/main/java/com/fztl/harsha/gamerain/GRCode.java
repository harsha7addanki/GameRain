package com.fztl.harsha.gamerain;

import android.graphics.Canvas;

/**
 * GRCode: Interface
 * public void run(): Main Game Run Code
 * public void update(): Variable Updates Go Here
 * public void onTouch(boolean clicked): Detect Touches
**/
public interface GRCode {
    public void run(Canvas canvas);
    public void update();
    public void onTouch(boolean clicked);
}
