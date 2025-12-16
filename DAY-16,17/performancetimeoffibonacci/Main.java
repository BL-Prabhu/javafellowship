package performancetimeoffibonacci;

import static performancetimeoffibonacci.RecursiveFibonacci.fibonacci;

public class Main
{
    public static void main(String[] args)
    {
        int n = 40;
        System.out.println("RECURSIVE PERFORMANCE TIME");
        System.out.println("----------------------------");
        long recursiveStartTime = System.currentTimeMillis();
        int recursiveResult = fibonacci(n);
        long recursiveEndTime = System.currentTimeMillis();
        System.out.println("RECURSIVE RESULT : "+recursiveResult);
        System.out.println(" RECURSIVE TIME : "+(recursiveEndTime - recursiveStartTime) +" ms");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("ITERATIVE PERFORMANCE TIME");
        System.out.println("----------------------------");
        long iterativeStartTime = System.currentTimeMillis();
        int iterativeResult = fibonacci(n);
        long iterativeEndTime = System.currentTimeMillis();
        System.out.println("Iterative Fibonacci Result: " + iterativeResult);
        System.out.println("ITERATIVE TIME : "+(iterativeEndTime - iterativeStartTime) +" ms");
    }
}
