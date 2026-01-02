package filehandlinguseio;

// DEFINITION OF FILE HANDLING
// ------------------------------
// It is the process of reading data from and writing data to files and other external sources or destinations.

// STREAM
// ----------
// It is a sequence of data.
// two types -> INPUTSTREAM, OUTPUTSTREAM.
// INPUTSTREAM -> It is used to read data from a source.
// OUTPUTSTREAM -> It is used for writing data to a destination.

// BYTE STREAM
// -------------
// It is used to perform input and output of 8-bit bytes.
// CLASSES -> FILEINPUTSTREAM, FILEOUTPUTSTREAM.

// CHARACTER STREAM
// -------------------
// It is used to perform input and output for 16-bit unicode.
// CLASSES -> FILEREADER, FILEWRITER.

// FILEREADER
// --------------
// It internally uses FILEINPUTSTREAM
// It reads two bytes at a time.

// FILEWRITER
// ----------------
// It is internally FILEOUTPUTSTREAM
// It writes two bytes at a time.


import java.io.*;

public class FileHandling
{

    public static void main(String[] args)
    {
        try
        {
            FileHandling.CreateFile();
            // FileHandling.readFile();
           // FileHandling.UpdateFile();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
       // FileHandling.DeleteFile();
    }

    public static void CreateFile() throws IOException
    {
        FileWriter writer=new FileWriter("D:\\FILE-HANDLING\\sample.txt");
        writer.write("HELLO THIS IS FILE HANDLING CONCEPT IN JAVA");
        writer.close();
        System.out.println("FILE CREATED ");
    }

    public static void readFile() throws IOException
    {
        FileReader reader=new FileReader("D:\\FILE-HANDLING\\sample.txt");
        int letter;
        System.out.println("READING");
        System.out.println("--------------------");

        while((letter = reader.read()) != -1)
        {
            System.out.print((char) letter);
        }
        reader.close();
        System.out.println();
    }

    public static void UpdateFile() throws IOException
    {
        // it not delete content which is present already
        // ----------------------------------------------------
       // FileWriter writer=new FileWriter("D:\\FILE-HANDLING\\sample.txt",true);

        // it delete the previous concept in the file
        // --------------------------------------------------
        FileWriter writer=new FileWriter("D:\\FILE-HANDLING\\sample.txt",false);

        writer.write("THIS IS FILE HANDING CONCEPT IN JAVA (MOST IMPORTANT)");
        writer.close();
        System.out.println("FILE HANDING");
    }

    public static void DeleteFile()
    {
        File file=new File("D:\\FILE-HANDLING\\sample.txt");
        System.out.println(file.delete() ? "FILE DELETED SUCCESSFULLY" : "FILE NOT DELETED");
    }

}
