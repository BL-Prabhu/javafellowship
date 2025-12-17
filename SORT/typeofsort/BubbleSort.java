package typeofsort;

import java.util.Arrays;

public class BubbleSort
{

    public static void bubbleSort()
    {
        int[] input={9,1,8,2,7,3,6,4,5};
        int size=input.length;
        int temp=0;

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(input[j]>input[j+1])
                {
                    temp=input[j+1];
                    input[j+1]=input[j];
                    input[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(input));
    }

    public static void main(String[] args)
    {
        BubbleSort.bubbleSort();
    }
}
