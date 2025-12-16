package searchperformance;

public class ArraySearch {

    public static void arraySearch(int[] arr, int key)
    {
        long startTime = System.nanoTime();

        for (int j = 0; j < 1000; j++)
        {
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] == key)
                {
                    break;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("ARRAY SEARCH PERFORMANCE TIME : "+(endTime - startTime) + " ns");
    }
}
