package consumerinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// PREDEFINED FUNCTIONAL INTERFACE - CONSUMER
// ---------------------------------------------
// it contains one abstract method called accept(T t)
// it accept one argument
// it non-returns datatype
// it is used to refer lambda expression
// it is used to assignment target for lambda expression and method reference
// in stream CONSUMER is used in forEach(),forEachOrdered(), peek() methods.

// DEFAULT METHODS IN CONSUMER INTERFACE
// ----------------------------------------
// consumer provides default methods to combine conditions logically.

// METHODS
// -----------
// andThen() method

// andThen() METHOD
// ---------------------
// returns a composed function that first apply this function and then applies the after function to the result
// PURPOSE -> Allows sequential operations where the output of the first function is fed into the second.

// ---------------------------------------------------------------------------------------------------------------------

public class ConsumerConceptUseLambda
{
    public static void main(String[] args)
    {
        // CONSUMER INTERFACE USE LAMBDA EXPRESSION
        // ------------------------------------------
        Consumer<String> consumer=(message)->System.out.println(message);
        consumer.accept("WELCOME TO JAVA");

        // RREAL-TIME EXAMPLE
        // --------------------
        List<String> names = Arrays.asList("Prabhu", "Vinoth", "Kumar");
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // DEFAULT METHODS  andThen() method use lambda exprssion
        // -------------------------------------------------------
        Consumer<String> consumer1 =(value)->System.out.println(value);
        Consumer<String> consumer2 =(value)->System.out.println(value.toUpperCase());
        consumer1.andThen(consumer2).accept("java");
    }
}
