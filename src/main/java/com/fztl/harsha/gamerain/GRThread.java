package com.fztl.harsha.gamerain;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

public class GRThread extends Thread {
    private final SurfaceHolder surfaceHolder;
    private final GRGame grGame;
    private boolean running;
    public static Canvas tcanvas;

    public GRThread(SurfaceHolder surfaceHolder, GRGame grGame) {

        super();
        this.surfaceHolder = surfaceHolder;
        this.grGame = grGame;

    }
    @Override
    public void run() {
        while (running) {
            tcanvas = null;

            try {
                tcanvas = this.surfaceHolder.lockCanvas();
                synchronized(surfaceHolder) {
                    this.grGame.update();
                    this.grGame.draw(tcanvas);
                }
            } catch (Exception ignored) {} finally {
                if (tcanvas != null) {
                    try {
                        surfaceHolder.unlockCanvasAndPost(tcanvas);
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