package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex
{
    static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";
    static final String EMAIL_REGEX = "^[a-z]+@[a-z]+.com$";
    static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%&]).{8,}$";
    static final String PHONE_NUMBER = "^[7-9][0-9]{9}$";

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("--- USER REGISTRATION ---");
            System.out.println("---------------------------");
            System.out.println(" ENTER FIRST NAME : ");
            String firstName = sc.nextLine();
            if (!Pattern.matches(NAME_REGEX, firstName))
            {
                System.out.println("INVALID FIRST NAME. RESTARTING...");
                continue;
            }

            System.out.println("ENTER LAST NAME : ");
            System.out.println("---------------------------");
            String lastName = sc.nextLine();
            if (!Pattern.matches(NAME_REGEX, lastName))
            {
                System.out.println("INVALID LAST NAME. RESTARTING...");
                continue;
            }

            System.out.println("ENTER EMAIL : ");
            System.out.println("---------------------------");
            String email = sc.nextLine().trim();
            if (!Pattern.matches(EMAIL_REGEX, email))
            {
                System.out.println("INVALID EMAIL. RESTARTING...");
                continue;
            }

            System.out.println("ENTER PASSWORD : ");
            System.out.println("---------------------------");
            String password = sc.nextLine();
            if (!Pattern.matches(PASSWORD_REGEX, password))
            {
                System.out.println("INVALID PASSWORD. RESTARTING...");
                continue;
            }
            System.out.println("ENTER PHONE NUMBER : ");
            System.out.println("-----------------------");
            String phoneNumber=sc.nextLine();
            if(!Pattern.matches(PHONE_NUMBER,phoneNumber))
            {
                System.out.println("INVALID PHONE NUMBER. RESTARTING...........");
                continue;
            }

            System.out.println(" REGISTRATION SUCCESSFUL!");
            break;
        }
        sc.close();
    }
}
