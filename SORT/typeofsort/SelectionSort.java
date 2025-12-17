package typeofsort;

import java.util.Arrays;

public class SelectionSort
{
    public static void selectionSort()
    {
        int[] input={9,1,8,2,7,3,6,4,5};
        int size=input.length;
        int temp=0;
        int minIndex=-1;

        for(int i=0;i<size-1;i++)
        {
            minIndex=i;
            for(int j=i+1;j<size;j++)
            {
                if(input[minIndex]>input[j])
                {
                    minIndex=j;
                }
            }
            temp=input[minIndex];
            input[minIndex]=input[i];
            input[i]=temp;
        }
        System.out.println(Arrays.toString(input));
    }

    public static void main(String[] args)
    {
        SelectionSort.selectionSort();
    }
}
