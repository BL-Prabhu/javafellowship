package testsquarenewton;

import org.junit.jupiter.api.Test;
import squarenewton.SquareNewton;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSquareNewton
{
    @Test
    public void testSquareNewton()
    {
        ByteArrayOutputStream bbb=new ByteArrayOutputStream();
        PrintStream input=System.out;
        System.setOut(new PrintStream(bbb));
        SquareNewton.ConvertSquare(225);
        System.setOut(input);
        String output=bbb.toString();

        assertTrue(output.contains("15.0"),"output should be 15.0");

    }
}
