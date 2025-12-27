package functioninterface;

// PREDEFINED FUNCTIONAL INTERFACE - FUNCTION
// ---------------------------------------------
// it contains one abstract method called apply()
// it accept one argument
// it returns any return datatype
// it is used to refer lambda expression
// in stream FUNCTION is used in map(), flatMap() methods.
// Function is used when we need to transform an object from one type to another.

// DEFAULT METHODS IN FUNCTION INTERFACE
// ----------------------------------------
// Predicate provides default methods to combine conditions logically.

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

import java.util.function.Function;

public class FunctionConceptUseLambda
{
    public static void main(String[] args)
    {
        Function<Integer,Integer> square=(number)->number*number;
        System.out.println(square.apply(13));

        Function<Integer, Integer> multiplyBy2 = n -> n * 2;
        Function<Integer, Integer> add5 = n -> n + 5;

        // AND THEN() METHOD USE ANONYMOUS CLASS
        // ----------------------------------------
        Function<Integer, Integer> andThenCondition = multiplyBy2.andThen(add5);
        System.out.println(andThenCondition.apply(10));


        //  COMPOSE() METHOD USE ANONYMOUS CLASS
        // ----------------------------------------
        Function<Integer, Integer> composeCondition = multiplyBy2.compose(add5);
        System.out.println(composeCondition.apply(4));

    }
}
