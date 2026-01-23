package stockaccountmanagement;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StockPortfolio portfolio = new StockPortfolio();

        System.out.print("Enter number of stocks: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++)
        {
            System.out.println("\nEnter details for Stock " + (i + 1));

            System.out.print("Enter Stock Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Number of Shares: ");
            int shares = sc.nextInt();

            System.out.print("Enter Share Price: ");
            double price = sc.nextDouble();
            sc.nextLine();


            Stock stock = new Stock(name, shares, price);
            portfolio.addStock(stock);
        }

        portfolio.printReport();
    }
}
