package composition;

public class Room
{
    String roomSize;
    int roomNumber;

    public Room(String roomSize, int roomNumber)
    {
        this.roomSize = roomSize;
        this.roomNumber = roomNumber;
    }

    public void displayRoomInformation()
    {
        System.out.println(" ROOM-SIZE : "+roomSize+" ROOM-NUMBER : "+roomNumber);
    }
}
