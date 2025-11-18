package programinemployee;

import java.util.Random;
import java.util.Scanner;

class EmployeeWageCalculator
{
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOURS = 8;
    private static final int PART_TIME_HOURS = 4;
    private static final int MAX_WORKING_DAYS =20;
    private static final int MAX_WORKING_HOURS =100;

    Random random=new Random();

    public String isEmployeePresent()
    {
        int attendance=random.nextInt(2);
        if(attendance == 1)
        {
            return "EMPLOYEE IS PRESENT";
        }
        else
        {
            return "EMPLOYEE IS ABSENT";
        }
    }

    public void getDailyWages()
    {
        System.out.println("NUMBER : 0 IS EMPLOYEE IS ABSENT");
        System.out.println("NUMBER : 1 IS FULL TIME EMPLOYEE");
        System.out.println("NUMBER : 2 IS PART TIME EMPLOYEE");

        int employeeType=random.nextInt(3);
        System.out.println("EMPLOYEE TYPE IS : "+employeeType);
        int hours=0;
        int dailyWages;

        switch (employeeType)
        {
            case 0 :
                hours=0;
                System.out.println("EMPLOYEE IS ABSENT");
                break;
            case 1 :
                hours=FULL_DAY_HOURS;
                System.out.println("FULL TIME EMPLOYEE");
                break;
            case 2 :
                hours=PART_TIME_HOURS;
                System.out.println("PART TIME EMPLOYEE");
                break;
        }
        dailyWages=hours*WAGE_PER_HOUR;
        System.out.println("DAILY WAGES OF EMPLOYEE : "+dailyWages);
    }
    public void getMonthlyWage()
    {

        System.out.println("NUMBER : 0 IS EMPLOYEE IS ABSENT");
        System.out.println("NUMBER : 1 IS FULL TIME EMPLOYEE");
        System.out.println("NUMBER : 2 IS PART TIME EMPLOYEE");
        int monthlyWageDetails=0;
        int empType=random.nextInt(3);
        System.out.println(empType);

        switch (empType)
        {
            case 0 :
                System.out.println("EMPLOYEE IS ABSENT");
                monthlyWageDetails=0;
                break;
            case 1 :
                System.out.println("FULL TIME EMPLOYEE");
                int fullTimeEmployeeMonthlyHours =MAX_WORKING_DAYS*FULL_DAY_HOURS;
                monthlyWageDetails=fullTimeEmployeeMonthlyHours*WAGE_PER_HOUR;
                break;

            case 2 :
                System.out.println("PART TIME EMPLOYEE");
                int partTimeEmployeeMonthlyHours=MAX_WORKING_DAYS*PART_TIME_HOURS;
                monthlyWageDetails=partTimeEmployeeMonthlyHours*WAGE_PER_HOUR;
                break;
        }
        System.out.println("MONTHLY WAGES DETAILS : "+monthlyWageDetails);
    }

    public void getWagesPerCondition()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE WORING DAYS");
        int workDays=scan.nextInt();
        System.out.println("ENTER THE WORING HOURS");
        int workhours=scan.nextInt();
        int wageDetails=0;

        for(int i=1;i<=workDays;i++)
        {
            for(int j=1;j<=workhours;j++)
            {
                wageDetails= wageDetails+WAGE_PER_HOUR;
            }
        }
        System.out.println("YOUR WORKING DAYS -> "+workDays);
        System.out.println("YOUR WORKING HOURS -> "+workhours);
        System.out.println("YOUR WAGES -> "+wageDetails);
    }
}
public class EmployeeWageComputation
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        EmployeeWageCalculator wagecalculator=new EmployeeWageCalculator();

        while (true)
        {
            System.out.println("NUMBER : 1 -> TO CHECK EMPLOYEE IS PRESENT OR NOT");
            System.out.println("NUMBER : 2 -> TO CHECK DAILY WAGES DETAILS");
            System.out.println("NUMBER : 3 -> TO CHECK MONTHLY WAGES DETAILS");
            System.out.println("NUMBER : 4 -> TO CHECK WAGES PER GIVEN CONDITION");
            System.out.println("NUMBER : 5 -> TO EXIT THE PROGRAM");
//            System.out.println("EMPLOYEE WAGE DETAILS");

            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                   System.out.println( wagecalculator.isEmployeePresent());
                    break;
                case 2 :
                    wagecalculator.getDailyWages();
                    break;
                case 3 :
                    wagecalculator.getMonthlyWage();
                    break;
                case 4 :
                    wagecalculator.getWagesPerCondition();
                    break;
                case 5 :
                    System.exit(0);
                default:
                    System.out.println("INVALID INPUT");
            }

        }
    }
}
