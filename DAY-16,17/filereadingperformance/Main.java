package filereadingperformance;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String fileName = "D:/fileperformancetest/filereadertestfile.txt";
        System.out.println("FILE READING PERFORMANCE");
        System.out.println("-------------------------");

        try
        {
            FileCreator.createFile(fileName);
            FileReaderClass.fileReaderReadOperation(fileName);
            InputStreamReaderClass.inputStreamReaderOperationRead(fileName);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
