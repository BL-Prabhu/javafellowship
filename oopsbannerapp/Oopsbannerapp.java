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


    public static void main(String[] args)
    {
        System.out.println("USE-CASE-1");
        System.out.println("----------------------------------------------------------------------------------------");
        Uc1();
        System.out.println("USE-CASE-2");
        System.out.println("----------------------------------------------------------------------------------------");
        Uc2();

    }
}
