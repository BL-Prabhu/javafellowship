package linecomparison;


import java.util.Scanner;
class Point
{
    private int x;
    private  int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}

class Line
{
    public Point start;
    public Point end;

    public Line(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }

    public double length()
    {
        double dx=end.getX()-start.getX();
        double dy=end.getY()-start.getY();
        return  Math.sqrt((dx*dx)+(dy*dy));
    }
}

public class LineComparisonConcept
{
    public static void main(String[] args)
    {
        Point p1=new Point(1,2);
        Point p2=new Point(0,4);
        Point p3=new Point(5,6);
        Point p4=new Point(7,8);

        Line lineone=new Line(p1,p2);
        Line linetwo=new Line(p3,p4);

        System.out.println(lineone.length());
        System.out.println(linetwo.length());

        if(lineone.length() == linetwo.length())
        {
            System.out.println("TWO LINES ARE EQUAL LENGTH");
        }
        else
        {
            System.out.println("TWO LINES ARE NOT EQUAL LENGTH");
        }
    }
}