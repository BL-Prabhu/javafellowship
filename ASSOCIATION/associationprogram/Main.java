package associationprogram;

public class Main
{
    public static void main(String[] args)
    {
        Address add=new Address("dindigul","tamilnadu");
        Student stu=new Student(1,"prabhu",add);
        stu.displayStudentInformation();
        stu= null;
        add.displayAddressInformation();
    }
}
