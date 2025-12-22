package exception;

import java.util.regex.Pattern;

public class AnalyserOfMood
{
    private String mood;

    private static final Pattern SAD_PATTERN = Pattern.compile("(?i).*sad.*");
    private static final Pattern HAPPY_PATTERN = Pattern.compile("(?i).*happy.*");

    public AnalyserOfMood(String mood)
    {
        this.mood = mood;
    }

    public String analyserOfMood() throws MoodAnalysesException
    {
        if(mood==null)
        {
            throw new MoodAnalysesException(ExceptionType.NULL_MOOD,"MOOD CANNOT BE NULL");
        }
        if(mood.isEmpty())
        {
            throw new MoodAnalysesException(ExceptionType.EMPTY_MOOD,"MOOD CANNOT BE EMPTY");
        }
        if(SAD_PATTERN.matcher(mood).matches())
        {
            return "MOOD IS SAD";
        }
        return "MOOD IS HAPPY";
    }
}
