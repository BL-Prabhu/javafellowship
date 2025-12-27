package consumerinterface;


// PREDEFINED FUNCTIONAL INTERFACE - BI-CONSUMER
// ---------------------------------------------
// it contains one abstract method called apply(T t, U u)
// it accept two arguments
// it non returns datatype
// it is used to refer lambda expression
// in stream BICONSUMER is used in collect() method

// DEFAULT METHODS IN BI-CONSUMER INTERFACE
// ----------------------------------------
// bi-consumer provides default methods to combine conditions logically.

// DEFAULT METHODS OF BI-CONSUMER INTERFACE
// --------------------------------------
// andThen() method

// andThen() method
// ------------------
// returns a composed function that first apply this function and then applies the after function to the result
// PURPOSE -> Allows sequential operations where the output of the first function is fed into the second.

// -----------------------------------------------------------------------------------------------------------------------------

import java.util.function.BiConsumer;

public class BiConsumerConceptUseLambda
{
    public static void main(String[] args)
    {
        // bi-consumer interface use lambda
        // -------------------------------------
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println("Sum: " + (a + b));
        biConsumer.accept(15, 25);

        // biconsumer default method andThen() method
        // ----------------------------------------------
        BiConsumer<Integer, Integer> add = (a, b) -> System.out.println("Addition: " + (a + b));
        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Multiplication: " + (a * b));
        add.andThen(multiply).accept(4, 6);
    }
}
