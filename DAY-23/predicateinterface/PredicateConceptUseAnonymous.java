package predicateinterface;

import java.util.function.Predicate;

// PREDEFINED FUNCTIONAL INTERFACE - PREDICATE
// ---------------------------------------------
// it contains one abstract method called test()
// it accept one argument
// it returns boolean return datatype
// it is used to refer lambda expression
// Commonly used in filtering, validation, and conditional checks.
// in stream PREDICATE is used in filter(), anyMatch(), allMatch(), noneMatch() methods.

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

public class PredicateConceptUseAnonymous
{
    public static void main(String[] args)
    {
        // PREDICATE INTERFACE USE ANONYMOUS CLASS
        // ----------------------------------------------

        Predicate<Integer> isEven=new Predicate<Integer>()
        {
            public boolean test(Integer number)
            {
                if(number%2==0)
                {
                    return true;
                }
                return false;
            }
        };
        System.out.println(isEven.test(457));
        System.out.println(isEven.test(22));

        Predicate<Integer> isGreaterThan10= new Predicate<Integer>()
        {
            public boolean test(Integer number)
            {
                return number>10;
            }
        };

        // and() -> both conditions must be true
        // ---------------------------------------
        Predicate<Integer> evenAndGreaterThan10= isEven.and(isGreaterThan10);
        System.out.println("AND METHOD : "+evenAndGreaterThan10.test(22));
        System.out.println("AND METHOD : "+evenAndGreaterThan10.test(23));

        // or() -> at least one conditions must be true
        // ---------------------------------------------
        Predicate<Integer> evenOrGreaterThan10= isEven.and(isGreaterThan10);
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
