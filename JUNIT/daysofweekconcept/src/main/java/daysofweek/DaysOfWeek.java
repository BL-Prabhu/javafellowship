package daysofweek;

import java.util.Scanner;

public class DaysOfWeek
{

    public static void dayOfWeek(int month,int day,int year)
    {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;

        System.out.println("DAYS OF WEEK : "+day);

        switch (d0)
        {
            case 0 :
                System.out.println(d0 +" ->SUNDAY");
                break;
            case 1 :
                System.out.println(d0 +" ->MONDAY");
                break;
            case 2 :
                System.out.println(d0 +" ->TUESDAY");
                break;
            case 3 :
                System.out.println("WEDNESDAY");
                break;
            case 4 :
                System.out.println(d0 +" ->THURSDAY");
                break;
            case 5 :
                System.out.println(d0 +" ->FRIDAY");
                break;
            case 6 :
                System.out.println(d0 +" ->SATURDAY");
                break;
        }
    }

    public static void calculateDaysOfWeek()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE DAY (1 TO 31)");
        int day=scan.nextInt();
        System.out.println("ENTER THE MONTH (1 TO 12)");
        int month=scan.nextInt();
        System.out.println("ENTER THE YEAR");
        int year=scan.nextInt();

        DaysOfWeek.dayOfWeek(month,day,year);
    }
    public static void main(String[] args)
    {
        DaysOfWeek.calculateDaysOfWeek();
    }

}
