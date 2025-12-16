package maxvalueofalldatatypes;

public class MaxValueOfAllDatatypes
{
    public static void main(String[] args)
    {
        Object[] input={4,11,10000L,100000L,11.11f,34.45f,44.498766d,67.7876857463d,'A','Z',"hi","java"};

        Integer intmax=null;
        Long longmax=null;
        Float floatmax=null;
        Double doudlemax=null;
        Character charmax=null;
        String stringmax=null;


        for(Object obj : input)
        {
            if(obj instanceof Integer)
            {
                int intvalue = (int) obj;
                if(intmax == null || intvalue>intmax)
                {
                    intmax=intvalue;
                }
            }

            if(obj instanceof Long)
            {
                long longvalue = (long) obj;
                if(longmax == null || longvalue>longmax)
                {
                    longmax=longvalue;
                }
            }

            if(obj instanceof Float)
            {
                float floatvalue = (float) obj;
                if(floatmax == null || floatvalue>floatmax)
                {
                    floatmax=floatvalue;
                }
            }

            if(obj instanceof Double)
            {
                double dloublevalue = (double) obj;
                if(doudlemax == null || dloublevalue>doudlemax)
                {
                    doudlemax=dloublevalue;
                }
            }

            if(obj instanceof Character)
            {
                char charvalue = (char) obj;
                if(charmax == null || charvalue>charmax)
                {
                    charmax=charvalue;
                }
            }

            if(obj instanceof String)
            {
                String stringvalue = (String) obj;
                if(stringmax == null || stringvalue.length()>stringmax.length())
                {
                    stringmax=stringvalue;
                }
            }

        }

        System.out.println("max of int  : "+intmax);
        System.out.println("max of long : "+longmax);
        System.out.println("max of float : "+floatmax);
        System.out.println("max of double : "+doudlemax);
        System.out.println("max of char  : "+charmax);
        System.out.println("max of string : "+stringmax);
    }
}
