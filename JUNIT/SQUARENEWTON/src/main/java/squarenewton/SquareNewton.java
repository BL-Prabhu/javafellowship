package squarenewton;

import java.util.Scanner;

public class SquareNewton
{

    public static void ConvertSquare(double input)
    {
        if(input <=0)
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
            double answer=input;
            double epsilon=1e-15;

            while (Math.abs(answer - input / answer) > epsilon * answer)
            {
                answer = (answer + input / answer) / 2.0;
            }
            System.out.println("ANSWER : "+answer);
        }
    }

    public static void getInput()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int input=scan.nextInt();
        SquareNewton.ConvertSquare(input);
    }

    public static void main(String[] args)
    {
        SquareNewton.getInput();
    }
}
