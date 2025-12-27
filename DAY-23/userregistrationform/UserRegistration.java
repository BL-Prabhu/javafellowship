package userregistrationform;

import java.util.Scanner;

public class UserRegistration
{
    public static UserValidation firstNameValidation = (name)->
                        name.matches("^[A-Z][a-z]{2,}$");
    public static UserValidation lastNameValidation = (name)->
                        name.matches("^[A-Z][a-z]{2,}$");
    public static UserValidation emailValidation = (name)->
                         name.matches("^[a-zA-Z]+@[a-zA-Z]+\\.com$");
    public static UserValidation mobileValidation = (name)->
                         name.matches("^[0-9]{10}$");
    public static UserValidation passwordValidation =(name)->
                         name.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[A-Za-z0-9!@#$%^&*]{8,}$");

    public static String getValidatedInput(Scanner sc, String fieldName, UserValidation validation)
    {
        String input;

        while(true)
        {
            System.out.println("ENTER : "+fieldName+" : ");
            input=sc.nextLine();
            if(validation.validate(input))
            {
                break;
            }
            else
            {
                System.out.println("INVALID "+fieldName+" PLEASE TRY AGAIN");
                return null;
            }
        }
        return input;
    }
}
