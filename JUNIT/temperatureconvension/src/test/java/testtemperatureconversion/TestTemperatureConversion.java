package testtemperatureconversion;

import org.junit.jupiter.api.Test;
import temperatureconvension.TemperatureConversion;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTemperatureConversion
{
    @Test
    public void testTemperatureConversion()
    {
        ByteArrayOutputStream bbb=new ByteArrayOutputStream();
        PrintStream input=System.out;
        System.setOut(new PrintStream(bbb));

        TemperatureConversion.convertTemperature("100x");
        System.setOut(input);
        String output=bbb.toString();
        assertEquals(output.contains("INVALID INPUT"), true, "output should be 'INVALID INPUT'");
    }

    @Test
    public void testConvertToFarenhiet()
    {
        ByteArrayOutputStream bb=new ByteArrayOutputStream();
        PrintStream input=System.out;
        System.setOut(new PrintStream(bb));

        TemperatureConversion.convertTemperature("25C");
        System.setOut(input);
        String output=bb.toString();
        assertTrue(output.contains("77.0 F"),"output should be '77.0 F'");
    }

    @Test
    public void testConvertToCelsius()
    {
        ByteArrayOutputStream bbb=new ByteArrayOutputStream();
        PrintStream input=System.out;
        System.setOut(new PrintStream(bbb));
        TemperatureConversion.convertTemperature("77F");
        System.setOut(input);
        String output=bbb.toString();
        assertTrue(output.contains("25.0 C"), "output should be '25.0 C'");
    }
}
