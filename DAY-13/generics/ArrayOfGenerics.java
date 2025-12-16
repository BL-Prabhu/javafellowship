package generics;

public class ArrayOfGenerics
{

    public static <T> void PrintArray(T[] array)
    {
        for(T elements : array)
        {
            System.out.println(elements);
        }
    }

    public static void main(String[] args)
    {
        Integer[] intarray={1,2,3,4,5};
        PrintArray(intarray);

        String[] stringArray={"prabhu","arjun","balaji"};
        PrintArray(stringArray);
    }
}
