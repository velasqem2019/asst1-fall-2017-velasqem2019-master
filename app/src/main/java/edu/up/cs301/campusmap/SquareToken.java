package edu.up.cs301.campusmap;

import android.graphics.Canvas;

/**
 * <!-- class SquareToken -->
 *
 * This class represents a  single square map token that can be drawn on a canvas, and inherits from SimpleMaptoken
 *
 * @author Emily Velasquez
 * */

public class SquareToken extends SimpleMapToken {
    public SquareToken(float xCoord, float yCoord)
    {
      super(xCoord,yCoord);
    }
    /**
     * this token can paint itself on a given canvas
     * @param canvas the canvas on which to draw
     */
    public void drawOn(Canvas canvas) {
        // paint the square on the canvas
        canvas.drawRect(x,y, x+30, y+30, paint);
    }//drawOn
}
