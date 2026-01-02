package hotelreservationsystem;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil
{
    private static final DateTimeFormatter forMatter= DateTimeFormatter.ofPattern("ddMMMyyyy");

    public static LocalDate parse(String date)
    {
        return LocalDate.parse(date, forMatter);
    }

    public static boolean isWeekend(LocalDate date)
    {
        return date.getDayOfWeek() == DayOfWeek.SATURDAY ||
                date.getDayOfWeek() == DayOfWeek.SUNDAY;
    }
}
