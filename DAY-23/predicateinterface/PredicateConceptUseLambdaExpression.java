package predicateinterface;

// PREDEFINED FUNCTIONAL INTERFACE - PREDICATE
// ---------------------------------------------
// It contains one abstract method called test()
// It accept one argument
// It returns boolean return datatype
// It is used to refer lambda expression
// Commonly used in filtering, validation, and conditional checks.
// In stream PREDICATE is used in filter(), anyMatch(), allMatch(), noneMatch() methods.

// DEFAULT METHODS IN PREDICATE INTERFACE
// ----------------------------------------
// Predicate provides default methods to combine conditions logically.
// METHODS
// -----------
// and() method
// or() method
// negate() method
// isEqual() method

// and() method
// --------------
// this method combines two predicates and returns a new predicate that evaluates to true only if both predicates are true.
// or() method
// --------------
// This method combines two predicates and returns a new predicate that evaluates to true if at least one predicate is true.
// negate() method
// -----------------
// This method returns a predicate that represents the logical negation of the original predicate.
// isEqual() method
// ------------------
// This method returns a predicate that tests whether two objects are equal using equals().

import java.util.function.Predicate;

public class PredicateConceptUseLambdaExpression
{
    public static void main(String[] args)
    {

        // PREDICATE INTERFACE USE LAMBDA EXPRESSION
        // ----------------------------------------------
        Predicate<Integer> isEven=(a)->a%2==0;
        System.out.println(isEven.test(35));

        Predicate<Integer> GreaterThan10=(a)->a>10;
        System.out.println(GreaterThan10.test(8));

        // and() -> both conditions must be true
        // ---------------------------------------
        Predicate<Integer> evenAndGreaterThan10= isEven.and(GreaterThan10);
        System.out.println("AND METHOD : "+evenAndGreaterThan10.test(22));
        System.out.println("AND METHOD : "+evenAndGreaterThan10.test(23));

        // or() -> at least one conditions must be true
        // ---------------------------------------------
        Predicate<Integer> evenOrGreaterThan10= isEven.and(GreaterThan10);
        System.out.println("OR METHOD : "+evenOrGreaterThan10.test(22));
        System.out.println("OR METHOD : "+evenOrGreaterThan10.test(23));

        // negate() -> both conditions must be true
        // ---------------------------------------
        Predicate<Integer> isOdd=isEven.negate();
        System.out.println("NEGATE METHOD : "+isOdd.test(5));
        System.out.println("NEGATE METHOD : "+isOdd.test(4));

        // isEqual() -> both conditions must be true
        // ---------------------------------------
        Predicate<String> isJava= Predicate.isEqual("java");
        System.out.println("IS EQUAL METHOD : "+isJava.test("java"));
        System.out.println("IS EQUAL METHOD : "+isJava.test("mysql"));

    }
}
