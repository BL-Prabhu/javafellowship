package comparethreeparameters;

public class CompareThreeVariablesWithComparator<T extends Comparable<T>>
{
    private T x, y, z;

    public CompareThreeVariablesWithComparator(T x, T y, T z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static <T extends Comparable<T>> T findMax(T a, T b, T c)
    {
        T max = a;

        if (b.compareTo(max) > 0)
        {
            max = b;
        }

        if (c.compareTo(max) > 0)
        {
            max = c;
        }

        return max;
    }

    public T testMaximum()
    {
        return findMax(x, y, z);
    }

    public static void main(String[] args)
    {
        CompareThreeVariablesWithComparator<Integer> intTest = new CompareThreeVariablesWithComparator<>(23, 34, 45);
        System.out.println("INTEGER MAX : " + intTest.testMaximum());

        CompareThreeVariablesWithComparator<Float> floatTest = new CompareThreeVariablesWithComparator<>(11.123f, 22.234f, 33.345f);
        System.out.println("FLOAT MAX   : " + floatTest.testMaximum());

        CompareThreeVariablesWithComparator<Double> doubleTest = new CompareThreeVariablesWithComparator<>(11.12345d, 22.23456d, 33.45678d);
        System.out.println("DOUBLE MAX  : " + doubleTest.testMaximum());

        CompareThreeVariablesWithComparator<String> stringTest = new CompareThreeVariablesWithComparator<>("prabhu", "java", "objectorientedprogramminglanguage");
        System.out.println("STRING MAX  : " + stringTest.testMaximum());
    }
}
