package com.fztl.harsha.gamerain;

import android.graphics.Canvas;

public class GRSprite {
    private Bitmap image;
    private float left;
    private float top;

    public GRSprite(Bitmap image,float left,float top){
        this.image = image;
        this.left = left;
        this.top = top;
    }

    public void draw(Canvas canvas){
        canvas.drawBitmap(this.image,this.left,this.top,null);
    }
}