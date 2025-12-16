package distance;

import java.util.Scanner;

public class Distance
{
    public static void calculateDistance()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE VALUES OF X2 AND Y2");
        System.out.println("------------------------------");
        System.out.println("ENTER THE VALUE X2");
        int x2=scan.nextInt();
        System.out.println("ENTER THE VALUE Y2");
        int y2=scan.nextInt();
        System.out.println("VALUES ARE : X2-> "+x2+" , Y2 -> "+y2);

        double distance=Math.sqrt(Math.pow(0,0)+Math.pow(x2,y2));

        System.out.println("DISTANCE IS : "+distance);
    }

    public static void main(String[] args)
    {
        Distance.calculateDistance();
    }
}
