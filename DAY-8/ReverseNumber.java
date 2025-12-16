public class ReverseNumber
{
    public static void main(String[] args)
    {
        int input=12345;
        int original=input;
        int reverse=0;
        while (input != 0)
        {
            int remainder=input%10;
            reverse=reverse*10+remainder;
            input=input/10;

        }
        System.out.println(original);
        System.out.println(reverse);

        if(original == reverse)
        {
            System.out.println("NUMBER IS PALINDROME");
        }
        else
        {
            System.out.println("NUMBER IS NOT PALINDROME");
        }
    }
}
