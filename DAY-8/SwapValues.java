public class SwapValues
{
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=300;
        a=a+b;
        b=a-b;
        c=a-b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
}
