package exception;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("HAPPY MOOD");
        System.out.println("------------");
        AnalyserOfMood one=new AnalyserOfMood("I AM IN HAPPY MOOD");
        try
        {
            System.out.println(one.analyserOfMood());
        }
        catch (MoodAnalysesException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("SAD MOOD");
        System.out.println("------------");
        AnalyserOfMood two=new AnalyserOfMood("I AM IN SAD MOOD");
        try
        {
            System.out.println(two.analyserOfMood());
        }
        catch (MoodAnalysesException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("EMPTY MOOD");
        System.out.println("------------");
        AnalyserOfMood three=new AnalyserOfMood("");
        try
        {
            System.out.println(three.analyserOfMood());
        }
        catch (MoodAnalysesException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("NULL MOOD");
        System.out.println("------------");
        AnalyserOfMood four=new AnalyserOfMood(null);
        try
        {
            System.out.println(four.analyserOfMood());
        }
        catch (MoodAnalysesException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
