package searchperformance;

import java.util.HashSet;

public class HashSetSearch {

    public static void HashsetSearch(HashSet<Integer> set, int key)
    {
        long startTime = System.nanoTime();

        for (int i = 0; i < 1000; i++)
        {
            set.contains(key);
        }
        long endTime = System.nanoTime();
        System.out.println("HASHSET SEARCH PERFORMANCE TIME : "+(endTime - startTime) + " ns");
    }
}
