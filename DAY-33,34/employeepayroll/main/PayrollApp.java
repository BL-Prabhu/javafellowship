package employeepayroll.main;

import employeepayroll.dao.EmployeeDAOImpl;
import employeepayroll.model.Employee;
import employeepayroll.service.EmployeeService;
import employeepayroll.service.EmployeeServiceImpl;
import employeepayroll.util.EmployeeConsoleInput;


public class PayrollApp
{
    public static void main(String[] args) {

        Employee employee = EmployeeConsoleInput.getEmployeeInput();

        EmployeeService service =
                new EmployeeServiceImpl(new EmployeeDAOImpl());

        service.createEmployee(employee);

        System.out.println(" Employee Payroll Data Saved Successfully");
    }
}
