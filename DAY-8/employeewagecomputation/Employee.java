package employeewagecomputation;

public class Employee
{
    private int employeeId;
    private String employeeName;
    private String location;
    private String employeeQualification;
    private long employeePhoneNumber;
    private WageDetails wageDetails;
    private String employeeType;

    public Employee(int employeeId, String employeeName, String location,
                    String employeeQualification, long employeePhoneNumber,
                    long wagePerHour, String employeeType) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.location = location;
        this.employeeQualification = employeeQualification;
        this.employeePhoneNumber = employeePhoneNumber;
        this.wageDetails = new WageDetails(0, wagePerHour);
        this.employeeType = employeeType;
    }

    public WageDetails getWageDetails() {
        return wageDetails;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
}
