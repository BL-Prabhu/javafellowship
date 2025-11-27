package employeewagecomputation;

import java.util.Random;

public class DailyWages implements WageCalculator
{

    private WageDetails wagedetails;

    public DailyWages(WageDetails wagedetails)
    {
        this.wagedetails = wagedetails;
    }

    public long calculateWage(String employeeType)
    {
        System.out.println("WAGE PER HOUR : "+wagedetails.getWagePerHour());
        Random random = new Random();
        int hoursWorked=0;

        switch (employeeType)
        {
            case "FULL_TIME":
                hoursWorked = random.nextInt(9);  // 0–8 hours
                break;

            case "PART_TIME":
                hoursWorked = 8;  // fixed hours
                break;

            default:
                hoursWorked = 0;
                break;
        }
    //    int hoursWorked = random.nextInt(9); // 0-8 hours
        wagedetails.setHoursWoked(hoursWorked);
        return hoursWorked * wagedetails.getWagePerHour();
    }

    public long calculateMonthlyWage(String employeeType)
    {
        long monthlyWage = 0;

        for (int day = 1; day <= 20; day++)
        {
            long dailyWage = calculateWage(employeeType);
            monthlyWage += dailyWage;
        }

        return monthlyWage;
    }

    @Override
    public long computeDailyWage()
    {
        Random random = new Random();
        int hoursWorked = random.nextInt(9);
        wagedetails.setHoursWoked(hoursWorked);
        return hoursWorked * wagedetails.getWagePerHour();
    }

}
