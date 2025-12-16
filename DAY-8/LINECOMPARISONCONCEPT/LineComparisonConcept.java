package LINECOMPARISONCONCEPT;

public class LineComparisonConcept
{
    public static void main(String[] args)
    {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(0, 4);
        Point p3 = new Point(5, 6);
        Point p4 = new Point(7, 8);
        Line lineOne = new Line(p1, p2);
        Line lineTwo = new Line(p3, p4);
        System.out.println("Length of Line One: " + lineOne.length());
        System.out.println("Length of Line Two: " + lineTwo.length());
        if (lineOne.length() == lineTwo.length())
        {
            System.out.println("Two lines are equal in length");
        }
        else
        {
            System.out.println("Two lines are NOT equal in length");
        }

    }
}
