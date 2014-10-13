import javax.swing.JFrame;
/**
 * A class that creates a frame for the program.
 * 
 * @Riley) 
 * @9/22/14
 */
public class TargetViewer
{
    public static void main(String [] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(300,400);
        frame.setTitle("The Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component = new TargetComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
