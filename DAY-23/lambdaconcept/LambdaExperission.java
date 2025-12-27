package lambdaconcept;

// DEFINITION OF LAMBDA EXPRESSION
// ---------------------------------
// it is anonymous function,it does not contain access specifier, return type, name
// it treated as function, so compiler not create class file,
// it uses to provide implementation to functional interface.

// KEY COMPONENTS  OF LAMBDA EXPRESSION
// --------------------------------------
// 1. Argument list = ()
// 2. Arrow token   = ->
// 3. Block         = {}

// DEFINITION OF FUNCTIONAL INTERFACE
// -------------------------------------
// it is an interface has only one abstract method

// RULES OF FUNCTIONAL INTERFACE
// ---------------------------------
// a functional interface can extends another interface only when it does not have any abstract method

// ----------------------------------------------------------------------------------------------------------------------------

// non return type with no argument abstract method
// ----------------------------------
interface Java
{
    public abstract void message();
}

// return type with arguments abstract method (inside method there is one statement)
// -----------------------------------------------------------------------------------
interface Calculator
{
    public abstract int calculator(int a, int b);
}

// return type with arguments abstract method (inside method there is multiple statement)
// --------------------------------------------------------------------------------------
interface ScientificCalculator
{
    public abstract  int scientificCalculator(int a, int b);
}

interface Python
{
    public abstract void message(String opinion);
}

public class LambdaExperission
{
    public static void main(String[] args)
    {
        // non-return type with no argument method
        // ----------------------------------------
        Java j=() -> System.out.println("JAVA IMPLEMENTATION BY LAMBDA EXPRESSION");

        // If return method have one statement no need to write return keyword
        // --------------------------------------------------------------------
        Calculator c=(a,b)->a+b;

        // If return method have multiple statements you need to write return keyword
        // ---------------------------------------------------------------------------
        ScientificCalculator sc=(a,b)->
        {
          int productOfTheNumbers=a*b;
          return productOfTheNumbers;
        };

        // non return type with single argument method
        // --------------------------------------------
        Python p=(opinion)->System.out.println(opinion);

        j.message();
        System.out.println(c.calculator(200,400));
        System.out.println(sc.scientificCalculator(200,400));
        p.message("JAVA IS BEST");

    }
}






