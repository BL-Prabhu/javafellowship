package filehandlingusenio;

// LIST OF STANDARDOPENOPTION TYPES
// ------------------------------------
// 1. READ
// -----------
// opens the files for reading

// 2. WRITE
// ---------------
// opens the files for nwriting

// 3. CREATE
// -----------------
// Creates a new file if it does not exist

// 4. CREATE_NEW
// ------------------
// Creates a new file
// If file exists throws exception -> FileAlreadyExistsException (this is a subclass of IO exception)

// 5. APPEND
// ------------
// Writes data ta the end of the file
// file must exist or use CREATE

// 6. TRUNCATE_EXISTING
// -------------------------
// Deletes all existing content
// file must exist.

// 7. DELETE_ON_CLOSE
// -----------------------
// Deletes the file automatically when closed

// 8. SPARSE
// -------------
// Create A SPARSE FILE
// It is used to LARGE FILES with empty spaces.

// 9. SYNC
// -----------
// Ensures file content is written immediately to disk

// 10. DSYNC
// -------------
// Syncs file content only


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileHandling
{
    private static final Path PATH = Path.of("D:\\FILE-HANDLING\\samplenio.txt");

    public static void main(String[] args)
   {
        try
        {
             FileHandling.CreateFile();
           // FileHandling.ReadFile();
           // FileHandling.UpdateFile();
            // FileHandling.DeleteFile();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
       }
    }


    private static void CreateFile() throws IOException
    {
        Files.writeString(PATH, "THIS IS FILE HANDLING CONCEPT USE NIO");
        System.out.println("FILE CREATED ");

    }



    private  static void ReadFile() throws IOException
    {
        String data = Files.readString(PATH);
        System.out.println("READING ");
        System.out.println("----------------");
        System.out.println(data);
    }

    private static void UpdateFile() throws IOException
    {
        Files.writeString(PATH, "THIS IS FILE HANDLING CONCEPT USE NIO (MOST IMPORTANT)", StandardOpenOption.APPEND);
        System.out.println("FILE UPDATED");
    }

    private static void DeleteFile() throws IOException
    {
        Files.deleteIfExists(PATH);
        System.out.println("FILE DELETED");
    }
}
