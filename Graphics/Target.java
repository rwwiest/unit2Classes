import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * this class creates the shape of the Target.
 * 
 * @Riley 
 * @9/22/14
 */
public class Target
{
    private int radius;
    private int xLeft;
    private int yTop;
    
    public Target(int radius,int xLeft, int yTop)
    {
        this.radius = radius;
        this.xLeft = xLeft;
        this.yTop = yTop;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double bigCircle = new Ellipse2D.Double(this.xLeft,this.yTop,this.radius,this.radius);
        //bigCircle.fill(color.BLACK);
        Ellipse2D.Double circle2 = new Ellipse2D.Double(this.xLeft*11/10,this.yTop*11/10,this.radius*4/5,this.radius*4/5);
        //bigCircle.fill(color.WHITE);
        Ellipse2D.Double circle3 = new Ellipse2D.Double(this.xLeft*12/10,this.yTop*12/10,this.radius*3/5,this.radius*3/5);
        //bigCircle.fill(color.BLACK);
        Ellipse2D.Double circle4 = new Ellipse2D.Double(this.xLeft*13/10,this.yTop*13/10,this.radius*2/5,this.radius*2/5);
        //bigCircle.fill(color.WHITE);
        Ellipse2D.Double circle5 = new Ellipse2D.Double(this.xLeft*14/10,this.yTop*14/10,this.radius/5,this.radius/5);
        //bigCircle.fill(color.BLACK);
        
        g2.draw(bigCircle);
        //g2.fill(bigCircle);
        g2.draw(circle2);
        //g2.fill(circle2);
        g2.draw(circle3);
        //g2.fill(circle3);
        g2.draw(circle4);
        g2.fill(circle4);
        g2.draw(circle5);
        g2.fill(circle5);
    }
}
