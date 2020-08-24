package com.fztl.harsha.gamerain;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

public class GRThread extends Thread {
    private SurfaceHolder surfaceHolder;
    private GRGame grGame;
    private boolean running;
    public static Canvas canvas;

    public GRThread(SurfaceHolder surfaceHolder, GRGame grGame) {

        super();
        this.surfaceHolder = surfaceHolder;
        this.grGame = grGame;

    }
    @Override
    public void run() {
        while (running) {
            canvas = null;

            try {
                canvas = this.surfaceHolder.lockCanvas();
                synchronized(surfaceHolder) {
                    this.grGame.update();
                    this.grGame.draw(canvas);
                }
            } catch (Exception e) {} finally {
                if (canvas != null) {
                    try {
                        surfaceHolder.unlockCanvasAndPost(canvas);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public void setRunning(boolean isRunning) {
        running = isRunning;
    }
}