package orderedlistconcept;

public class Main
{
    public static void main(String[] args)
    {
        OrderedLinkedList order=new OrderedLinkedList();
        order.add(50);
        order.add(40);
        order.add(30);
        order.add(20);
        order.add(10);
        order.print();
        System.out.println(order.contains(40));
        order.remove(40);
        order.print();
       System.out.println( order.contains(40));
    }
}
