package queue;

public class Queue
{
    void add()
    {
        System.out.println("DEFAULT METHOD");
    }


    private static class Node
    {
        int value;
        Node next;

        public Node(int value)
        {
            this.value=value;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    public boolean isEmpty()
    {
        return front == null;
    }

    public int size()
    {
        return size;
    }

    public void enQueue(int value)
    {
        Node newNode=new Node(value);

        if(isEmpty())
        {
            front=newNode;
        }
        else
        {
            rear.next=newNode;
        }
        rear=newNode;
        size++;
    }

    public int deQueue()
    {
        if(isEmpty())
        {
            throw new RuntimeException("QUEUE UNDERFLOW...");
        }
        int value= front.value;
        front=front.next;
        if(front == null)
        {
            rear=null;
        }
        size--;
        return value;
    }

    public void printQueue()
    {
        Node current=front;

        while(current != null)
        {
            System.out.println(current.value+" ");
            current=current.next;
        }
    }
}
