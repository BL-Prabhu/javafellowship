package reversenumber;

public class ReverseNumberService
{
    public int reverseUsingForLoop(int num)
    {
        int reverse = 0;

        for (; num > 0; num = num / 10)
        {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
        }
        return reverse;
    }

    public int reverseUsingWhileLoop(int num)
    {
        int reverse = 0;

        while (num > 0)
        {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        return reverse;
    }

    public int reverseUsingRecursion(int num)
    {
        return reverseRec(num, 0);
    }

    private int reverseRec(int num, int reverse)
    {
        if (num == 0)
        {
            return reverse;
        }
        return reverseRec(num / 10, reverse * 10 + num % 10);
    }
}
