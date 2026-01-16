package employeepayroll.dao;

import employeepayroll.model.Employee;

import java.util.List;

public interface EmployeeDAO
{
    void addEmployee(Employee employee);
    List<Employee> getAllEmployees();
}
