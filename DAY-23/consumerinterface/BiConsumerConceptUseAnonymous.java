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

public class BiConsumerConceptUseAnonymous
{
    public static void main(String[] args)
    {

        // bi-consumer interface use anonymous class
        // --------------------------------------------
        BiConsumer<Integer, Integer> biConsumer = new BiConsumer<Integer, Integer>()
        {
            public void accept(Integer a, Integer b)
            {
                System.out.println("Sum: " + (a + b));
            }
        };
        biConsumer.accept(10, 20);

        // bi consumer default method andThen() method
        // ---------------------------------------------
        BiConsumer<Integer, Integer> biConsumer1 = new BiConsumer<Integer, Integer>()
        {
            public void accept(Integer a, Integer b)
            {
                System.out.println("First BiConsumer: " + (a + b));
            }
        };

        BiConsumer<Integer, Integer> biConsumer2 = new BiConsumer<Integer, Integer>()
        {
            public void accept(Integer a, Integer b)
            {
                System.out.println("Second BiConsumer: " + (a * b));
            }
        };
        biConsumer1.andThen(biConsumer2).accept(5, 3);
    }
}
