package bubblesort;

public class StudentMartBubbleSort
{
    public static void bubbleSort(int[] marks)
    {
        int n = marks.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - 1 - i; j++)
            {
                if (marks[j] > marks[j + 1])
                {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] marks = {78, 45, 89, 66, 92, 54};
        bubbleSort(marks);
        for (int mark : marks)
        {
            System.out.print(mark + " ");
        }
    }
}
