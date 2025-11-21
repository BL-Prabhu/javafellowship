package perfectnumber;

import java.util.Scanner;

public class PerfectNumber
{

    public static void findPerfectNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO CHECK");
        int input=scan.nextInt();
        int sum=0;

        for(int i=1;i<input;i++)
        {
            if(input%i == 0)
            {
                System.out.println("PROPER DIVISORS ARE : "+i);
                sum=sum+i;
            }
        }

        if(input == sum)
        {
            System.out.println("PERFECT NUMBER");
        }
        else
        {
            System.out.println("NOT PERFECT NUMBER");
        }

        System.out.println("SUM OF THE PROPER DIVISOR : "+sum);
    }

    public static void main(String[] args)
    {
        PerfectNumber.findPerfectNumber();
    }
}
