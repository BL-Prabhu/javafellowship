package sumofthreenumbers;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfThreeNumbers
{

    public static int[] sumOfThreeNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE ARRAY");
        int n=scan.nextInt();
        int[] array=new int[n];
        System.out.println("ENTER THE ARRAY VALUES");

        for(int i=0;i< array.length;i++)
        {
            array[i]=scan.nextInt();
        }
        return array;
    }

    public static void SumOfNumberInArray(int[] array)
    {
        int count=0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                for(int k=j+1;k<array.length;k++)
                {
                    if(array[i]+array[j]+array[k] == 0)
                    {
                        count++;
                        System.out.println("VALUE OF THREE NUMBERS : "+array[i]+","+array[j]+","+array[k]);
                    }
                }
            }
        }
        System.out.println("COUNT IS : "+count);
    }

    public static void main(String[] args)
    {
        int[] inputarray=SumOfThreeNumbers.sumOfThreeNumber();
        SumOfThreeNumbers.SumOfNumberInArray(inputarray);
    }
}
