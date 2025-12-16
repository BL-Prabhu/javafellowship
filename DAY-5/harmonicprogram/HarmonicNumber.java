package harmonicprogram;

import java.util.Scanner;

public class HarmonicNumber
{
    public void findHarmonicNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int input=scan.nextInt();
        double harmonicNumber=0;

        for(int i=1;i<=input;i++)
        {
            harmonicNumber+=1.0/i;
        }

        System.out.println(harmonicNumber);

    }

    public static void main(String[] args)
    {
        HarmonicNumber harmonicnumber=new HarmonicNumber();
        harmonicnumber.findHarmonicNumber();
    }
}
