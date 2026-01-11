package employeewagecomputation.attendance;

import java.util.Random;

public class RandomAttendancePolicy implements AttendancePolicy
{
    private final Random random = new Random();

    @Override
    public int getWorkingHours() {
        int empCheck = random.nextInt(3);

        return switch (empCheck) {
            case 1 -> 4;   // Part-time
            case 2 -> 8;   // Full-time
            default -> 0;  // Absent
        };
    }
}
