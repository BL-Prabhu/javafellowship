package mergesort;

import java.util.Arrays;

public class MergeSort
{

    public static int[] merge(int[] arrayone,int[] arraytwo)
    {
        int[] resultArray=new int[arrayone.length+arraytwo.length];
        int index=0;
        int i=0;
        int j=0;
        while(i<arrayone.length && j<arraytwo.length)
        {
            if(arrayone[i]<arraytwo[j])
            {
                resultArray[index]=arrayone[i];
                index++;
                i++;
            }
            else
            {
                resultArray[index]=arraytwo[j];
                index++;
                j++;
            }
        }
        while(i<arrayone.length)
        {
            resultArray[index]=arrayone[i];
            index++;
            i++;
        }
        while(j<arraytwo.length)
        {
            resultArray[index]=arraytwo[j];
            index++;
            j++;
        }
        return resultArray;
    }

    public static void main(String[] args)
    {
        int[] array1={2,4,6,8,10};
        int[] array2={1,3,5,7,9};
        int[] result=merge(array1,array2);

        System.out.println(Arrays.toString(result));
    }
}
