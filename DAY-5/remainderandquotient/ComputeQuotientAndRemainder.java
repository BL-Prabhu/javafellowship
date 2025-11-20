package remainderandquotient;

import java.util.Scanner;

public class ComputeQuotientAndRemainder
{

    public static void computeQuotient()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE DIVIDEND");
        int dividend=scan.nextInt();
        System.out.println("ENTER THE DIVISOR");
        int divisor=scan.nextInt();
        int quotient=dividend/divisor;
        int remainder=dividend%divisor;
        System.out.println("QUOTIENT : "+quotient);
        System.out.println("REMAINDER : "+remainder);
    }
    public static void main(String[] args)
    {
        ComputeQuotientAndRemainder.computeQuotient();
    }
}
