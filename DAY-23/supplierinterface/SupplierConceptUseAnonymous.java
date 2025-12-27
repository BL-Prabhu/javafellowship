package supplierinterface;

// PREDEFINED FUNCTIONAL INTERFACE - SUPPLIER
// ---------------------------------------------
// it contains one abstract method called get(T t)
// it doesn't accept any argument
// it returns any return datatype
// it is used to refer lambda expression
// it is used to  supply the data to another function
// It is commonly used for lazy object creation, default values, and factory methods.
// there is no default methods in supplier interface
// in stream SUPPLIER is used in generate() method.

// ---------------------------------------------------------------------------------------------------------------------

import java.util.function.Supplier;

public class SupplierConceptUseAnonymous
{
    public static void main(String[] args)
    {
        // supplier interface use anonymous class
        // -----------------------------------------
        Supplier<String> supplier = new Supplier<String>()
        {
            public String get()
            {
                return "Hello from Supplier";
            }
        };

        System.out.println(supplier.get());
    }
}
