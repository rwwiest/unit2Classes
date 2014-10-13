import java.util.Scanner;

public class Annuity
{
    public void Equation()
    {
        Scanner s = new Scanner(System.in);
        double PVann;
        System.out.print ("Enter your periodic payment: ");
        double PMT = s.nextDouble();
        System.out.print ("Enter your compound rate: ");
        double i = s.nextDouble();
        System.out.print ("Enter your number of payments: ");
        double n = s.nextDouble();
        double power = Math.pow((1+i),(n-1));
        PVann = PMT * ((((power - 1) / i ) / power) + 1);
        System.out.println(PVann);
    }
}