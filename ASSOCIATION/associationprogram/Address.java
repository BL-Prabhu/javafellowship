package associationprogram;

public class Address
{
    String city;
    String state;

    public Address(String city, String state)
    {
        this.city = city;
        this.state = state;
    }

    public void displayAddressInformation()
    {
        System.out.println("CITY : "+city+" STATE : "+state);
    }
}
