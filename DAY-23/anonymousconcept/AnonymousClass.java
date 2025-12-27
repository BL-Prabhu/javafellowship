package anonymousconcept;

// DEFINITION OF ANONYMOUS CLASS
// -------------------------------
// A class has no name, created inside another class or interface.
// That class name will decide by compiler.
// It should be used to overriding the methods of class or interface.

interface Java
{
    public abstract void message();
    public abstract int calculator(int a, int b);
}

public class AnonymousClass
{
    public static void main(String[] args)
    {
        Java j=new Java()
        {
            public void message()
            {
                System.out.println("JAVA IMPLEMENTATION BY ANONYMOUS CLASS");
            }

            public int calculator(int a, int b)
            {
                int c=a+b;
                return c;
            }
        };
        j.message();
        System.out.println( j.calculator(200,300));
    }
}
