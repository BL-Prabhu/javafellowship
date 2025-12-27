package Unaryoperator;


//  PREDEFINED FUNCTIONAL INTERFACE - BINARYOPERATOR
// ----------------------------------------------------
// it contains one abstract method called apply(T, T, T)
// it accept two argument
// it returns a result of the same type
// it extends Bi-function interface
// it is used to refer lambda expression
// in stream BINARYOPERATOR is used in reduce() method

// DEFAULT METHODS IN BINARYOPERATOR INTERFACE
// ----------------------------------------
// bi-function provides default methods to combine conditions logically.

// DEFAULT METHODS OF BINARYOPERATOR INTERFACE
// --------------------------------------
// andThen() method

// andThen() method
// ------------------
// returns a composed function that first apply this function and then applies the after function to the result
// PURPOSE -> Allows sequential operations where the output of the first function is fed into the second.

// --------------------------------------------------------------------------------------------------------------------------------

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorUseAnonymous
{
    public static void main(String[] args)
    {
        // binary operator use anonymous class
        // ---------------------------------------
        BinaryOperator<Integer> sum = new BinaryOperator<Integer>()
        {
            public Integer apply(Integer a, Integer b)
            {
                return a + b;
            }
        };
        System.out.println("Sum: " + sum.apply(10, 20));


        BinaryOperator<Integer> add = new BinaryOperator<Integer>()
        {
            public Integer apply(Integer a, Integer b)
            {
                return a + b;
            }
        };

        Function<Integer, String> convertToString = new Function<Integer, String>()
        {
            public String apply(Integer value)
            {
                return "Result is: " + value;
            }
        };

        // default of binaryoperator interface-> andThen()
        // -------------------------------------------------
        System.out.println(add.andThen(convertToString).apply(10, 20));
    }
}
