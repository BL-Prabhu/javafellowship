package searchperformance;

import java.util.HashSet;
import java.util.TreeSet;

public class Main
{
    public static void main(String[] args)
    {
        int size = 1000000;
        int key = size - 1;

        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = i;
        }

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < size; i++)
        {
            hashSet.add(i);
        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < size; i++)
        {
            treeSet.add(i);
        }

        ArraySearch.arraySearch(arr,key);
        HashSetSearch.HashsetSearch(hashSet,key);
        TreeSetSearch.TreesetSearch(treeSet,key);
    }
}
