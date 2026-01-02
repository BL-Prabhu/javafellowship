package hotelreservationsystem;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class HotelService
{
    private List<Hotel> hotels;

    public HotelService(List<Hotel> hotels)
    {
        this.hotels=hotels;
    }

    public Hotel findCheapestHotel(CustomerType type, List<LocalDate> dates)
    {
        return hotels.stream()
                .min(Comparator.comparingInt((Hotel hotel)->
                                dates.stream().mapToInt(date->
                                                hotel.getRate(type,DateUtil.isWeekend(date)))
                        .sum())
                        .thenComparing(Hotel::getRating, Comparator.reverseOrder()))
                .orElseThrow();
    }
}
