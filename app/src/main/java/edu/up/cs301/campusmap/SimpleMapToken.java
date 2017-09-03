//dummy comment
package edu.up.cs301.campusmap;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import java.util.Random;

/**
 * <!-- class SimpleMapToken -->
 *
 * This class represents a single map token that can be drawn on a canvas
 *
 * @author Andrew M. Nuxoll
 * @author Steven R. Vegdahl
 * @author Emily Velasquez
 * @version August 2017
 */
public class SimpleMapToken {

    // instance variables
    protected float x; // my x coordinate
    protected float y; // my y coordinate
    protected float radius; //my radius
    protected Paint paint;  //my color

    /**
     * Constructor
     * @param xCoord the x-coordinate
     * @param yCoord the y-coordinate
     */
    public SimpleMapToken(float xCoord, float yCoord) {
        // initialize the instance variables
        x = xCoord; // x-coordinate
        y = yCoord; // y-coordinate
        radius = 15; // radius of the circle
        paint = new Paint(); // paint object,
        Random rand = new Random(); // random number generator, to asign random numbers to RGB values
        int redVal = rand.nextInt(254)+1; // asigns random number to Red value
        int greenVal = rand.nextInt(254)+1; // asigns random number to green value
        int blueVal = rand.nextInt(254)+1; // asigns random number to blue value
        int ranRGB = Color.rgb(redVal,greenVal,blueVal); // creates a color of a random RGB value
        paint.setColor(ranRGB); // paint object uses random RGB value to paint
    }//ctor

    /**
     * this token can paint itself on a given canvas
     * @param canvas the canvas on which to draw
     */
    public void drawOn(Canvas canvas) {
        // paint the dot on the canvas
        canvas.drawCircle(x, y, radius, paint);
    }//drawOn

}//class SimpleMapToken
