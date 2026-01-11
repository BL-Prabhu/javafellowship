package employeewagecomputation;

public class EmployeeWageComputation
{
    public static void main(String[] args) {

        Employee employee =
                new Employee(1, "PRABHU", "DINDIGUL",
                        "JAVA DEVELOPER", 8610071389L, 80, "");

        EmployeeAttendanceService attendanceService =
                new EmployeeAttendanceService();

        DailyWageService wageService =
                new DailyWageService();

        EmployeePrinter printer =
                new EmployeePrinter();

        attendanceService.assignRandomEmployeeType(employee);
        printer.printDetails(employee);

        if (attendanceService.isEmployeePresent()) {
            System.out.println("STATUS : PRESENT");

            long dailyWage = wageService.calculateDailyWage(employee);
            System.out.println("DAILY WAGE : Rs. " + dailyWage);

            long monthlyWage = wageService.calculateMonthlyWage(employee);
            System.out.println("MONTHLY WAGE : Rs. " + monthlyWage);
        } else {
            System.out.println("STATUS : ABSENT");
            System.out.println("WAGE : Rs. 0");
        }
    }
}
