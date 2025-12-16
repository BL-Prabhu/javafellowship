package Operators;

import java.util.Scanner;

public class Findmaxandmin {

    public static void maxandmin() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int firstnumber = scan.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int secondnumber = scan.nextInt();
        System.out.println("ENTER THE THRID NUMBER");
        int thridnumber = scan.nextInt();

        int[] resultarray = new int[4];
        resultarray[0] = firstnumber + secondnumber * thridnumber;
        resultarray[1] = thridnumber + firstnumber / secondnumber;
        resultarray[2] = firstnumber % secondnumber + thridnumber;
        resultarray[3] = firstnumber * secondnumber + thridnumber;

        int MAX = resultarray[0];
        int MIN = resultarray[0];

        for (int i = 0; i < resultarray.length; i++) {
            System.out.println(resultarray[i]);
        }

        for (int i = 0; i < resultarray.length; i++) {
            if (MAX < resultarray[i]) {
                MAX = resultarray[i];
            } else if (MIN > resultarray[i]) {
                MIN = resultarray[i];
            }
        }

        System.out.println("MAX AND MIN");
        System.out.println("----------------");
        System.out.println("MAX NUMBER : " + MAX);
        System.out.println("MIN NUMBER : " + MIN);

    }

    public static void main(String[] args) {
        Findmaxandmin.maxandmin();
    }
}
