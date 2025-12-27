package functioninterface;

// PREDEFINED FUNCTIONAL INTERFACE - BI-FUNCTION
// ---------------------------------------------
// it contains one abstract method called apply(T , U ,R)
// it accept two arguments
// it returns any return datatype
// it is used to refer lambda expression

// DEFAULT METHODS IN BI-FUNCTION INTERFACE
// ----------------------------------------
// bi-function provides default methods to combine conditions logically.

// DEFAULT METHODS OF BI-FUNCTION INTERFACE
// --------------------------------------
// andThen() method

// andThen() method
// ------------------
// returns a composed function that first apply this function and then applies the after function to the result
// PURPOSE -> Allows sequential operations where the output of the first function is fed into the second.

// -------------------------------------------------------------------------------------------------

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionConceptUseLambda
{
    public static void main(String[] args)
    {
        // bi-function interface use lambda expression
        // ----------------------------------------------
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(5, 4));

        Function<Integer, Integer> addTen = n -> n + 10;

        // bi function andthen() method
        // -----------------------------
        BiFunction<Integer, Integer, Integer> andThenCondition = multiply.andThen(addTen);
        System.out.println(andThenCondition.apply(5, 2));
    }
}
