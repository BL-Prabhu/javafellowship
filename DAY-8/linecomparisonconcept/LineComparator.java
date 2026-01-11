package linecomparisonconcept;

public class LineComparator
{
    public boolean areEqual(Shape s1, Shape s2)
    {
        return Double.compare(s1.length(), s2.length()) == 0;
    }
}
