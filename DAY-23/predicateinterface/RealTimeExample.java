package predicateinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

class Employee
{
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class RealTimeExample
{
    public static void main(String[] args)
    {

       //  Commonly used in filtering, validation, and conditional checks.
        // --------------------------------------------------------------------
        System.out.println("PREDICATE");
        System.out.println("-------------");
        Predicate<Employee> adult = emp -> emp.age >= 18;
        Employee emp1 = new Employee("Prabhu", 25, 70000);
        Employee emp2 = new Employee("Vinoth", 15, 30000);
        System.out.println(adult.test(emp1));
        System.out.println(adult.test(emp2));

        System.out.println("BIPREDICATE");
        System.out.println("-------------");
        BiPredicate<Double, Double> salaryRange = (salary, maxSalary) -> salary <= maxSalary;
        Employee emp = new Employee("Prabhu", 25, 45000);
        System.out.println(salaryRange.test(emp.salary, 50000.0));
        System.out.println(salaryRange.test(emp.salary, 40000.0));
    }
}
