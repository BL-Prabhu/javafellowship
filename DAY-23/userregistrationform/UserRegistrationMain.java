package userregistrationform;

import java.util.Scanner;

public class UserRegistrationMain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String firstName, lastName, email, mobile, password;

        while (true)
        {
            firstName=UserRegistration.getValidatedInput(sc, "FIST NAME",UserRegistration.firstNameValidation);
            if(firstName == null)
            {
                continue;
            }

            lastName=UserRegistration.getValidatedInput(sc,"LAST NAME", UserRegistration.lastNameValidation);
            if(lastName==null)
            {
                continue;
            }

            email=UserRegistration.getValidatedInput(sc,"EMAIL ID",UserRegistration.emailValidation);
            if(email==null)
            {
                continue;
            }

            mobile=UserRegistration.getValidatedInput(sc,"MOBILE NUMBER",UserRegistration.mobileValidation);
            if(mobile==null)
            {
                continue;
            }

            password=UserRegistration.getValidatedInput(sc,"PASSWORD",UserRegistration.passwordValidation);
            if(password==null)
            {
                continue;
            }

            System.out.println("REGISTRATION SUCCESSFUL");
            System.out.println("--------------------------");
            System.out.println("FIRST NAME : " + firstName);
            System.out.println("LAST NAME : " + lastName);
            System.out.println("EMAIL : " + email);
            System.out.println("MOBILE : " + mobile);
            System.out.println("PASSWORD : " + password);
            break;
        }
        sc.close();
    }
}
