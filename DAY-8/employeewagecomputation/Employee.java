package employeewagecomputation;

public class Employee
{
   private int employeeId;
   private String employeeName;
   private String location;
   private String employeeQualification;
   private long employeePhoneNumber;
   private WageDetails wagedetails;
   private String employeeType;

    public Employee(int employeeId, String employeeName, String location,
                    String employeeQualification, long employeePhoneNumber,long wagePerHour,String employeeType)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.location = location;
        this.employeeQualification = employeeQualification;
        this.employeePhoneNumber = employeePhoneNumber;
        this.wagedetails=new WageDetails(0,wagePerHour);
        this.employeeType=employeeType;
    }

    public  WageDetails getWageDetails()
    {
        return wagedetails;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmployeeQualification() {
        return employeeQualification;
    }

    public void setEmployeeQualification(String employeeQualification) {
        this.employeeQualification = employeeQualification;
    }

    public long getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public void setEmployeePhoneNumber(long employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    // Method to display employee details
    public void displayDetails()
    {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name : " + employeeName);
        System.out.println("LOCATION : " + location);
        System.out.println("EMPLOYEE QUALIFICATION : " + employeeQualification);
        System.out.println("EMPLOYEE PHONE NUMBER : " + employeePhoneNumber);
        System.out.println("EMPLOYEE TYPE : "+employeeType);
    }
}
