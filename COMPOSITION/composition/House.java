package composition;

public class House
{
    Room room;

    public House(String roomSize, int roomNumber)
    {
        room = new Room(roomSize,roomNumber);
    }

    public void displayHouseInformation()
    {
        System.out.println("HOUSE-DETAILS : "+" ROOM SIZE : "+room.roomSize+" , "+" ROOM NUMBER : "+room.roomNumber);
    }
}
