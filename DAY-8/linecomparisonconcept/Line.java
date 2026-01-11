package linecomparisonconcept;

import java.awt.*;

public class Line implements Shape
{
    private Point start;
    private Point end;

    public Line(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }

    @Override
    public double length()
    {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
