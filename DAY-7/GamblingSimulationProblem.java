import java.util.Random;
import java.util.Scanner;

public class GamblingSimulationProblem
{
    public static void gamble()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE DETAILS ");
        System.out.println("ENTER THE AMOUNT YOU HAVE");
        int money=scan.nextInt();
        System.out.println("ENTER YOUR GOAL IN TERMS OF MONEY ");
        int winMoney=scan.nextInt();
        int numberOfGames=0;
        int wins=0;
        Random random=new Random();
        while(money>0 && money<winMoney)
        {
            numberOfGames++;
            if(random.nextInt(2) == 1)
            {
                money=money+1;
                wins++;
            }
            else
            {
                money=money-1;
            }
        }

        System.out.println("MONEY = "+money);
        System.out.println("WIN MONEY = "+winMoney);
        System.out.println("NUMBER OF GAMES PLAYED = "+numberOfGames);
        System.out.println("NUMBER OF WINS = "+wins);

        String reult=(money == winMoney) ? "CONGRATS" : "BETTER LUCK NEXT TIME";
        System.out.println(reult);
    }
    public static void main(String[] args)
    {
        GamblingSimulationProblem.gamble();
    }
}
