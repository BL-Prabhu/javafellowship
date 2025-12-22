package userregistrationinexceptionconcept;

public class UserRegistrationException extends Exception
{
    public ExceptionType type;

    public UserRegistrationException(ExceptionType type, String message)
    {
        super(message);
        this.type=type;
    }
}
