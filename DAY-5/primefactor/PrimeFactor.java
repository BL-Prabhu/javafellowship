package primefactor;

import java.util.Scanner;

public class PrimeFactor
{
    public static void findPrimeFactor()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int N=scan.nextInt();
        for(int i=2;i*i<=N;i++)
        {
            while (N%i == 0)
            {
                System.out.println(i);
                N=N/i;
            }
        }
        if(N>1)
        {
            System.out.println(N);
        }
    }
    public static void main(String[] args)
    {
        PrimeFactor.findPrimeFactor();
    }
}
