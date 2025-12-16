package stopwatch;

import java.util.Scanner;

public class StopWatch
{
    public static void printElapsedTime()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("PRESS THE ENTER BUTTON TO START STOPWATCH");
        scan.nextLine();
        long startTime= System.currentTimeMillis();
        System.out.println(startTime/1000.0+"s");

        System.out.println("PRESS THE ENTER BUTTON TO STOP STOPWATCH");
        scan.nextLine();
        long endTime= System.currentTimeMillis();
        System.out.println(endTime/1000.0+"s");

        long elapsedTime=endTime-startTime;


        System.out.println("ELAPSED TIME IN SECONDS : "+elapsedTime/1000.0+"s");
    }

    public static void main(String[] args)
    {
        StopWatch.printElapsedTime();
    }
}
