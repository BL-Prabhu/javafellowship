// Parent class
class Parent
{
    String value = "Parent Value"; // Variable in parent

    public void parentMethod()
    {
        System.out.println("Parent method called");
    }

    public void show()
    {
        System.out.println("Parent show method");
    }
}

// Child class
class Child extends Parent {

    String value = "Child Value"; // Variable in child (shadows parent's variable)

    public void childMethod()
    {
        System.out.println("Child method called");
    }

    @Override
    public void show()
    {
        System.out.println("Child show method (overridden)");
    }
}

// Main class
public class InheritanceCastingWithVariable
{
    public static void main(String[] args)
    {

        Child oc=new Child();
        oc.show();
        oc.childMethod();
        oc.parentMethod();
        System.out.println(oc.value);

        System.out.println("---------------------------------------------------");

        // 1️⃣ Upcasting: Child object referenced by Parent type
        Parent p = new Child();  // Upcasting

        System.out.println("Access variable via Parent reference: " + p.value);
        p.parentMethod();        // Parent method
        p.show();                // Overridden method → Child version runs


        // p.childMethod();      // ❌ Not allowed

        // 2️⃣ Downcasting: Parent reference cast back to Child type
        Child c = (Child) p;     // Downcasting
        System.out.println("Access variable via Child reference: " + c.value);

        c.childMethod();         // Now child method can be called
        c.show();                // Calls overridden method
        c.parentMethod();
    }
}
