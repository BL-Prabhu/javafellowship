package supplierinterface;
import java.util.function.Supplier;

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

public class SupplierConceptUseLambda
{
    public static void main(String[] args)
    {

        // supplier interface use lambda
        // --------------------------------
        Supplier<String> supplier = () -> "Hello using Lambda";
        System.out.println(supplier.get());
    }
}
