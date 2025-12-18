package quicksort;

import java.util.Arrays;

public class QuickSort
{
    public static void swapMethod(int[] array,int firstIndex,int secondIndex)
    {
        int temp=array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;
    }

    public static int findPivot(int[] array,int pivotIndex,int endIndex)
    {
        int swapIndex=pivotIndex;

        for(int i=pivotIndex+1;i<=endIndex;i++)
        {
            if(array[i]<array[pivotIndex])
            {
                swapIndex++;
                swapMethod(array,swapIndex,i);
            }
        }
        swapMethod(array,pivotIndex,swapIndex);
        return swapIndex;
    }

    public static void quickSort(int[] array,int left,int right)
    {
        if(left<right)
        {
            int pivotIndex=findPivot(array,left,right);
            quickSort(array,left,pivotIndex-1);
            quickSort(array,pivotIndex+1,right);

        }
    }

    public static void quickSortHelper(int[] array)
    {
        quickSort(array,0,array.length-1);
    }
}
