package reviewprogram;

interface MechanicalOperation
{
    public void Start();
    public void Stop();
}

abstract class Machine implements MechanicalOperation
{
    private  String MachineName;

    public Machine(String MachineName)
    {
        this.MachineName=MachineName;
        System.out.println(" MACHINE NAME : "+MachineName);
    }

    abstract void Maintanence();
}

class EngineDetails
{
    private String horsePower;
    private int cc;

    public String getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}

class DieselEngine extends Machine
{
    EngineDetails engineDetails;

    public DieselEngine(String MachineName,String horsePower,int cc)
    {
        super(MachineName);
        engineDetails=new EngineDetails();
        engineDetails.setHorsePower(horsePower);
        engineDetails.setCc(cc);
    }

    @Override
    void Maintanence()
    {
        System.out.println("NEXT maintanence date : next week");
    }

    @Override
    public void Start()
    {
        if(engineDetails.getCc() <= 100)
        {
            throw new PowerNotSufficientException("ENGINE CC SHOULD BE ABOVE 100....");
        }
        else
        {
            System.out.println("ENGINE STARTED....");
            ShowDetails();
            Maintanence();
            Stop();
        }
    }

    @Override
    public void Stop()
    {
        System.out.println("ENGINE STOPPED.....");
    }

    public void ShowDetails()
    {
        System.out.println(" ENGINE HORSEPOWER : "+engineDetails.getHorsePower());
        System.out.println(" ENGINE CC : "+engineDetails.getCc());
    }
}

public class Main
{
    public static void main(String[] args)
    {
        DieselEngine dieselengine=new DieselEngine("BMW","7000",1000);
        try
        {
            dieselengine.Start();
        }
        catch(PowerNotSufficientException p)
        {
            System.out.println(p.getMessage());
        }
    }
}

