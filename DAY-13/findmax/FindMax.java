package findmax;

public class FindMax
{
    public static Integer findMax(Integer a, Integer b, Integer c)
    {
        Integer max = a;

        if (b.compareTo(max) > 0)
        {
            max = b;
        }
        if (c.compareTo(max) > 0)
        {
            max = c;
        }
        return max;
    }

    public static void main(String[] args)
    {
        Integer a1 = 30, b1 = 20, c1 = 10;
        System.out.println("Test Case 1 (Max 1st): " + findMax(a1, b1, c1));

        Integer a2 = 10, b2 = 50, c2 = 20;
        System.out.println("Test Case 2 (Max 2nd): " + findMax(a2, b2, c2));

        Integer a3 = 15, b3 = 25, c3 = 40;
        System.out.println("Test Case 3 (Max 3rd): " + findMax(a3, b3, c3));
    }
}
