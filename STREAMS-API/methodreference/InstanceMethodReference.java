package methodreference;

@FunctionalInterface
interface InstanceParent
{
    public abstract void sub(int numberOne, int numberTwo);
}

public class InstanceMethodReference
{
    public void mul(int numberOne, int numberTwo)
    {
        int result=numberOne-numberTwo;
        System.out.println(result);
    }

    public static void main(String[] args)
    {
        InstanceParent ip=new InstanceMethodReference()::mul;
        ip.sub(500,300);
    }
}
