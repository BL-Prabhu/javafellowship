package customexceptionchecked;

public class CheckVoterAge extends Exception
{
    public CheckVoterAge(String message)
    {
        super(message);
    }
}
