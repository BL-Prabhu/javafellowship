package employeewagecomputation;

import java.util.Random;

public class DailyWageService
{
    public long calculateDailyWage(Employee employee) {

        Random random = new Random();
        int hoursWorked = random.nextInt(9);

        employee.getWageDetails().setHoursWoked(hoursWorked);
        return hoursWorked * employee.getWageDetails().getWagePerHour();
    }

    public long calculateMonthlyWage(Employee employee) {

        long monthlyWage = 0;

        for (int day = 1; day <= 20; day++) {
            monthlyWage += calculateDailyWage(employee);
        }
        return monthlyWage;
    }
}
