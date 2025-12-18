package mergesort;

import java.util.Arrays;

public class MergeSort
{

    public static int[] merge(int[] arrayOne,int[] arrayTwo)
    {
        int[] resultArray=new int[arrayOne.length+arrayTwo.length];
        int index=0;
        int i=0;
        int j=0;

        while(i<arrayOne.length && j<arrayTwo.length)
        {
            if(arrayOne[i]<arrayTwo[j])
            {
                resultArray[index]=arrayOne[i];
                index++;
                i++;
            }
            else
            {
                resultArray[index]=arrayTwo[j];
                index++;
                j++;
            }
        }
        while(i<arrayOne.length)
        {
            resultArray[index]=arrayOne[i];
            index++;
            i++;
        }
        while(j<arrayTwo.length)
        {
            resultArray[index]=arrayTwo[j];
            index++;
            j++;
        }
        return resultArray;
    }

    public static int[] mergeSort(int[] array)
    {
        if(array.length==1)
        {
            return array;
        }
        int midIndex=array.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(array,0,midIndex));
        int[] right=mergeSort(Arrays.copyOfRange(array,midIndex,array.length));
       return merge(left,right);
    }

    public static void main(String[] args)
    {
        int[] inputArray={7,6,4,5,2,3,1};
        int[] result=mergeSort(inputArray);
        System.out.println(Arrays.toString(result));


    }
}
