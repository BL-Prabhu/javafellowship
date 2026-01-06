package optionalclass;

import java.util.Optional;

class User
{
    private String email;

    public User(String email)
    {
        this.email = email;
    }

    public Optional<String> getEmail()
    {
        return Optional.ofNullable(email);
    }
}

public class RealTimeOptionalExample
{
    public static void main(String[] args)
    {

        User user = new User(null);

        String email = user.getEmail()
                .filter(e -> e.contains("@"))
                .map(String::toLowerCase)
                .orElse("noemail@company.com");

        System.out.println(email);
    }
}

