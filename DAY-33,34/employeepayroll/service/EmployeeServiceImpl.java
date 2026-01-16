package employeepayroll.service;

import employeepayroll.dao.EmployeeDAO;
import employeepayroll.model.Employee;

public class EmployeeServiceImpl implements EmployeeService
{
    private final EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public void createEmployee(Employee employee) {
        calculatePayroll(employee);
        employeeDAO.addEmployee(employee);
    }

    private void calculatePayroll(Employee emp) {
        emp.setBasicPay(emp.getSalary());
        emp.setTaxablePay(emp.getBasicPay() - emp.getDeductions());
        emp.setIncomeTax(emp.getTaxablePay() * 0.1);
        emp.setNetPay(emp.getTaxablePay() - emp.getIncomeTax());
    }
}
