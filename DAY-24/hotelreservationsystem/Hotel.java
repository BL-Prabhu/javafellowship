package hotelreservationsystem;

public class Hotel
{
    private String name;
    private int rating;
    private Rate regularRate;
    private Rate rewardRate;

    public Hotel(String name, int rating, Rate regularRate, Rate rewardRate)
    {
        this.name = name;
        this.rating = rating;
        this.regularRate = regularRate;
        this.rewardRate = rewardRate;
    }

    public int getRate(CustomerType type, boolean isWeekend)
    {
        Rate rate = (type == CustomerType.REWARDS) ? rewardRate : regularRate;

        return isWeekend ? rate.getWeekendRate() : rate.getWeekdayRate();
    }

    public String getName()
    {
        return name;
    }

    public int getRating()
    {
        return rating;
    }
}
