package vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine
{
    private static final int[] NOTES = {1000, 500, 100, 50, 10, 5, 2, 1};

    public List<Integer> getChange(int amount)
    {
        List<Integer> change=new ArrayList<Integer>();

        for(int note : NOTES)
        {
            while(amount >= note)
            {
                amount=amount-note;
                change.add(note);
            }
        }
        return change;

    }

    public int getMinimumAmount(int amout)
    {
        return getChange(amout).size();
    }
}
