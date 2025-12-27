package consumerinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

class Employee
{
    String name;
    int age;
    double salary;

    Employee(String name, int age,double salary)
    {
        this.name = name;
        this.age = age;
        this.salary=salary;
    }
}

public class RealTimeExample
{
    public static void main(String[] args)
    {
        Employee emp = new Employee("Prabhu", 25, 45000);
        Consumer<Employee> printDetails = employee -> System.out.println("Employee: " + emp.name + ", Age: " + emp.age);
        printDetails.accept(emp);

        Employee emp1 = new Employee("Vinoth", 45, 50000);
        BiConsumer<String, Double> printSalary = (name, salary) -> System.out.println("Employee: " + name + ", Salary: " + salary);
        printSalary.accept(emp1.name, emp1.salary);
    }
}
