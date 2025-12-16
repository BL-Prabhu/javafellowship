package maxvalueofalldatatypes;

public class MaxValueOfAllDatatypesWithComparable
{
    private static <T extends Comparable<T>> T updateMax(T currentMax, T newValue)
    {
        if (currentMax == null || newValue.compareTo(currentMax) > 0)
        {
            return newValue;
        }
        return currentMax;
    }

    public static void main(String[] args)
    {
        Object[] input = {
                4, 11, 10000L, 100000L,
                11.11f, 34.45f,
                44.498766d, 67.7876857463d,
                'A', 'Z',
                "hi", "java"
        };

        Integer intmax = null;
        Long longmax = null;
        Float floatmax = null;
        Double doublemax = null;
        Character charmax = null;
        String stringmax = null;

        for (Object obj : input)
        {
            if (obj instanceof Integer)
                intmax = updateMax(intmax, (Integer) obj);

            else if (obj instanceof Long)
                longmax = updateMax(longmax, (Long) obj);

            else if (obj instanceof Float)
                floatmax = updateMax(floatmax, (Float) obj);

            else if (obj instanceof Double)
                doublemax = updateMax(doublemax, (Double) obj);

            else if (obj instanceof Character)
                charmax = updateMax(charmax, (Character) obj);

            else if (obj instanceof String)
                stringmax = updateMax(stringmax, (String) obj);
        }

        System.out.println("max of int    : " + intmax);
        System.out.println("max of long   : " + longmax);
        System.out.println("max of float  : " + floatmax);
        System.out.println("max of double : " + doublemax);
        System.out.println("max of char   : " + charmax);
        System.out.println("max of string : " + stringmax);
    }
}
