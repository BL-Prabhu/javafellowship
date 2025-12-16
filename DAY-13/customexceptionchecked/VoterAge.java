package customexceptionchecked;

public class VoterAge
{

    public void checkVoterAge(int age) throws CheckVoterAge
    {
        if(age<18)
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
        VoterAge voter=new VoterAge();
        try
        {
            voter.checkVoterAge(11);
        }
        catch (CheckVoterAge e)
        {
            throw new RuntimeException(e);
        }
    }
}
