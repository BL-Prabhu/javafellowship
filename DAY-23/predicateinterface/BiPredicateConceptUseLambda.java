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

public class BiPredicateConceptUseLambda
{
    public static void main(String[] args)
    {
        BiPredicate<Integer,Integer> isSumEven=(numberone,numbertwo)->(numberone+numbertwo)%2==0;
        System.out.println(isSumEven.test(23,24));

        BiPredicate<Integer,Integer> sumGreaterThan50=(a,b)->(a+b)>50;
        BiPredicate<Integer,Integer> bothEven=(a,b)->(a%2==0) && (b%2==0);

        // and() method -> both condition must be true
        // ------------------------------------------------
        BiPredicate<Integer,Integer> andCondition=sumGreaterThan50.and(bothEven);
        System.out.println("AND CONDITION : "+andCondition.test(30,22));
        System.out.println("AND CONDITION : "+andCondition.test(20,10));

        // or() method -> at least one condition must be true
        // --------------------------------------------------
        BiPredicate<Integer,Integer> orCondition=sumGreaterThan50.or(bothEven);
        System.out.println("OR CONDITION : "+orCondition.test(30,22));
        System.out.println("OR CONDITION : "+orCondition.test(20,10));

        // negate() method -> reverse the actual result
        // ----------------------------------------------
        BiPredicate<Integer,Integer> negateCondition=sumGreaterThan50.negate();
        System.out.println("NEGATE CONDITION : "+negateCondition.test(30,22));
        System.out.println("NEGATE CONDITION : "+negateCondition.test(20,10));


    }
}
