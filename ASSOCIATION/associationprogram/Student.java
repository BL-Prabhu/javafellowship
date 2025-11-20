package associationprogram;

public class Student
{
    String name;
    Address address;

    public Student(String name, Address address)
    {
        this.name = name;
        this.address = address;
    }


    public void displayStudentInformation()
    {
        System.out.println("STUDENT NAME : "+name+" CITY : "+address.city+","+"STATE : "+address.state);
    }
}
