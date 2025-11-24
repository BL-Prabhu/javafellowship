package monthlypayment;

import java.util.Scanner;

public class MonthlyPayment
{
    public static void calculateMonthlyPayment(int principal,int interestRate,int year)
    {
        int yearInMonths=year*12;
        double rateInMonthly=interestRate/(12*100);
        if(rateInMonthly == 0)
        {
            System.out.println("MONTHLY PAYMENT : "+principal/yearInMonths);
        }
        else
        {
            double emi = (principal * rateInMonthly) / (1 - Math.pow(1 + rateInMonthly, -yearInMonths));
            System.out.println("MONTHLY PAYMENT : "+emi);
        }
    }

    public static void getMonthlyPayment()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE PRINCIPLE AMOUNT OF LOAN");
        int principal=scan.nextInt();
        System.out.println("ENTER THE INTEREST PERCENTAGE");
        int interestRate=scan.nextInt();
        System.out.println("ENTER THE YEAR");
        int year=scan.nextInt();

        MonthlyPayment.calculateMonthlyPayment(principal,interestRate,year);
    }
    public static void main(String[] args)
    {
        MonthlyPayment.getMonthlyPayment();
    }
}
