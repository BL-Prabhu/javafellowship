package testmonthlypayment;

import monthlypayment.MonthlyPayment;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMonthlyPayment
{
    @Test
    public void testGetMonthlyPaymentWithInterest()
    {
        ByteArrayOutputStream bbb=new ByteArrayOutputStream();
        PrintStream input=System.out;
        System.setOut(new PrintStream(bbb));

        MonthlyPayment.calculateMonthlyPayment(100000,10,10);
        System.setOut(input);
        String output=bbb.toString();
        assertTrue(output.contains("833"),"output should be 833");
    }

    @Test
    public void testGetMonthlyPaymentWithoutInterest()
    {
        ByteArrayOutputStream bbb=new ByteArrayOutputStream();
        PrintStream input=System.out;
        System.setOut(new PrintStream(bbb));

        MonthlyPayment.calculateMonthlyPayment(1000,0,10);
        System.setOut(input);
        String output=bbb.toString();
        assertTrue(output.contains("8"),"output should be 8");
    }
}
