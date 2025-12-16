package customexceptionunchecked;

public class VoterAge
{
    public void checkVoterAge(int age)
    {
        if (age < 18)
        {
            throw new CheckVoterAge("AGE SHOULD BE ABOVE 18");
        }
        else
        {
            System.out.println("VALID AGE FOR VOTE");
        }
    }

    public static void main(String[] args)
    {
        VoterAge vote = new VoterAge();

        try
        {
            vote.checkVoterAge(13);
        }
        catch (CheckVoterAge e)
        {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
