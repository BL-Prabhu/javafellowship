package fibonacci;

import java.util.Scanner;

public class Fibonacci
{

    public static void printFibonacciSeries()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE FIRST  NUMBER");
        int firstNumber=scan.nextInt();
        System.out.println("ENTER THE SECOND  NUMBER");
        int secondNumber=scan.nextInt();
        System.out.println("ENTER THE NUMBER YOU WANT TO COUNT");
        int series=scan.nextInt();
        int thridNumber;

        for(int i=1;i<=series;i++)
        {
            System.out.println(firstNumber);
            thridNumber=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=thridNumber;
        }
    }

    public static void main(String[] args)
    {
        Fibonacci.printFibonacciSeries();
    }
}
