package orderedlistconcept;

public class OrderedLinkedList
{

    private static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void add(int value)
    {
        Node newNode = new Node(value);

        if (head == null || value < head.data)
        {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data < value)
        {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public boolean remove(int value)
    {
        if (head == null)
        {
            return false;
        }
        if (head.data == value)
        {
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null)
        {
            if (current.next.data == value)
            {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public boolean contains(int value)
    {
        Node current = head;
        while (current != null)
        {
            if (current.data == value)
                return true;
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public void print()
    {
        Node current = head;
        while (current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
