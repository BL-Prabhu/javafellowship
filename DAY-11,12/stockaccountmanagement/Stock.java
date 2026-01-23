package stockaccountmanagement;

public class Stock
{
    private String name;
    private int numberOfShares;
    private double sharePrice;

    public Stock(String name, int numberOfShares, double sharePrice)
    {
        this.name = name;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    public double getStockValue()
    {
        return numberOfShares * sharePrice;
    }

    public void printStockInfo()
    {
        System.out.println("Stock Name: " + name);
        System.out.println("Number of Shares: " + numberOfShares);
        System.out.println("Share Price: " + sharePrice);
        System.out.println("Total Value: " + getStockValue());
        System.out.println("----------------------------------");
    }
}
