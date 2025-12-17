package queue;

public class Queue
{
    private Node first;
    private Node last;
    private int length;

    public Queue(int value)
    {
        Node newNode=new Node(value);
        first=newNode;
        last=newNode;
        length=1;
    }


    public int getLength()
    {
        return length;
    }

    public void getFirst()
    {
        System.out.println("FIRST ELEMENT : "+first.value);
    }

    public void getLast()
    {
        System.out.println("LAST ELEMENT : "+last.value);
    }

    //ADD ELEMENT METHOD
    public void enQueue(int value)
    {
        Node newNode=new Node(value);
        if(length==0)
        {
            first=newNode;
            last=newNode;
        }
        else
        {
            last.next=newNode;
            last=newNode;
        }
        length++;
    }

    //REMOVE ELEMENT METHOD
    public Node deQueue()
    {
        if(length==0)
        {
            return null;
        }
        Node temp=first;
        if(length==1)
        {
            first=null;
            last=null;
        }
        else
        {
            first=first.next;
            temp.next=null;
        }
        length--;
        return temp;
    }

    public void printQueue()
    {
        Node temp=first;
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
