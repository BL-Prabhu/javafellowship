package filereadingperformance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {

    public static void createFile(String fileName) throws IOException
    {

        File file = new File(fileName);
        File parent = file.getParentFile();

        if (parent != null && !parent.exists())
        {
            parent.mkdirs();
        }

        FileWriter fw = new FileWriter(file);

        for (int i = 0; i < 10000; i++)
        {
            fw.write("This is sample text for file reading test.\n");
        }
        fw.close();
        System.out.println("File created successfully: " + file.getAbsolutePath());
    }
}
