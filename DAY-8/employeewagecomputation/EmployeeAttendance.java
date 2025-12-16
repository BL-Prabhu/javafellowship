package employeewagecomputation;

import java.util.Random;

public class EmployeeAttendance
{
    private  Employee[] employees;

    public EmployeeAttendance(Employee[] employees)
    {
        this.employees = employees;
    }

    public Employee getRandomEmloyee()
    {
        Random random=new Random();
        int index=random.nextInt(employees.length);
        return employees[index];
    }

    private void assignRandomEmploymentType(Employee employee)
    {
        Random ran=new Random();
        boolean isFullTime=ran.nextBoolean();
        if(isFullTime)
        {
            employee.setEmployeeType("FULL_TIME");
        }
        else
        {
            employee.setEmployeeType("PART_TIME");
        }
    }


    public void checkAttendance(Employee employee)
    {
        assignRandomEmploymentType(employee);
        boolean isPresent = Math.random()<0.5;
        employee.displayDetails();
        if(isPresent)
        {
            System.out.println("STATUS : present");
            DailyWages dailywages=new DailyWages(employee.getWageDetails());
            long wageOfEmplopee=dailywages.calculateWage(employee.getEmployeeType());
            System.out.println("EMPLOYEE WORKING HOURS : "+employee.getWageDetails().getHoursWoked());
            System.out.println("EMPLOYEE WAGE : RS. "+wageOfEmplopee);
            calculateMonthlyWage(employee);
        }
        else
        {
            System.out.println("STATUS : absent");
            System.out.println("EMPLOYEE WAGE : RS. "+0);
        }
    }

    public void calculateMonthlyWage(Employee employee)
    {
       // assignRandomEmploymentType(employee);

        DailyWages daily = new DailyWages(employee.getWageDetails());

        long monthlyWage = daily.calculateMonthlyWage(employee.getEmployeeType());

        System.out.println("------------------------------------------------");
        System.out.println("MONTHLY WAGE CALCULATION");
        System.out.println("-------------------------");
        System.out.println("Employee: " + employee.getEmployeeName());
        System.out.println("Type: " + employee.getEmployeeType());
        System.out.println("Wage Per Hour: " + employee.getWageDetails().getWagePerHour());
        System.out.println("Total Monthly Wage for 20 Days: Rs. " + monthlyWage);
        System.out.println("------------------------------------------------");
    }

}
