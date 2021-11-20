package com.fztl.harsha.gamerain;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class GRSprite {
    private final Bitmap image;
    private final float left;
    private final float top;

    public GRSprite(Bitmap image,float left,float top){
        this.image = image;
        this.left = left;
        this.top = top;
    }

    public void draw(Canvas canvas){
        canvas.drawBitmap(this.image,this.left,this.top,null);
    }
}