package quadratic;

import java.util.Scanner;

public class Quadratic
{

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE VALUE A");
        int a=scan.nextInt();
        System.out.println("ENTER THE VALUE B");
        int b=scan.nextInt();
        System.out.println("ENTER THE VALUE C");
        int c=scan.nextInt();

        int delta = b*b-4*a*c ;
        System.out.println(delta);

        if(delta<0)
        {
            delta = delta*-1;
        }
        else
        {
            Quadratic.findRoot1(a,b,c,delta);
            Quadratic.findRoot2(a,b,c,delta);
        }

    }
    public static void findRoot1(int a,int b,int c,int delta)
    {
        double resultOfX=(-b+Math.sqrt(delta))/(2*a);
        System.out.println(resultOfX);
    }
    public static void findRoot2(int a,int b,int c,int delta)
    {
        double resultOfX = (-b-Math.sqrt(delta))/(2*a);
        System.out.println(resultOfX);
    }

}
