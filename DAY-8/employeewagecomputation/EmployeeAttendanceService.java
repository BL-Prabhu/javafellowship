package employeewagecomputation;

import java.util.Random;

public class EmployeeAttendanceService
{
    public boolean isEmployeePresent() {
        return Math.random() < 0.5;
    }

    public void assignRandomEmployeeType(Employee employee) {
        Random random = new Random();
        employee.setEmployeeType(random.nextBoolean() ? "FULL_TIME" : "PART_TIME");
    }
}
