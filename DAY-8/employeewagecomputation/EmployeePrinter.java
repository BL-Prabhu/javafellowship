package employeewagecomputation;

public class EmployeePrinter
{

    public void printDetails(Employee employee) {
        System.out.println("Employee Name : " + employee.getEmployeeName());
        System.out.println("Employee Type : " + employee.getEmployeeType());
    }
}
