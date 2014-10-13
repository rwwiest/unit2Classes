import java.util.Scanner;
public class RectangleCalculation
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        double length, width;
        System.out.print ("Enter the length: ");
        length = s.nextDouble();
        System.out.print ("Enter the width: ");
        width = s.nextDouble();
        double area = length * width;
        double diagonal = Math.sqrt(Math.pow(length,2)+Math.pow(width,2));
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The diagonal of the rectangle is: " + diagonal);
    }
}
