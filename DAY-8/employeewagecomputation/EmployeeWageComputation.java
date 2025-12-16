package employeewagecomputation;

public class EmployeeWageComputation
{
    public static void main(String[] args)
    {
        Employee employee1=new Employee(1,"PRABHU","DINDIGUL","JAVA DEVELOPER",8610071389l,80,"");
        Employee employee2=new Employee(2,"RONALDO","PORTUGAL","FOOT BALLER",8610071389l,80,"");
        Employee employee3=new Employee(3,"LEWIS HAMILTON","ENGLAND","FORMULA 0NE DRIVER",8610071389l,80,"");
        Employee employee4=new Employee(4,"KHABIB","RUSSIA","UFC FIGHTER",8610071389l,80,"");
        Employee employee5=new Employee(5,"DHONI","INDIA","CRICKETER",8610071389l,80,"");
//        employee1.displayDetails();
//        System.out.println("--------------------------");
//        employee2.displayDetails();
//        System.out.println("--------------------------");
//        employee3.displayDetails();
//        System.out.println("--------------------------");
//        employee4.displayDetails();
//        System.out.println("--------------------------");
//        employee5.displayDetails();
        Employee[] allEmployees = {employee1,employee2,employee3,employee4,employee5};
        System.out.println("--------------------------");
        EmployeeAttendance attendance=new EmployeeAttendance(allEmployees);
        System.out.println("CHECKING RANDOM EMPLOYEE ATTENDANCE");
        System.out.println("------------------------------------");
        Employee randomEmployee= attendance.getRandomEmloyee();
        attendance.checkAttendance(randomEmployee);
       // attendance.calculateMonthlyWage(randomEmployee);

    }
}
