package edu.up.cs301.campusmap;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.os.Build;

/**
 * <!-- class SquareToken -->
 *
 * This class represents a  single square map token that can be drawn on a canvas, and inherits from SimpleMaptoken
 *
 * @author Emily Velasquez
 * */

public class UPmapToken extends SimpleMapToken {
    public UPmapToken(float xCoord, float yCoord)
    {
        super(xCoord,yCoord);
    }
    /**
     * this token can paint itself on a given canvas
     * @param canvas the canvas on which to draw
     */


    public void drawOn(Canvas canvas) {
        // paint the square on the canvas
        canvas.drawRect(x,y, x-10, y+40, paint);
        canvas.drawRect(x+10,y+5, x-20, y+20, paint);

    }//drawOn
}
