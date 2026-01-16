package employeepayroll.dao;

import employeepayroll.model.Employee;
import employeepayroll.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO
{
    private static final String INSERT_QUERY =
            "INSERT INTO employee_payroll " +
                    "(name, gender, salary, start_date, basic_pay, deductions, taxable_pay, income_tax, net_pay) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    @Override
    public void addEmployee(Employee emp) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(INSERT_QUERY)) {

            ps.setString(1, emp.getName());
            ps.setString(2, String.valueOf(emp.getGender()));
            ps.setDouble(3, emp.getSalary());
            ps.setDate(4, java.sql.Date.valueOf(emp.getStartDate()));
            ps.setDouble(5, emp.getBasicPay());
            ps.setDouble(6, emp.getDeductions());
            ps.setDouble(7, emp.getTaxablePay());
            ps.setDouble(8, emp.getIncomeTax());
            ps.setDouble(9, emp.getNetPay());

            ps.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Failed to insert employee", e);
        }
    }

    @Override
    public List<Employee> getAllEmployees() {
        return List.of();
    }
}
