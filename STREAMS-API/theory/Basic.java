package theory;

// DEFINITION OF STREAM
// ------------------------
// Stream is used to process the collection of objects.
// it doesn't affect the original data structure.
// Stream doesn't store data, it processes data from the source.
// Operations are lazy loading, intermediate operations are executed only when terminal operation invoked.
// Elements in streams are visited only once, you must create a new stream for revisit.
// Stream keeps the Ordering of the data elements the same as the ordering in the source.
// It is used to filter, collect, convert one data structure to another data structure.
// two types of operations -> INTERMEDIATE OPERATION, TERMINAL OPERATION.

// INTERMEDIATE OPERATION
// --------------------------
// it transform a stream into another stream.
// it is lazy means it is not executed immediately, only executed when terminal operation is invoked.
// channing the intermediate operations - pipelined
// Multiple intermediate operations form a pipeline
// filter(), map(), flatMap(), sorted(), distinct().

// TERMINAL OPERATION
// ---------------------
// Terminal operation triggers the execution of stream pipeline.
// Terminal operation returns final results.
// Once a terminal operation is executed, the stream is consumed and cannot be reused.
// forEach(), collect(), reduce(), count(), findFirst(), anyMatch()

// FILTER METHOD
// ----------------
// it is a intermediate operation
// It accepts the predicate functional interface
// predicate have one abstract method test()-> it is boolean return data type.
// It is used to perform condition selection
// it returns a new stream

// FOREACH METHOD
// ---------------
// it is terminal operation.
// It accepts the consumer functional interface.
// consumer have one abstract method accept() -> it is non return data type.
// It is used to iterate elements in the stream.
// It returns a final result.

// MAP METHOD
// -------------
// It is a intermediate operation.
// It accepts the function functional interface.
// function have one abstract method apply() -> it is any return data type.
// It is used to transform each element in stream into another form, it doesn't change the number of elements in stream.
// It is maintaining one-to-one mapping.
// It returns a new stream.

// COLLECT METHOD
// ------------------
// It is a terminal operation.
// It's internally using COLLECTOR (collector made up of three main internal steps).
// COLLECTOR STEPS
//-----------------
// 1. SUPPLIER -> to create empty container to store result.
// 2. ACCUMULATOR -> it takes each element in the stream and add it to the container.
// 3. COMBINER -> it combines multiple container into one.
// it support parallel execution.
// It is used to transform the elements of stream into final result such as LIST, SET, MAP.

// COUNT METHOD
// --------------
// It is a terminal operation.
// The return final result as a long
// It is used to count the number of elements in the stream.

// REDUCE METHOD
// --------------
// It is a terminal operation.
// It accepts BINARY-OPERATOR -> (it takes two arguments and return same data type of inputs)
// BINARY-OPERATOR have one abstract method apply()
// It is used to combine all elements of a stream into a single result.
// It is used to operation like sum, product, max, min

// SORTED METHOD
// ---------------
// It is a intermediate operation
// It accepts COMPARATOR -> compare() method.
// Comparator have one abstract method compare() it is int return data type
// It is used to sort the elements of a stream in ascending order.
// TimSort for object streams (stable sort)
// Dual-Pivot QuickSort for primitive streams (IntStream, LongStream, DoubleStream)
// for natural sorting -> comparable
// for custom sorting -> comparator

// DISTINCT METHOD
// -------------------
// It is a intermediate operation
// It is used to remove duplicate elements from the stream
// It returns only unique elements only
// Uniqueness is determined by using equals() and hashcode() methods
// INTERNAL WORKING
// ------------------
// First the hashcode method is called
// Java uses HASHSET structure
// If hash value of that element is not present in the set -> element is accepted
// If hash value of that element is present in set by using equals method, if equals method returns true the element is not accepted
// order is preserved in sequential stream

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Basic
{
    public static void main(String[] args)
    {
        List<Integer> input= Arrays.asList(10,20,30,40,30,20,60,50,70,50,60,70,80);

           input.stream()                             // create a stream from list
                .filter(a->a%3==0)                    // intermediate operation
                .forEach(b->System.out.println(b));   // terminal operation

        System.out.println("---------------------------------------------------------------------------------------------");

        input.stream()                                // create a stream from list
                                                      // pipeline starts
                .filter(n -> n > 30)                   // intermediate operation
                .map(n -> n * 2)                      // intermediate operation
                                                      // pipeline ends
                .forEach(System.out::println);        // terminal operation

        System.out.println("---------------------------------------------------------------------------------------------");

        List<Integer> result = input.stream()                             // create a stream from list
                                    .filter(n -> n % 2 == 0)              // intermediate operation
                                    .collect(Collectors.toList());        // terminal operation

        System.out.println(result);

        System.out.println("---------------------------------------------------------------------------------------------");

        long count = input.stream()                 // create a stream from list
                .filter(n -> n > 2)                 // intermediate operation
                .count();                           // terminal operation

        System.out.println(count);

        System.out.println("---------------------------------------------------------------------------------------------");

        System.out.println("ASCENDING ORDER");
        System.out.println("-----------------");
           input.stream()
                .sorted()
                .forEach(a->System.out.println(a));

        System.out.println("---------------------------------------------------------------------------------------------");

        System.out.println("DESCENDING ORDER");
        System.out.println("-----------------");
        input.stream()
                .sorted((a,b)->b.compareTo(a))
                .forEach(a->System.out.println(a));

        System.out.println("---------------------------------------------------------------------------------------------");

        System.out.println("ASCENDING ORDER");
        System.out.println("-----------------");

        input.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

        System.out.println("---------------------------------------------------------------------------------------------");

        System.out.println("DESCENDING ORDER");
        System.out.println("-----------------");

        input.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("---------------------------------------------------------------------------------------------");

        System.out.println("ONLY UNIQUE ELEMENTS");
        System.out.println("---------------------");

        input.stream()
                .distinct()
                .forEach(a->System.out.println(a));

        System.out.println("---------------------------------------------------------------------------------------------");



    }
}
