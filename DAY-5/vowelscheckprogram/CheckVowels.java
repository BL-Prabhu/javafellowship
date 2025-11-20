package vowelscheckprogram;

import java.util.Scanner;

public class CheckVowels
{
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("ENTER THE LETTER TO CHECK");
        String input=scan.next();

        if(input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u")
                      || input.equals("A") || input.equals("E") || input.equals("I") || input.equals("O") || input.equals("U"))
        {
            System.out.println("VOWELS");
        }
        else
        {
            System.out.println("CONSONANT");
        }
    }
}
