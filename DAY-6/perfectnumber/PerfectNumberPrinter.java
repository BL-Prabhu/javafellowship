package perfectnumber;

import java.util.List;

public class PerfectNumberPrinter
{
    public void printDivisors(List<Integer> divisors)
    {
        System.out.println("PROPER DIVISORS ARE:");
        for (int d : divisors)
        {
            System.out.println(d);
        }
    }

    public void printResult(int number, boolean isPerfect, int sum)
    {
        System.out.println(isPerfect ? "PERFECT NUMBER" : "NOT PERFECT NUMBER");
        System.out.println("SUM OF THE PROPER DIVISORS : " + sum);
    }
}
