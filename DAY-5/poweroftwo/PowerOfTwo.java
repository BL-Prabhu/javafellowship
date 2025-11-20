package poweroftwo;

import java.util.Scanner;

public class PowerOfTwo
{

    public static void findPowerOfTwo()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE POWER VALUE NUMBER");
        int power=scan.nextInt();
        int answer=0;

        for(int i=1;i<=power;i++)
        {
            answer= (int) Math.pow(2,i);
        }
        System.out.println(answer);

    }

    public static void main(String[] args)
    {
        PowerOfTwo.findPowerOfTwo();
    }
}
