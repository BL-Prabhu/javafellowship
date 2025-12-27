package functioninterface;

import java.util.function.Function;

// Function is used when we need to transform an object from one type to another.

class Employee
{
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}


class EmployeeDTO
{
    int id;
    String name;

    EmployeeDTO(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return id + " - " + name;
    }
}
public class RealTimeExample
{
    public static void main(String[] args)
    {
        Function<Employee, EmployeeDTO> employeeMapper=emp -> new EmployeeDTO(emp.id, emp.name);
        Employee emp = new Employee(101, "Prabhu", 50000);
        EmployeeDTO dto = employeeMapper.apply(emp);
        System.out.println(dto);
    }
}
