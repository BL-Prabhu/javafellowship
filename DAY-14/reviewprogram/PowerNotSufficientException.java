package reviewprogram;

public class PowerNotSufficientException extends RuntimeException
{
    public PowerNotSufficientException(String message)
    {
        super(message);
    }
}
