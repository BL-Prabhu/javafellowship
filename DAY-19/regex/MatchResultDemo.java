package regex;

import java.util.regex.*;

public class MatchResultDemo
{
    public static void main(String[] args)
    {
        String text = "Email: prabhu@gmail.com";
        Pattern pattern = Pattern.compile("(\\w+)@(\\w+\\.com)");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find())
        {
            MatchResult result = matcher.toMatchResult();

            System.out.println(" FULL MATCH : " + result.group());
            System.out.println(" GROUP ONE : " + result.group(1));
            System.out.println(" GROUP TWO : " + result.group(2));
            System.out.println(" START INDEX : " + result.start());
            System.out.println(" END INDEX : " + result.end());
            System.out.println(" GROUP COUNT : " + result.groupCount());
        }
    }

}
