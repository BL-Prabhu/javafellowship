package stack;

public class Main
{
    public static void main(String[] args)
    {
        Stack stack=new Stack(1);
        stack.printStack();
        System.out.println("HEIGHT OF THE STACK : "+stack.getHeigth());
        stack.getTop();
        System.out.println("AFTER PUSH OPERATION ");
        System.out.println("-----------------------");
        stack.push(2);
        stack.push(3);
        stack.printStack();
        System.out.println("HEIGHT OF THE STACK : "+stack.getHeigth());
        stack.getTop();
        System.out.println("AFTER POP OPERATION ");
        System.out.println("-----------------------");
        System.out.println("POP OF THE ELEMENT : "+ stack.pop().value);
        stack.printStack();
        System.out.println("HEIGHT OF THE STACK : "+stack.getHeigth());
        stack.getTop();

    }
}
