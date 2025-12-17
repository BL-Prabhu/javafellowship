package stack;

public class Stack
{

    private Node top;
    private int height;

    public Stack(int value)
    {
        Node newNode=new Node(value);
        top=newNode;
        height=1;
    }

    public int getHeigth()
    {
        return height;
    }

    public void getTop()
    {
        System.out.println("TOP : "+top.value);
    }

    //ADD ELEMENT METHOD
    public void push(int value)
    {
        Node newNode=new Node(value);
        if(height == 0)
        {
            top=newNode;
        }
        else
        {
            newNode.next=top;
            top=newNode;
        }
        height++;
    }

    // REMOVE ELEMENT METHOD
    public Node pop()
    {
        if(height==0)
        {
            return null;
        }
        else
        {
            Node temp=top;
            top=top.next;
            temp.next=null;
            height--;
            return temp;
        }
    }

    public void printStack()
    {
        Node temp=top;

        while(temp != null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    class Node
    {
        int value;
        Node next;

        Node(int value)
        {
            this.value=value;
        }
    }
}
