import java.util.Arrays;

public class FindMaxAndMinInArray
{
    public static void main(String[] args)
    {
        int[] input ={60,10,50,20,30,40};
        int temp;
        for(int i=0;i<input.length;i++)
        {
            for(int j=i+1;j<input.length;j++)
            {
                if(input[i]>input[j])
                {
                    temp=input[i];
                    input[i]=input[j];
                    input[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(input));
        System.out.println("FIRST SMALLEST NUMBER : "+input[0]);
        System.out.println("FIRST LARGEST NUMBER : "+input[input.length-1]);
        System.out.println("SECOND SMALLEST NUMBER : "+input[1]);
        System.out.println("SECOND LARGEST NUMBER : "+input[input.length-2]);
    }
}
