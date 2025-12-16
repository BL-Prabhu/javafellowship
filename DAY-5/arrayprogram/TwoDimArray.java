package arrayprogram;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArray
{
    public static int[][] getAndPrintArrayValues()
    {
        Scanner scan = new Scanner(System.in);
        int[][] array=new int[2][2];
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                System.out.println("ENTER THE VALUE FOR [" + i + "][" + j + "]:");
                array[i][j] = scan.nextInt();
            }
        }
        return array;
    }

    public static void PrintArrayValues(int[][] array)
    {
        System.out.println("PRINT THE ARRAY");
        System.out.println("----------------");

        for(int i=0;i< array.length;i++)
        {
            for(int j=0;j< array[i].length;j++)
            {
                System.out.println(array[i][j]);
            }
        }
    }

    public static void main(String[] args)
    {
       int[][] arr = TwoDimArray.getAndPrintArrayValues();
        TwoDimArray.PrintArrayValues(arr);
    }
}
