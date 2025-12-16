package filereadingperformance;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderClass
{
    public static void inputStreamReaderOperationRead(String fileName) throws IOException
    {
        long startTime = System.currentTimeMillis();
        InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName));

        while (isr.read() != -1)
        {

        }
        isr.close();
        long endTime=System.currentTimeMillis();
        System.out.println("INPUT STREAM READER PERFORMANCE TIME : " +(endTime - startTime) + " ms");
    }
}
