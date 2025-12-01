package employeewagecomputation;

public class CompanyEmpWage {
    public final String companyName;
    public final int wagePerHour;
    public final int workingDays;
    public final int maxHoursPerMonth;
    private long totalWage;

    public CompanyEmpWage(String companyName, int wagePerHour, int workingDays, int maxHoursPerMonth) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        this.totalWage = 0;
    }

    public void setTotalWage(long totalWage) {
        this.totalWage = totalWage;
    }

    public long getTotalWage() {
        return totalWage;
    }

    @Override
    public String toString() {
        return "Total wage for " + companyName + ": Rs. " + totalWage;
    }
}
