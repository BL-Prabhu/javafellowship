package methodreference;

// DEFINITION OF METHOD REFERENCE
// ----------------------------------
// 1. It is used to refer the method of functional interface.
// 2. It is a easy form of lambda expression.
// 3. we can replace lambda expression with method reference.

// TYPES OF METHOD REFERENCES
// ------------------------------
// 1. Reference to static method.
// 2. Reference to instance method.
// 3. Reference to a constructor.
// ------------------------------------------------------------------------------------------------------------------------------

@FunctionalInterface
interface Parent
{
    public abstract void add(int numberOne, int numberTwo);
}

public class StaticMethodReference
{
    public  static  void sub(int numberOne, int numberTwo)
    {
        int c=numberOne+numberTwo;
        System.out.println(c);
    }

    public static void main(String[] args)
    {
        Parent p=StaticMethodReference::sub;
        p.add(100,200);
    }
}
