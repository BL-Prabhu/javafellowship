package employeepayrollusenio;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

/**
 * <h1>Employee Payroll File NIO Service</h1>
 *
 * This class provides File NIO based CRUD (Create, Read, Update, Delete)
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
 * The implementation uses Java NIO concepts such as
 * Path, Files, and StandardOpenOption for faster file operations.
 * </p>
 *
 * @author Prabhu
 * @version 1.0
 * @since 2026
 */
public class EmployeePayrollFileNIO
{
    /**
     * Absolute file path where employee payroll data is stored.
     */
    static Path FILE_PATH = Paths.get("D:\\FILE-HANDLING\\employeepayroll_nio.txt");

    /**
     * Application entry point.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args)
    {
        try
        {
            CreateEmployee(new EmployeePayroll(1,"PRABHU",33000));
            CreateEmployee(new EmployeePayroll(2,"VINOTH",43000));
            CreateEmployee(new EmployeePayroll(3,"ANBU",53000));
            CreateEmployee(new EmployeePayroll(4,"KANNAN",63000));
            CreateEmployee(new EmployeePayroll(5,"GIT",73000));

            // ReadEmployee();
            // UpdateEmployee(2);
            // DeleteEmployeeById(5);
            // DeleteEmployee();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    /**
     * Creates a new employee payroll entry and appends it to the file.
     *
     * @param employee employee payroll object
     * @throws IOException if write operation fails
     */
    public static void CreateEmployee(EmployeePayroll employee) throws IOException
    {
        Files.write(FILE_PATH,
                (employee.toString() + System.lineSeparator()).getBytes(),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
        System.out.println("EMPLOYEE PAYROLL ADDED SUCCESSFULLY...");
    }

    /**
     * Reads all employee payroll records and prints them.
     *
     * @throws IOException if read operation fails
     */
    public static void ReadEmployee() throws IOException
    {
        List<String> lines = Files.readAllLines(FILE_PATH);
        int count = 0;

        for (String line : lines)
        {
            System.out.println(line);
            count++;
        }

        System.out.println("NUMBER OF EMPLOYEE ENTRIES : " + count);
    }

    /**
     * Updates the ID of the second employee record.
     *
     * @param employeeId new employee ID
     * @throws IOException if update fails
     */
    public static void UpdateEmployee(int employeeId) throws IOException
    {
        List<String> lines = Files.readAllLines(FILE_PATH);

        if (lines.size() >= 2)
        {
            String updatedLine = lines.get(1).replaceFirst("id=\\d+", "id=" + employeeId);
            lines.set(1, updatedLine);
        }

        Files.write(FILE_PATH, lines);
        System.out.println("Second employee ID updated to " + employeeId);
    }

    /**
     * Deletes all employee payroll records.
     *
     * @throws IOException if delete fails
     */
    public static void DeleteEmployee() throws IOException
    {
        Files.write(FILE_PATH, new byte[0]);
        System.out.println("EMPLOYEE PAYROLL FILE CLEARED SUCCESSFULLY...");
    }

    /**
     * Deletes an employee payroll record based on employee ID.
     *
     * @param employeeId employee ID to delete
     * @throws IOException if deletion fails
     */
    public static void DeleteEmployeeById(int employeeId) throws IOException
    {
        List<String> lines = Files.readAllLines(FILE_PATH);
        boolean isDeleted = false;

        for (int i = 0; i < lines.size(); i++)
        {
            if (lines.get(i).contains("id=" + employeeId + ","))
            {
                lines.remove(i);
                isDeleted = true;
                break;
            }
        }

        Files.write(FILE_PATH, lines);

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

