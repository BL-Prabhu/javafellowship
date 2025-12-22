package exception;

public class MoodAnalysesException extends Exception
{
    public ExceptionType types;

    public MoodAnalysesException(ExceptionType types,String message)
    {
        super(message);
        this.types = types;
    }
}
