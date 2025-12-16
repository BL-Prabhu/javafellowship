package searchperformance;

import java.util.TreeSet;

public class TreeSetSearch
{

    public static void TreesetSearch(TreeSet<Integer> set, int key)
    {
        long startTime = System.nanoTime();

        for (int i = 0; i < 1000; i++)
        {
            set.contains(key);
        }
        long endTime = System.nanoTime();
        System.out.println("TREESET SEARCH PERFORMANCE TIME : "+(endTime - startTime) + " ns");
    }
}
