package stringperformance;

public class StringClass
{
    private static final int INPUT=10000;

    public static void checkStringPerformance()
    {
        long startTime=System.currentTimeMillis();
        String s="";
        for(int i=0;i<INPUT;i++)
        {
            s=s+"a";
        }
        long endTime=System.currentTimeMillis();
        System.out.println("STRING PERFORMANCE TIME : "+(endTime-startTime)+" ms");
    }

    public static void checkStringBuilderPerformance()
    {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < INPUT; i++)
        {
            sb.append("a");
        }
        long  endTime = System.currentTimeMillis();
        System.out.println("STRING BUILDER PERFORMANCE TIME : " +(endTime - startTime) + " ms");
    }

    public static void checkStringBufferPerformance()
    {
        long startTime = System.currentTimeMillis();

        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < INPUT; i++)
        {
            sbuf.append("a");
        }

        long endTime = System.currentTimeMillis();
        System.out.println("STRING BUFFER PERFORMANCE TIME : " +(endTime - startTime) + " ms");
    }
}
