package insertionsort;

import java.util.Arrays;

public class InsertionSort
{
    public static void insertionSort()
    {
        int[] input={6,5,4,3,2,1};
        int size=input.length;

        for(int i=1;i<size;i++)
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
