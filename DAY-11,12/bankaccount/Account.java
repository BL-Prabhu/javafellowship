package bankaccount;

public class Account
{
    private double balance;
    private String accountType;


    public Account(double balance, String accountType)
    {
        if (balance >= 0) {
            this.balance = balance;
        }
        else
        {
            this.balance = 0;
            System.out.println("Initial balance was invalid.");
        }

        this.accountType = accountType.toLowerCase();
    }


    public void credit(double amount)
    {
        double maxLimit = 0;

        if (accountType.equals("saving"))
        {
            maxLimit = 10000;
        }
        else if (accountType.equals("current"))
        {
            maxLimit = 100000;
        }

        if (balance + amount > maxLimit)
        {
            System.out.println("Credit failed! Balance cannot exceed limit of " + maxLimit);
        }
        else
        {
            balance += amount;
        }
    }

    public void debit(double amount)
    {
        if (amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Debit amount exceeded account balance.");
        }
    }

    public double getBalance()
    {
        return balance;
    }
}
