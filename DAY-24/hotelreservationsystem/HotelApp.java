package hotelreservationsystem;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class HotelApp
{
    public static void main(String[] args)
    {
        List<Hotel> hotels = List.of(new Hotel("LAKEWOOD", 3, new Rate(110, 90), new Rate(80, 80)),
                new Hotel("BRIDGEWOOD", 4, new Rate(160, 60), new Rate(110, 50)),
                new Hotel("RIDGEWOOD", 5, new Rate(220, 150), new Rate(100, 40)));
        HotelService service=new HotelService(hotels);

        String firstInput= "Regular: 16Mar2020(mon), 17Mar2020(tues), 18Mar2020(wed)";
        process(firstInput, service);

        String secondInput="Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)";
        process(secondInput,service);
    }

    private static void process(String input, HotelService service)
    {
        String[] parts=input.split(":");

        CustomerType type=CustomerType.valueOf(parts[0].trim().toUpperCase());

        List<LocalDate> dates=List.of(parts[1].split(","))
                .stream()
                .map(s->s.trim().substring(0,9))
                .map(DateUtil::parse)
                .toList();

        Hotel result = service.findCheapestHotel(type, dates);

        System.out.println(result.getName());
    }

}
