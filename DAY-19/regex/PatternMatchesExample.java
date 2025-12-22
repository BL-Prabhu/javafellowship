package regex;

import java.util.regex.*;

public class PatternMatchesExample {
    public static void main(String[] args) {

        String input = "java";

        if (Pattern.matches("java", input)) {
            System.out.println("Pattern.matches(): FULL string matched");
        } else {
            System.out.println("Pattern.matches(): FULL string NOT matched");
        }
    }
}
