package testdaysofweek;

import daysofweek.DaysOfWeek;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDaysOfWeek {

    @Test
    public void testDayOfWeek() {
        // Capture System.out
        ByteArrayOutputStream bbb = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(bbb));

        // Call method with correct date: March 21, 1998
        DaysOfWeek.dayOfWeek(3, 21, 1998);

        // Restore System.out
        System.setOut(originalOut);

        // Get output string
        String answer = bbb.toString();

        // Assert output contains correct day
        assertTrue(answer.contains("6 ->SATURDAY"), "Output should contain '6 ->SATURDAY'");
    }
}
