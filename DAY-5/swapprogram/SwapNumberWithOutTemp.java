package swapprogram;

import java.util.Scanner;

public class SwapNumberWithOutTemp
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int first=scan.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int second=scan.nextInt();

        first=first+second;
        second=first-second;
        first=first-second;

        System.out.println("FIRST NUMBER : "+first);
        System.out.println("SECOND NUMBER : "+second);
    }
}
