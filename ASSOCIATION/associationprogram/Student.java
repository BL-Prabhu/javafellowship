package associationprogram;

public class Student
{
    int id;
    String name;
    Address address;

    public Student(int id,String name, Address address)
    {
        this.id=id;
        this.name = name;
        this.address = address;
    }


    public void displayStudentInformation()
    {
        System.out.println("STUDENT ID : "+id+"STUDENT NAME : "+name+" CITY : "+address.city+","+"STATE : "+address.state);
    }
}
