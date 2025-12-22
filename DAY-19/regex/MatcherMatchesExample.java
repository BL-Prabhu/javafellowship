package regex;

import java.util.regex.*;

public class MatcherMatchesExample {
    public static void main(String[] args) {

        String input = "java";

        Pattern pattern = Pattern.compile("java");
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Matcher.matches(): FULL string matched");
        } else {
            System.out.println("Matcher.matches(): FULL string NOT matched");
        }
    }
}
