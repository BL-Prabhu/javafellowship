package stockaccountmanagement;


import java.util.ArrayList;

class StockPortfolio
{
    private ArrayList<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double getTotalPortfolioValue()
    {
        double total = 0;
        for (Stock s : stocks)
        {
            total += s.getStockValue();
        }
        return total;
    }

    public void printReport()
    {
        System.out.println(" STOCK REPORT ");
        for (Stock s : stocks)
        {
            s.printStockInfo();
        }
        System.out.println("Total Portfolio Value: " + getTotalPortfolioValue());

    }
}
