package methodreference;

@FunctionalInterface
interface ConstructorParent
{
    public abstract void mul(int numberOne, int numberTwo);
}

public class ConstructorMethodReference
{
    public ConstructorMethodReference(int numberOne, int numberTwo)
    {
        int result=numberOne*numberTwo;
        System.out.println(result);
    }

    public static void main(String[] args)
    {
        ConstructorParent cp=ConstructorMethodReference::new;
        cp.mul(20,40);

    }
}
