package problemsinlambdaandfunctionalinterface;

import java.util.ArrayList;

interface MathematicalCalculation
{
    public abstract void apply(double input);
}

interface EvenNumber
{
    public abstract void getEvenNumber(double input);
}

public class DoubleTheValue
{
    public static void main(String[] args)
    {
        ArrayList<Double> myList=new ArrayList<Double>();
        myList.add(1.0);
        myList.add(2.0);
        myList.add(3.0);
        myList.add(4.0);
        myList.add(5.0);
        myList.add(6.0);
        System.out.println(myList);


        MathematicalCalculation mc=(input)->System.out.println(input*2);
        myList.forEach(mc::apply);

        EvenNumber e=input->
        {
            if(input%2==0)
            {
                System.out.println(input);
            }
        };
        myList.forEach(e::getEvenNumber);
    }
}
