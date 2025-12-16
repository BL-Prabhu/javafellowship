package performancetimeoffibonacci;

public class IterativeFibonacci
{
    public static int fibonacci(int n)
    {

        if (n <= 1)
        {
            return n;
        }

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++)
        {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {

        int n = 40;

        long startTime = System.currentTimeMillis();

        int result = fibonacci(n);

        long endTime = System.currentTimeMillis();

        System.out.println("Iterative Fibonacci Result: " + result);
        System.out.println("Iterative Time Taken: " +
                (endTime - startTime) + " ms");
    }
}
