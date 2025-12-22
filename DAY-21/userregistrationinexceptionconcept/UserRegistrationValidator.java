package userregistrationinexceptionconcept;

import java.util.regex.Pattern;

public class UserRegistrationValidator
{
    private static final Pattern FIRST_NAME = Pattern.compile("^[A-Z][a-z]{2,}$");
    private static final Pattern LAST_NAME  = Pattern.compile("^[A-Z][a-z]{2,}$");
    private static final Pattern EMAIL = Pattern.compile("^[a-z]+@[a-z]+\\.com$");
    private static final Pattern MOBILE = Pattern.compile("^[0-9]{10}$");
    private static final Pattern PASSWORD = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%&]*[@#$%&][^@#$%&]*$).{8,}$");

    public static void validateFirstName(String firstName) throws UserRegistrationException
    {
        if(!FIRST_NAME.matcher(firstName).matches())
        {
            throw new UserRegistrationException(ExceptionType.INVALID_FIRST_NAME,
                     " FIRST NAME must start with Capital and have minimum 3 characters ");
        }
    }

    public static void validateLastName(String lastName) throws UserRegistrationException
    {
        if(!LAST_NAME.matcher(lastName).matches())
        {
            throw  new UserRegistrationException(ExceptionType.INVALID_LAST_NAME,
                    " LAST NAME must start with Capital and have minimum 3 characters ");
        }
    }

    public static void validateEmail(String email) throws UserRegistrationException
    {
        if(!EMAIL.matcher(email).matches())
        {
            throw new UserRegistrationException(ExceptionType.INVALID_EMAIL,
                                                 " INVALID EMAIL FORMAT ");
        }
    }

    public static void validateMobileNumber(String mobile) throws UserRegistrationException
    {
        if(!MOBILE.matcher(mobile).matches())
        {
            throw new UserRegistrationException(ExceptionType.INVALID_MOBILE,
                                                   " INVALID MOBILE NUMBER ");
        }

    }

    public static void validatePassWord(String passWord) throws UserRegistrationException
    {
        if(!PASSWORD.matcher(passWord).matches())
        {
            throw new UserRegistrationException(ExceptionType.INVALID_PASSWORD,
                    "PASSWORD MUST BE ONE CAPITAL,SMALL, DIGIT, SPECIAL SYMBOLS ");
        }
    }
}
