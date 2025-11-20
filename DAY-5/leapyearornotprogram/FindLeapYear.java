package leapyearornotprogram;

import java.util.Scanner;

public class FindLeapYear
{

    public static void findLeapYearOrNot()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE YEAR TO CHECK ");
        int input=scan.nextInt();

        if((input % 4 == 0 && input% 100 !=0) || (input % 400 == 0))
        {
            System.out.println("IT IS LEAP YEAR");
        }
        else
        {
            System.out.println("IT IS NOT LEAP YEAR");
        }
    }

    public static void main(String[] args)
    {
        FindLeapYear.findLeapYearOrNot();
    }
}
