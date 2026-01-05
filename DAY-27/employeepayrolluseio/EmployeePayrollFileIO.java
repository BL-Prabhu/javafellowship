package employeepayrolluseio;

import java.io.*;


/**
 * <h1>Employee Payroll File IO Service</h1>
 *
 * This class provides File IO based CRUD (Create, Read, Update, Delete)
 * operations for managing Employee Payroll data.
 *
 * <p>
 * Employee payroll information is stored in a text file using the format:
 * </p>
 *
 * <pre>
 * EmployeePayroll{id=1, name='PRABHU', salary=33000.0}
 * </pre>
 *
 * <p>
 * The implementation uses basic Java File IO concepts such as
 * FileWriter, FileReader, BufferedReader, and BufferedWriter.
 * </p>
 *
 * @author Prabhu
 * @version 1.0
 * @since 2026
 */

public class EmployeePayrollFileIO
{
    /**
     * Absolute file path where employee payroll data is stored.
     */
    static String FILE_NAME = "D:\\FILE-HANDLING\\employeepayroll.txt";

    /**
     * Application entry point.
     *
     * <p>
     * Creates multiple employee payroll records and stores them
     * in a file using File IO operations.
     * </p>
     *
     * @param args command-line arguments
     */
    public static void main(String[] args)
    {
        try
        {
            EmployeePayrollFileIO.CreateEmployee(new EmployeePayroll(1,"PRABHU",33000));
            EmployeePayrollFileIO.CreateEmployee(new EmployeePayroll(2,"VINOTH",43000));
            EmployeePayrollFileIO.CreateEmployee(new EmployeePayroll(3,"ANBU",53000));
            EmployeePayrollFileIO.CreateEmployee(new EmployeePayroll(4,"KANNAN",63000));
            EmployeePayrollFileIO.CreateEmployee(new EmployeePayroll(5,"GIT",73000));
//            EmployeePayrollFileIO.ReadEmployee();
//            EmployeePayrollFileIO.UpdateEmployee(6);
//            EmployeePayrollFileIO.DeleteEmployeeById(6);
//            EmployeePayrollFileIO.DeleteEmployee();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }

    /**
     * Creates a new employee payroll entry and appends it to the file.
     *
     * <p>
     * Each employee is written on a new line to ensure multiple
     * records can be stored.
     * </p>
     *
     * @param employee the EmployeePayroll object to be stored
     * @throws IOException if file writing fails
     */
    public static void CreateEmployee(EmployeePayroll employee) throws IOException
    {
        FileWriter writer=new FileWriter(FILE_NAME,true);
        writer.write(employee.toString());
        writer.write(System.lineSeparator());
        writer.close();
        System.out.println("EMPLOYEE PAYROLL ADDED SUCCESSFULLY...");
    }

    /**
     * Reads all employee payroll records from the file and
     * displays them on the console.
     *
     * <p>
     * Also counts and prints the total number of employee entries.
     * </p>
     *
     * @throws IOException if file reading fails
     */
    public static void ReadEmployee() throws IOException
    {
        FileReader reader=new FileReader(FILE_NAME);
        BufferedReader br=new BufferedReader(reader);
        String line;
        int count=0;

        while((line = br.readLine()) != null)
        {
            System.out.println(line);
            count++;
        }
        br.close();
        System.out.println("NUMBER OF EMPLOYEE ENTRIES : "+count);
    }

    /**
     * Updates the ID of the second employee record in the file.
     *
     * <p>
     * Since files do not support direct modification, the method
     * rewrites the entire file using a temporary file.
     * </p>
     *
     * @param employeeId new employee ID to be updated
     * @throws IOException if file update fails
     */
    public static void UpdateEmployee(int employeeId) throws IOException
    {
        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
        String line;
        int lineNumber = 1;

        while ((line = reader.readLine()) != null)
        {

            if (lineNumber == 2)
            {
                line = line.replace("id=1", "id=" + employeeId);
            }

            writer.write(line);
            writer.newLine();
            lineNumber++;
        }
        reader.close();
        writer.close();
        inputFile.delete();
        tempFile.renameTo(inputFile);
        System.out.println("Second employee ID updated to " + employeeId);
    }

    /**
     * Deletes all employee payroll records by clearing the file content.
     *
     * @throws IOException if file deletion fails
     */
    public static void DeleteEmployee() throws IOException
    {
        FileWriter delete=new FileWriter(FILE_NAME);
        delete.write("");
        delete.close();
        System.out.println("EMPLOYEE PAYROLL FILE DELETED SUCCESSFULLY.....");
    }

    /**
     * Deletes a specific employee payroll record based on employee ID.
     *
     * <p>
     * The method copies all records except the matching employee ID
     * into a temporary file and replaces the original file.
     * </p>
     *
     * @param employeeId employee ID to be deleted
     * @throws IOException if deletion operation fails
     */
    public static void DeleteEmployeeById(int employeeId) throws IOException
    {

        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
        String line;
        boolean isDeleted = false;

        while ((line = reader.readLine()) != null)
        {
            if (line.contains("id=" + employeeId + ","))
            {
                isDeleted = true;
                continue;
            }
            writer.write(line);
            writer.newLine();
        }

        reader.close();
        writer.close();
        inputFile.delete();
        tempFile.renameTo(inputFile);

        if (isDeleted)
        {
            System.out.println("Employee with ID " + employeeId + " deleted successfully.");
        }
        else
        {
            System.out.println("Employee ID " + employeeId + " not found.");
        }
    }

}