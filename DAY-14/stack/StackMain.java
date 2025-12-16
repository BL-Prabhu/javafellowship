package stack;

public class StackMain
{
    public static void main(String[] args)
    {
        Stack stack=new Stack();
        System.out.println(" STACK IS EMPTY : "+stack.isEmpty());
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.push(55);
        stack.push(66);
        stack.printStack();
        System.out.println(" PEEK OPERATION VALUE IS  : "+stack.peek());
        System.out.println(" STACK IS EMPTY : "+stack.isEmpty());
      System.out.println(" POP OPERATION VALUE IS : "+  stack.pop());
        stack.printStack();
        System.out.println(" PEEK OPERATION VALUE IS  : "+stack.peek());

    }
}
