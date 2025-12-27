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

// compose() method
// -------------------
// Returns a composed function that first applies the before function, and then applies this function to its result.
// Purpose -> Allows pre-processing or transformation before the main function is applied.

// -------------------------------------------------------------------------------------------------

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionConceptUseAnonymousClass
{
    public static void main(String[] args)
    {
        // bi-functional interface use anonymous class
        // -----------------------------------------------
        BiFunction<Integer, Integer, Integer> add = new BiFunction<Integer, Integer, Integer>()
        {
                    public Integer apply(Integer a, Integer b)
                    {
                        return a + b;
                    }
        };
        System.out.println("Result: " + add.apply(10, 20));


        Function<Integer, Integer> square = new Function<Integer, Integer>()
        {
                    public Integer apply(Integer n)
                    {
                        return n * n;
                    }
        };

        // BI-FUNCTION andthen() method
        // -------------------------------
        BiFunction<Integer, Integer, Integer> andThenCondition = add.andThen(square);
        System.out.println(andThenCondition.apply(3, 4));
    }
}
