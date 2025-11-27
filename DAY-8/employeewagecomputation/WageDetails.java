package employeewagecomputation;

public class WageDetails
{
    private int hoursWoked;
    private long wagePerHour;

    public WageDetails(int hoursWoked, long wagePerHour)
    {
        this.hoursWoked = hoursWoked;
        this.wagePerHour = wagePerHour;
    }

    public int getHoursWoked() {
        return hoursWoked;
    }

    public void setHoursWoked(int hoursWoked) {
        this.hoursWoked = hoursWoked;
    }

    public long getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(long wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

}
