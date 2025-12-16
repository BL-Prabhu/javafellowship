package LINECOMPARISONCONCEPT;

public class Line extends TwoDshape
{
    private  Point start;
    private Point end;

    public Line(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }

    @Override
    public double area()
    {
        return 0;
    }

    @Override
    public double length()
    {
        double dx=end.getX()-start.getX();
        double dy=end.getY()-start.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }
}
