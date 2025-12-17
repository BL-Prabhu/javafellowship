package typeofsort;

import java.util.Arrays;

public class InsertionSort
{

    public static void insertionSort()
    {
        int[] input={9,1,8,2,7,3,6,4,5};
        int size=input.length;

        for(int i=1;i<input.length;i++)
        {
            int key=input[i];
            int j=i-1;
            while(j>=0 && input[j]>key)
            {
                input[j+1]=input[j];
                j--;
            }
            input[j+1]=key;
        }
        System.out.println(Arrays.toString(input));
    }

    public static void main(String[] args)
    {
        InsertionSort.insertionSort();
    }
}
