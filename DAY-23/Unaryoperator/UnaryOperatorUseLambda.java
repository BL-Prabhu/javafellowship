package Unaryoperator;

//  PREDEFINED FUNCTIONAL INTERFACE - UNARYOPERATOR
// ----------------------------------------------------
// it contains one abstract method called apply(T t)
// it accept one argument
// it returns a result of the same type
// it extends function interface
// it is used to refer lambda expression
// In stream UNARYOPERATOR used in iterate() method.

// DEFAULT METHODS IN UNARYOPERATOR INTERFACE
// -------------------------------------------
// unaryOperator provides default methods to combine conditions logically.

// DEFAULT METHODS OF FUNCTION INTERFACE
// --------------------------------------
// andThen() method
// compose() method

// andThen() method
// ------------------
// returns a composed function that first apply this function and then applies the after function to the result
// PURPOSE -> Allows sequential operations where the output of the first function is fed into the second.

// compose() method
// -------------------
// Returns a composed function that first applies the before function, and then applies this function to its result.
// Purpose -> Allows pre-processing or transformation before the main function is applied.

// -------------------------------------------------------------------------------------------------

import java.util.function.UnaryOperator;

public class UnaryOperatorUseLambda
{
    public static void main(String[] args)
    {
        // unaryOperator use lambda
        // -------------------------------
        UnaryOperator<String> toUpper = str -> str.toUpperCase();
        System.out.println(toUpper.apply("java"));

        // unary operator default method andThen()
        // -------------------------------------------
        UnaryOperator<Integer> doubleValue = x -> x * 2;
        UnaryOperator<Integer> subtractOne = x -> x - 1;
        System.out.println(doubleValue.andThen(subtractOne).apply(10));

        // unary operator default method compose()
        // ----------------------------------------------
        UnaryOperator<Integer> square = x -> x * x;
        UnaryOperator<Integer> minusTwo = x -> x - 2;
        System.out.println(square.compose(minusTwo).apply(6));
    }
}
