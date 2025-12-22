package userregistrationinexceptionconcept;

import java.util.Scanner;

public class UserRegistration
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        while (true)
        {
            try
            {

            System.out.println("USER REGISTRATION FORM");
            System.out.println("------------------------");
            System.out.println("ENTER YOUR FIRST NAME");
            System.out.println("-----------------------");
            String inputFirstName=scan.nextLine();
            UserRegistrationValidator.validateFirstName(inputFirstName);

            System.out.println("ENTER YOUR LAST NAME");
            System.out.println("-----------------------");
            String inputLastName=scan.nextLine();
            UserRegistrationValidator.validateLastName(inputLastName);

            System.out.println("ENTER YOUR EMAIL ID NAME");
            System.out.println("-------------------------");
            String inputemail=scan.nextLine();
            UserRegistrationValidator.validateEmail(inputemail);

            System.out.println("ENTER YOUR MOBILE NUMBER ID NAME");
            System.out.println("---------------------------------");
            String inputMobileNumber=scan.nextLine();
            UserRegistrationValidator.validateMobileNumber(inputMobileNumber);

            System.out.println("ENTER YOUR PASSWORD ID NAME");
            System.out.println("---------------------------------");
            String inputPassWord=scan.nextLine();
            UserRegistrationValidator.validatePassWord(inputPassWord);

            System.out.println("REGISTRATION COMPLETED SUCCESSFULLY......");
            System.out.println("------------------------------------------");
            break;
            }
            catch (UserRegistrationException e)
            {
                System.out.println("REGISTRATION FAILED....");
                System.out.println("-------------------------");
                System.out.println(e.type+ "  " +e.getMessage());
                System.out.println("RE-ENTER ALL THE DETAILS....");
            }
        }
    }
}


