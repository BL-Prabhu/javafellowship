package quicksort;

import java.util.Arrays;

import static quicksort.QuickSort.quickSort;
import static quicksort.QuickSort.quickSortHelper;

public class QuickMain
{
    public static void main(String[] args)
    {
        int[] myArray={6,5,4,3,2,1};
        System.out.println("BEFORE QUICK SORT");
        System.out.println("---------------");
        System.out.println(Arrays.toString(myArray));
        quickSortHelper(myArray);
        System.out.println("AFTER QUICK SORT");
        System.out.println("---------------");
        System.out.println(Arrays.toString(myArray));
    }
}
