package stack;

public class Stack
{
    private static class Node
    {
        int value;
        Node next;

        public Node(int value)
        {
            this.value=value;
        }
    }

    private  Node top;
    private int size;

    public void push(int value)
    {
        Node newNode=new Node(value);
        newNode.next=top;
        top=newNode;
        size++;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public int pop()
    {
        if(isEmpty())
        {
            throw new RuntimeException("STACK UNDERFLOW");
        }
        int value = top.value;
        top=top.next;
        size--;
        return value;
    }

    public int peek()
    {
        if(isEmpty())
        {
            throw new RuntimeException("STACK UNDERFLOW");
        }
        return top.value;
    }

    public int size()
    {
        return size;
    }

    public void printStack()
    {
        Node current=top;
        while(current != null)
        {
            System.out.println(current.value+" ");
            current=current.next;
        }
    }
}
