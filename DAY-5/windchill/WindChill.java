package windchill;

import java.util.Scanner;

public class WindChill
{
    public static void calculateWindChill()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE TEMPERATURE");
        double temp=scan.nextDouble();
        System.out.println("ENTER THE WIND SPEED");
        double windSpeed=scan.nextDouble();

        if(Math.abs(temp)>50 || windSpeed<3 || windSpeed>120 )
        {
            System.out.println("TEMPERATURE MUST BE BELOW 50 AND WINDS PEED MUST BE BETWEEN 3 TO 120");
        }
        else
        {
            double windChill=35.74+0.6215*temp+(0.4275*temp-35.75)*Math.pow(windSpeed,0.16);
            System.out.println("WINDCHILL : "+windChill);
        }


    }

    public static void main(String[] args)
    {
        WindChill.calculateWindChill();
    }
}
