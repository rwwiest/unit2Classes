import java.util.Scanner;
public class BigNumbers
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        String number = "";
        System.out.print ("Please enter an integer between 1,000 and 999,999): ");
        number = s.next();
        int length = number.length();
        System.out.println(number.substring(0,length-4)+number.substring(length-3,length));
    }
}
