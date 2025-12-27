package predicateinterface;

import java.util.function.BiPredicate;

// PREDEFINED FUNCTIONAL INTERFACE - PREDICATE
// ---------------------------------------------
// it contains one abstract method called test(T t, U u)
// it accept two arguments
// it returns boolean return datatype
// it test the given condition on two inputs and return true or false
// it is used to refer lambda expression

// DEFAULT METHODS IN PREDICATE INTERFACE
// ----------------------------------------
// Predicate provides default methods to combine conditions logically.

// METHODS
// -----------
// and() method
// or() method
// negate() method

// and() method
// --------------
// this method combines two predicates and returns a new predicate that evaluates to true only if both predicates are true.
// or() method
// --------------
// This method combines two predicates and returns a new predicate that evaluates to true if at least one predicate is true.
// negate() method
// -----------------
// This method returns a predicate that represents the logical negation of the original predicate.


public class BiPredicateConceptUseAnonymous
{
    public static void main(String[] args)
    {
        BiPredicate<Integer,Integer> isSumEven=new BiPredicate<Integer, Integer>()
        {
            public boolean test(Integer numberone, Integer numbertwo)
            {
                if((numberone+numbertwo)%2==0)
                {
                    return true;
                }
                return false;
            }
        };
        System.out.println(isSumEven.test(22,23));

        BiPredicate<Integer,Integer> sumGreaterThan50=new BiPredicate<Integer, Integer>()
        {
            public boolean test(Integer a, Integer b)
            {
                return (a+b)>50;
            }
        };
        System.out.println(sumGreaterThan50.test(20,40));

        BiPredicate<Integer,Integer> bothEven=new BiPredicate<Integer, Integer>()
        {
            public boolean test(Integer a, Integer b)
            {
                return (a%2 == 0) && (b%2==0);
            }
        };
        System.out.println(bothEven.test(33,40));

        // and() method -> both condition must be true
        // ---------------------------------------------
        BiPredicate<Integer, Integer> andCondition=sumGreaterThan50.and(bothEven);
        System.out.println("AND METHOD : "+andCondition.test(30,63));

        // or() method -> at lease one condition must be true
        // ---------------------------------------------------
        BiPredicate<Integer, Integer> orCondition=sumGreaterThan50.or(bothEven);
        System.out.println("OR METHOD : "+orCondition.test(30,63));

        // negate() method -> opposite of actual result
        // -------------------------------------------------
        BiPredicate<Integer, Integer> negateCondition= sumGreaterThan50.negate();
        System.out.println("NEGATE METHOD : "+negateCondition.test(20,10));

    }
}
