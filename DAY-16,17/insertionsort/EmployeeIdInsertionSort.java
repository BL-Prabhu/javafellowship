package insertionsort;

public class EmployeeIdInsertionSort
{
    public static void insertionSort(int[] ids)
    {
        int n = ids.length;
        for (int i = 1; i < n; i++)
        {
            int key = ids[i];
            int j = i - 1;

            while (j >= 0 && ids[j] > key)
            {
                ids[j + 1] = ids[j];
                j--;
            }
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args)
    {
        int[] employeeIds = {104, 101, 109, 102, 106};
        insertionSort(employeeIds);

        for (int id : employeeIds)
        {
            System.out.print(id + " ");
        }
    }
}
