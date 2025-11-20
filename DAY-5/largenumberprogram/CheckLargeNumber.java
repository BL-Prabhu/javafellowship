package largenumberprogram;

import java.util.Scanner;

public class CheckLargeNumber
{

    public static void findLargeNumber()
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("ENTER THREE NUMBERS");

        int[] input=new int[3];
        int maxNumber=input[0];

        for(int i=0;i<3;i++)
        {
            input[i]=scan.nextInt();
            System.out.println(input[i]);

            if(maxNumber<input[i])
            {
               maxNumber= input[i];
            }
        }
        System.out.println("LARGEST NUMBER : "+maxNumber);
    }
    public static void main(String[] args)
    {
        CheckLargeNumber.findLargeNumber();
    }
}
