package stringperformance;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("STRING CONCATENATION PERFORMANCE");
        System.out.println("---------------------------------");
        StringClass.checkStringPerformance();
        StringClass.checkStringBuilderPerformance();
        StringClass.checkStringBufferPerformance();
    }
}
