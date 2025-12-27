package consumerinterface;


// PREDEFINED FUNCTIONAL INTERFACE - CONSUMER
// ---------------------------------------------
// it contains one abstract method called accept(T t)
// it accept one argument
// it non-returns datatype
// it is used to refer lambda expression
// it is used to assignment target for lambda expression and method reference
// in stream CONSUMER is used in forEach(),forEachOrdered(), peek() methods.
// performing actions like logging, updating, or printing values.

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

import java.util.function.Consumer;

public class ConsumerConceptUseAnonymous
{
    public static void main(String[] args)
    {
        // CONSUMER INTERFACE USE ANONYMOUS CLASS
        // ----------------------------------------
        Consumer<String> consumer=new Consumer<String>()
        {
            public void accept(String message)
            {
                System.out.println(message);
            }
        };
        consumer.accept("WELCOME TO JAVA");

        // DEFAULT METHODS  andThen() method use anonymous class
        // -------------------------------------------------------
        Consumer<String> consumer1 = new Consumer<String>()
        {
            public void accept(String value)
            {
                System.out.println(value);
            }
        };

        Consumer<String> consumer2 = new Consumer<String>()
        {
            public void accept(String value)
            {
                System.out.println(value.toUpperCase());
            }
        };
        consumer1.andThen(consumer2).accept("java");
    }
}
