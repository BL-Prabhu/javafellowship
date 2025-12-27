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

public class UnaryOperatorUseAnonymous
{
    public static void main(String[] args)
    {
        // unaryOperator use anonymous class
        // ------------------------------------
        UnaryOperator<Integer> square = new UnaryOperator<Integer>()
        {
            public Integer apply(Integer value)
            {
                return value * value;
            }
        };
        System.out.println("Result: " + square.apply(5));

        UnaryOperator<Integer> addTen = new UnaryOperator<Integer>()
        {
            public Integer apply(Integer x)
            {
                return x + 10;
            }
        };

        // unary operator default method andThen()
        // ---------------------------------------------------
        System.out.println(square.andThen(addTen).apply(5));


        UnaryOperator<Integer> multiplyByThree = new UnaryOperator<Integer>()
        {
            public Integer apply(Integer x)
            {
                return x * 3;
            }
        };

        UnaryOperator<Integer> addTwo = new UnaryOperator<Integer>()
        {
            public Integer apply(Integer x)
            {
                return x + 2;
            }
        };

        // unary operator default method compose()
        // --------------------------------------------
        System.out.println(multiplyByThree.compose(addTwo).apply(4));
    }
}
