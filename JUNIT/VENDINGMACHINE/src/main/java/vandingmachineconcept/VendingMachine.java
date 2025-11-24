package vandingmachineconcept;

import java.util.Scanner;

public class VendingMachine
{
    static int[] denominations = {2000,500,200,100,50,20,10,2,1};

    public static void calculateAmount(int amount)
    {
        int originalAmount=amount;

        for(int notes : denominations)
        {
            if(amount >= notes)
            {
                int count = amount/notes;
                amount=amount%notes;
                System.out.println("NOTES : "+notes+" -> "+count +" = (NOTES * COUNT ) = "+notes*count);
            }
        }
        System.out.println("TOTAL AMOUNT : "+originalAmount);
    }

    public static void getAmount()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE AMOUNT TO WITHDRAW");
        int amount=scan.nextInt();
        VendingMachine.calculateAmount(amount);
    }
}
