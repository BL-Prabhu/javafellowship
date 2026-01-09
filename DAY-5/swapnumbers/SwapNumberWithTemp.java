package swapnumbers;

import java.util.Scanner;

public class SwapNumberWithTemp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int first=scan.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int second=scan.nextInt();
        int temp;

        temp=first;
        first=second;
        second=temp;

        System.out.println("FIRST NUMBER : "+first);
        System.out.println("SECOND NUMBER : "+second);



    }
}
