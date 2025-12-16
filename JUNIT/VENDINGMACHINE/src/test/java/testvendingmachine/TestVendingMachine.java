package testvendingmachine;

import org.junit.jupiter.api.Test;
import vandingmachineconcept.VendingMachine;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestVendingMachine
{
    @Test
    public void testCalculateAmount()
    {
        ByteArrayOutputStream bbb=new ByteArrayOutputStream();
        System.setOut(new PrintStream(bbb));

        VendingMachine.calculateAmount(1000);

       String answer= bbb.toString();

        assertTrue(answer.contains("NOTES : 500 -> 2"));
        assertTrue(answer.contains("TOTAL AMOUNT : 1000"));

    }
}
