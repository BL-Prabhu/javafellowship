package oopsbannerapp;

import java.util.Map;

/**
 * OOPS Banner Application
 *
 * Prints the full form and banner of OOPS
 * using multiple use cases.
 *
 * @author Prabhu
 * @version 1.0
 */
public class Oopsbannerapp
{



    public static void Uc1()
    {
        System.out.println("\"OOPS\" Object Oriented Programming System\n");
    }

    public static void Uc2()
    {

        String[] O = {
                "  ******  ",
                " **    ** ",
                "**      **",
                "**      **",
                "**      **",
                "**      **",
                "**      **",
                " **    ** ",
                "  ******  "
        };

        String[] P =
                {
                "*********  ",
                "**     ** ",
                "**     ** ",
                "**     **",
                "********  ",
                "**         ",
                "**         ",
                "**         ",
                "**         "
        };

        String[] S =
                {
                        "   *****  ",
                        " **       ",
                        "**        ",
                        "  **      ",
                        "    ***   ",
                        "       ** ",
                        "        **",
                        "       **",
                        "  *****   "

        };

        for (int i = 0; i < O.length; i++)
        {
            System.out.println(
                            O[i] + "   " +
                            O[i] + "   " +
                            P[i] + "   " +
                            S[i]
            );
        }
    }

    private static void Uc3()
    {

        String[][] patterns =
                {
                getOPattern(),
                getOPattern(),
                getPPattern(),
                getSPattern()
        };

        printBanner(patterns);
    }

    private static void printBanner(String[][] patterns)
    {
        int rows = patterns[0].length;

        for (int i = 0; i < rows; i++)
        {
            String line = "";
            for (int j = 0; j < patterns.length; j++)
            {
                line = line + patterns[j][i] + "   ";
            }
            System.out.println(line);
        }
    }

    private static String[] getOPattern()
    {
        return new String[]
                {
                        "  ******  ",
                        " **    ** ",
                        "**      **",
                        "**      **",
                        "**      **",
                        "**      **",
                        "**      **",
                        " **    ** ",
                        "  ******  "
        };
    }

    private static String[] getPPattern()
    {
        return new String[]{
                "*********  ",
                "**     ** ",
                "**     ** ",
                "**     **",
                "********  ",
                "**         ",
                "**         ",
                "**         ",
                "**         "
        };
    }

    private static String[] getSPattern()
    {
        return new String[]
                {

                        "   *****  ",
                        " **       ",
                        "**        ",
                        "  **      ",
                        "    ***   ",
                        "       ** ",
                        "        **",
                        "       **",
                        "  *****   "
        };
    }

    private static void uc4() {

        BannerCharacter[] characters = {
                new BannerCharacter('O', getOPattern()),
                new BannerCharacter('O', getOPattern()),
                new BannerCharacter('P', getPPattern()),
                new BannerCharacter('S', getSPattern())
        };
        printBannerUC4(characters);
    }

    // Inner Class for Encapsulation
    static class BannerCharacter {
        private char character;
        private String[] pattern;

        public BannerCharacter(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    private static void printBannerUC4(BannerCharacter[] characters) {
        for (int row = 0; row < 9; row++) {
            StringBuilder line = new StringBuilder();
            for (BannerCharacter ch : characters) {
                line.append(ch.getPattern()[row]).append(" ");
            }
            System.out.println(line.toString());
        }
    }

    private static void uc5()
    {
        Map<Character, String[]> patternMap = buildPatternMap();
        String word = "OOPS";
        printBannerUC5(word, patternMap);
    }

    private static Map<Character, String[]> buildPatternMap()
    {
        Map<Character, String[]> map = new java.util.HashMap<>();
        map.put('O', getOPattern());
        map.put('P', getPPattern());
        map.put('S', getSPattern());
        return map;
    }

    private static void printBannerUC5(String word, Map<Character, String[]> map)
    {
        for (int row = 0; row < 9; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : word.toCharArray()) {
                line.append(map.get(ch)[row]).append(" ");
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args)
    {
        System.out.println("USE-CASE-1");
        System.out.println("----------------------------------------------------------------------------------------");
        Uc1();
        System.out.println("USE-CASE-2");
        System.out.println("----------------------------------------------------------------------------------------");
        Uc2();
        System.out.println("USE-CASE-3");
        System.out.println("----------------------------------------------------------------------------------------");
        Uc3();
        System.out.println("USE-CASE-4");
        System.out.println("----------------------------------------------------------------------------------------");
        uc4();
        System.out.println("USE-CASE-5");
        System.out.println("----------------------------------------------------------------------------------------");
        uc5();
    }
}
