package shallowclone;

public class ShallowClone implements Cloneable
{
    String name;
    int id;

    public ShallowClone(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ShallowClone s=new ShallowClone("prabhu",1);
        System.out.println("id : "+s.id);
        System.out.println("name : "+s.name);

       ShallowClone s1= (ShallowClone) s.clone();
       s1.id=2;
       s1.name="java";

        System.out.println("id : "+s1.id);
        System.out.println("name : "+s1.name);


    }

}
