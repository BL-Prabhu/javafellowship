package composition;

public class Main
{
    public static void main(String[] args)
    {
        House house=new House("MEDIUM",121);

        house.displayHouseInformation();

        house=null;

        house.displayHouseInformation();

    }
}
