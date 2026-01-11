package gamblingsimulation;

import java.util.Scanner;

public class GamblingApp
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER THE AMOUNT YOU HAVE");
        int money = scan.nextInt();

        System.out.println("ENTER YOUR GOAL IN TERMS OF MONEY");
        int goal = scan.nextInt();

        GamblingService service = new GamblingService();
        GamblingPrinter printer = new GamblingPrinter();

        GamblingResult result = service.playGame(money, goal);
        printer.printResult(result);

        scan.close();
    }
}
