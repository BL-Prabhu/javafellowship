package bankaccount;


public class AccountTest
{
    public static void main(String[] args)
    {

        Account saving = new Account(9000, "saving");

        saving.credit(500);
        System.out.println(saving.getBalance());

        saving.credit(1000);
        System.out.println(saving.getBalance());

        Account current = new Account(90000, "current");

        current.credit(5000);
        System.out.println(current.getBalance());

        current.credit(10000);
        System.out.println(current.getBalance());
    }
}
