package filereadingperformance;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass
{
    public static void fileReaderReadOperation(String fileName) throws IOException
    {

        long startTime = System.currentTimeMillis();
        FileReader fr = new FileReader(fileName);

        while (fr.read() != -1)
        {

        }
        fr.close();
        long endTime=System.currentTimeMillis();
        System.out.println("FILE READER PERFORMANCE TIME : " +(endTime - startTime) + " ms");

    }
}
