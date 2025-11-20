package evenorodd;

import java.util.Scanner;

public class CheckEvenOrOdd
{
    public static void checkGivenNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int number=scan.nextInt();

        if(number%2 == 0)
        {
            System.out.println("EVEN NUMBER");
        }
        else
        {
            System.out.println("ODD NUMBER");
        }
    }

    public static void checkEvenOrOddGivenRange()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE RANGE NUMBER");
        int numberRange=scan.nextInt();

        for(int i=1;i<=numberRange;i++)
        {
            if(i%2 == 0)
            {
                System.out.println(i+" - "+"EVEN NUMBER");
            }
            else
            {
                System.out.println(i+" - "+"ODD NUMBER");
            }
        }
    }
    public static void main(String[] args)
    {
        CheckEvenOrOdd.checkGivenNumber();
        CheckEvenOrOdd.checkEvenOrOddGivenRange();
    }
}
