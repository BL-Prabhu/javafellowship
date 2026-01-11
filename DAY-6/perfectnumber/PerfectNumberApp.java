package perfectnumber;

import java.util.List;
import java.util.Scanner;

public class PerfectNumberApp
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO CHECK");
        int input = scan.nextInt();

        PerfectNumberService service = new PerfectNumberService();
        PerfectNumberPrinter printer = new PerfectNumberPrinter();

        List<Integer> divisors = service.getProperDivisors(input);
        boolean isPerfect = service.isPerfectNumber(input);
        int sum = service.sumOfDivisors(input);

        printer.printDivisors(divisors);
        printer.printResult(input, isPerfect, sum);

        scan.close();
    }
}
