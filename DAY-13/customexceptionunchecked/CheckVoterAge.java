package customexceptionunchecked;

public class  CheckVoterAge extends RuntimeException
{
    public CheckVoterAge(String message)
    {
        super(message);
    }
}
