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

public class BinaryOperatorUseLambda
{
    public static void main(String[] args)
    {
        // binary operator use lambda expression
        // -----------------------------------------
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(5, 6));

        // binary operator default method andthen()
        // ------------------------------------------------
        System.out.println(multiply.andThen(result -> "Final value: " + result).apply(5, 4));

    }
}
