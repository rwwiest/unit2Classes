import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * This Class will create a soccer field within the frame by drawing a variety of shapes.
 * 
 * @Riley
 * @Wiest
 */
public class Field
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    private int touchline;
    private int endline;
    

    /**
     * Default constructor for objects of class Field
     */
    public Field(int x, int y)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
        touchline = 500;
        endline = 300;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Rectangle sidelines = new Rectangle(xLeft,yTop,touchline,endline);
        Rectangle firstBox = new Rectangle(xLeft, yTop + 40, 90 , 220);
        Rectangle secondBox = new Rectangle(xLeft, yTop+ 100, 30 , 100);
        
        
        Rectangle firstBox2 = new Rectangle(xLeft + 410, yTop + 40, 90 , 220);
        Rectangle secondBox2 = new Rectangle(xLeft + 470, yTop+ 100, 30 , 100);
        
        Point2D.Double h1 = new Point2D.Double(xLeft +250, yTop);
        Point2D.Double h2 = new Point2D.Double(xLeft +250, yTop + 300);
        
        Line2D.Double halfField = new Line2D.Double(h1,h2);
        
        
        
        g2.draw(sidelines);
        g2.draw(firstBox);
        g2.draw(secondBox);
        g2.draw(firstBox2);
        g2.draw(secondBox2);
        g2.draw(halfField);
    }

}
