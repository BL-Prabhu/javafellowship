package filpcoinprogram;

import java.util.Scanner;

public class FlipCoin
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT TO FLIP THE COIN");
        System.out.println("-------------------------------------------");
        int flips=scan.nextInt();
        int heads=0;
        int tails=0;

        for(int i=1;i<=flips;i++)
        {
            double number=Math.random();
            System.out.println(number);
            if(number <= 0.5)
            {
                tails++;
            }
            else
            {
                heads++;
            }
        }

        int headsPercentage=(heads*100)/flips;
        int tailsPercentage=(tails*100)/flips;

        System.out.println("HEADS PERCENTAGE : "+headsPercentage+"%");
        System.out.println("TAILS PERCENTAGE : "+tailsPercentage+"%");

        System.out.println("PROBABILITY OF HEADS : "+heads+"/"+flips);
        System.out.println("PROBABILITY OF TAILS : "+tails+"/"+flips);

    }
}
