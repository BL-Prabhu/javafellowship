package binarysearch;

public class BinarySearchUseRecursive
{

    public static int binarySearchUseRecursive(int[] num,int target,int left,int right)
    {
        while(left<=right)
        {
            int middle=(left+right)/2;

            if(num[middle]==target)
            {
                return middle;
            }
            else if(num[middle]<target)
            {
                return binarySearchUseRecursive(num,target,middle+1,right);
            }
            else
            {
                return binarySearchUseRecursive(num,target,left,middle-1);
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] num={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int target=3;
        int result=binarySearchUseRecursive(num,target,0,num.length-1);

        System.out.println(target+" TARGET NUMBER FOUND INDEX AT "+result );
    }
}
