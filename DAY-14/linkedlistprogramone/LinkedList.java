package linkedlistprogramone;

public class LinkedList
{
    static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head;

    public void add(int data)
    {
        Node newNode=new Node(data);
        if(head == null)
        {
            head=newNode;
            return;
        }
        Node current=head;
        while (current.next != null)
        {
            current=current.next;
        }
        current.next=newNode;
    }

    public void insertAfter(int preData,int data)
    {
        Node current=head;

        while(current != null && current.data != preData)
        {
            current=current.next;
        }

        if(current == null)
        {
            System.out.println(preData+" NOT FOUND ");
            return;
        }

        Node newNode=new Node(data);
        newNode.next=current.next;
        current.next=newNode;
    }

    public void pop()
    {
        if(head == null)
        {
            System.out.println("EMPTY");
            return;
        }
        head=head.next;
    }

    public void popLast()
    {
        if(head == null)
        {
            System.out.println("EMPTY");
            return;
        }
        if(head.next == null)
        {
            head=null;
            return;
        }
        Node current=head;
        while(current.next.next != null)
        {
            current=current.next;
        }
        current.next=null;
    }

    public boolean searchElement(int value)
    {
        Node current=head;

        while(current != null)
        {
            if(current.data == value)
            {
                return true;
            }
            current=current.next;
        }
        return false;
    }

    public void deleteMiddleElements(int value)
    {
        if(head == null)
        {
            System.out.println("EMPTY");
            return;
        }

        if(head.data == value)
        {
            head=head.next;
            return;
        }

        Node current=head;

        while(current.next != null && current.next.data !=value)
        {
            current=current.next;
        }

        if(current.next == null)
        {
            System.out.println("VALUE NOT FOUND");
            return;
        }
        current.next=current.next.next;
    }

    public void addSorted(int data)
    {
        Node newNode = new Node(data);

        if (head == null || data < head.data)
        {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;

        while (current.next != null && current.next.data < data)
        {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }


    public void printList()
    {
        Node current=head;
        while (current != null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
}
