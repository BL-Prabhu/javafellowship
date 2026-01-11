package perfectnumber;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumberService
{
    public List<Integer> getProperDivisors(int number)
    {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i < number; i++)
        {
            if (number % i == 0)
            {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public boolean isPerfectNumber(int number)
    {
        int sum = 0;
        for (int divisor : getProperDivisors(number))
        {
            sum += divisor;
        }
        return sum == number;
    }

    public int sumOfDivisors(int number)
    {
        int sum = 0;
        for (int divisor : getProperDivisors(number))
        {
            sum += divisor;
        }
        return sum;
    }
}
