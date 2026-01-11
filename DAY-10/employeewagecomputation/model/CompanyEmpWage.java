package employeewagecomputation.model;

public class CompanyEmpWage
{
    private final String companyName;
    private final int wagePerHour;
    private final int workingDays;
    private final int maxHoursPerMonth;
    private long totalWage;

    public CompanyEmpWage(String companyName, int wagePerHour,
                          int workingDays, int maxHoursPerMonth) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public int getMaxHoursPerMonth() {
        return maxHoursPerMonth;
    }

    public void setTotalWage(long totalWage) {
        this.totalWage = totalWage;
    }

    @Override
    public String toString() {
        return "Total wage for " + companyName + " : Rs. " + totalWage;
    }
}
