package linecomparisonconcept;

import java.awt.*;

public class LineComparisonConcept
{
    public static void main(String[] args)
    {

        Shape lineOne = new Line(new Point(1, 2), new Point(0, 4));

        Shape lineTwo = new Line(new Point(5, 6), new Point(7, 8));

        LineComparator comparator = new LineComparator();

        System.out.println("Length of Line One: " + lineOne.length());
        System.out.println("Length of Line Two: " + lineTwo.length());

        if (comparator.areEqual(lineOne, lineTwo))
        {
            System.out.println("Two lines are equal in length");
        } else {
            System.out.println("Two lines are NOT equal in length");
        }
    }
}
