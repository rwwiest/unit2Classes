import java.util.Scanner;
public class PhoneNumber
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print ("Please enter a ten digit integer: ");
        String number = s.next();
        int length = number.length();
        String areaCode ="(" + number.substring(0,3) + ") ";
        String remainingNumber = number.substring(3,6) + "-" + number.substring(6,10);
        System.out.println(areaCode + remainingNumber);
    }
}
