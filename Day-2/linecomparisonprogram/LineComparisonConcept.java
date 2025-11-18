package linecomparisonprogram;

import java.util.Scanner;
class PointOne
{
   private int x;
   private  int y;

    public PointOne(int x, int y)
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

class LineOne
{
    public PointOne start;
    public PointOne end;

    public LineOne(PointOne start, PointOne end)
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
        PointOne p1=new PointOne(1,2);
        PointOne p2=new PointOne(3,4);
        PointOne p3=new PointOne(5,6);
        PointOne p4=new PointOne(7,8);

        LineOne lineone=new LineOne(p1,p2);
        LineOne linetwo=new LineOne(p3,p4);

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
