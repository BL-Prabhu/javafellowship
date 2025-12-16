package primenumber;

import java.util.Scanner;

public class PrimeNumber
{
    public static void checkPrimeNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO CHECK");
        int input=scan.nextInt();
        int sum=0;

        for(int i=1;i<=input;i++)
        {
            if(input%i == 0)
            {
                sum++;
            }
        }
        if(sum == 2)
        {
            System.out.println("PRIME NUMBER");
        }
        else if(sum != 2 || input == 1 || input == 2 )
        {
            System.out.println("NOT PRIME NUMBER");
        }
        else
        {
            System.out.println("NOT PRIME NUMBER");
        }
    }
    public static void main(String[] args)
    {
        PrimeNumber.checkPrimeNumber();
    }
}
