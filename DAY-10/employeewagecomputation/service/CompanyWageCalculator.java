package employeewagecomputation.service;

import employeewagecomputation.attendance.AttendancePolicy;
import employeewagecomputation.model.CompanyEmpWage;

public class CompanyWageCalculator implements WageCalculator
{
    private final AttendancePolicy attendancePolicy;

    public CompanyWageCalculator(AttendancePolicy attendancePolicy) {
        this.attendancePolicy = attendancePolicy;
    }

    @Override
    public long calculateWage(CompanyEmpWage company) {

        int totalHours = 0;
        int totalDays = 0;

        while (totalDays < company.getWorkingDays()
                && totalHours < company.getMaxHoursPerMonth()) {

            totalDays++;
            int hoursWorked = attendancePolicy.getWorkingHours();
            totalHours += hoursWorked;

            System.out.println(company.getCompanyName() +
                    " - Day " + totalDays + " : " + hoursWorked + " hours");
        }

        return totalHours * company.getWagePerHour();
    }
}
