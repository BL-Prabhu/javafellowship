package linkedlistprogramtwo;

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

    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;

    }

    public void printList()
    {
        Node current=head;
        while(current != null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }

}
