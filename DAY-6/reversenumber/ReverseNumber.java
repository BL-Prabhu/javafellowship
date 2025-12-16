package reversenumber;

import java.util.Scanner;

public class ReverseNumber
{

    public static void printReverseNumberUsingForLoop()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO REVERSE");
        int num=scan.nextInt();
        int reverse=0;

        for(;num>0;num=num/10)
        {
            int remainder=num%10;
            reverse=reverse*10+remainder;
        }
        System.out.println(" REVERSE NUMBER : "+reverse);
    }

    public static void printReverseNumberUsingWhileLoop()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO REVERSE");
        int num=scan.nextInt();
        int reverse=0;

        while (num>0)
        {
            int remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
        System.out.println("REVERSE NUMBER : "+reverse);
    }

     static int reverse=0;

    public static void PrintReverseNumberUsingRecursion(int num)
    {
        if(num>0)
        {
            reverse=reverse*10+num%10;
            PrintReverseNumberUsingRecursion(num/10);

        }
    }

    public static void main(String[] args)
    {
       // ReverseNumber.printReverseNumberUsingForLoop();
       // ReverseNumber.printReverseNumberUsingWhileLoop();
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO REVERSE USING RECURSION");
        int num=scan.nextInt();
        ReverseNumber.PrintReverseNumberUsingRecursion(num);
        System.out.println(reverse);


    }
}
