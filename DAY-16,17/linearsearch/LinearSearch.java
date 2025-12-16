package linearsearch;

public class LinearSearch
{

    public static void linearSearch(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                 System.out.println("INDEX : "+i);
            }
        }
      return;
    }

    public static void main(String[] args)
    {
        int[] data = {5, 12, 18, 25, 33, 47, 60};
        int target = 33;

        LinearSearch.linearSearch(data,target);
    }
}
