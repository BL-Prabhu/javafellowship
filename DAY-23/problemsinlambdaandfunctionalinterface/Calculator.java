package problemsinlambdaandfunctionalinterface;

interface Operation
{
    public abstract void calculation(double numberOne, double numberTwo);
}

public class Calculator
{
    public static void main(String[] args)
    {
        Operation addition=(numberOne, numberTwo)->System.out.println(" RESULT OF ADDITION OPERATION : "+(numberOne+numberTwo));
        Operation subtraction=(numberOne, numberTwo)->System.out.println(" RESULT OF subtraction OPERATION : "+(numberOne - numberTwo));
        Operation multiplication=(numberOne, numberTwo)->System.out.println(" RESULT OF multiplication OPERATION : "+(numberOne*numberTwo));
        Operation division=(numberOne, numberTwo)->System.out.println(" RESULT OF division OPERATION : "+(numberOne/numberTwo));

        addition.calculation(100,100);
        subtraction.calculation(100,45);
        multiplication.calculation(12,12);
        division.calculation(100,4);
    }
}
