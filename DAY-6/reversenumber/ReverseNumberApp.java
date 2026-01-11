package reversenumber;

import java.util.Scanner;

public class ReverseNumberApp
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO REVERSE");
        int num = scan.nextInt();

        ReverseNumberService service = new ReverseNumberService();
        ReverseNumberPrinter printer = new ReverseNumberPrinter();

        int result = service.reverseUsingRecursion(num);
        printer.printResult(result);

        scan.close();
    }
}
