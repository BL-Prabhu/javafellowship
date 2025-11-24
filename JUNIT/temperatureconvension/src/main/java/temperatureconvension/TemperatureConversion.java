package temperatureconvension;

import java.util.Scanner;

public class TemperatureConversion
{

    public static void convertTemperature(String input)
    {
        double number= Double.parseDouble(input.substring(0,input.length()-1));
        char word=input.charAt(input.length()-1);

        if(word == 'C')
        {
            System.out.println("TEMPERATURE CONVERT TO FAHRENHEIT");
            double temperatureInCelsius = number * 9 / 5 + 32;
            System.out.println("TEMPERATURE IS : "+temperatureInCelsius+" F");
        }
        else if(word == 'F')
        {
            System.out.println("TEMPERATURE CONVERT TO CELSIUS");
            double temperatureInFahremheit = (number - 32) * 5 / 9;
            System.out.println("TEMPERATURE IS : "+temperatureInFahremheit+" C");
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }

    public static void getTemperature()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE TEMPERATURE");
        String input=scan.next().toUpperCase();

        TemperatureConversion.convertTemperature(input);
    }

    public static void main(String[] args)
    {
        TemperatureConversion.getTemperature();
    }
}
