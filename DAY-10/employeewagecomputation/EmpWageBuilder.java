package employeewagecomputation;

import java.util.ArrayList;
import java.util.Random;

public class EmpWageBuilder {
    private ArrayList<CompanyEmpWage> companies;

    public EmpWageBuilder() {
        companies = new ArrayList<>();
    }


    public void addCompany(String name, int wagePerHour, int workingDays, int maxHoursPerMonth) {
        companies.add(new CompanyEmpWage(name, wagePerHour, workingDays, maxHoursPerMonth));
    }


    public void computeWages() {
        for (CompanyEmpWage company : companies) {
            long totalWage = computeWageForCompany(company);
            company.setTotalWage(totalWage);
            System.out.println(company);
        }
    }


    private long computeWageForCompany(CompanyEmpWage company) {
        int totalHours = 0;
        int totalDays = 0;
        Random random = new Random();

        while (totalDays < company.workingDays && totalHours < company.maxHoursPerMonth) {
            totalDays++;
            int empCheck = random.nextInt(3); // 0-Absent, 1-Part-Time, 2-Full-Time
            int hoursWorked = 0;

            switch (empCheck) {
                case 1: hoursWorked = 4; break;  // Part-Time
                case 2: hoursWorked = 8; break;  // Full-Time
                default: hoursWorked = 0;        // Absent
            }

            totalHours += hoursWorked;
            System.out.println(company.companyName + " - Day " + totalDays + ": " + hoursWorked + " hours");
        }

        return totalHours * company.wagePerHour;
    }
}
