package linkedlistprogramone;

public class MainClassLinkedList
{
    public static void main(String[] args)
    {
        LinkedList list=new LinkedList();
        list.add(70);
        list.add(30);
        list.add(56);
        list.printList();
        System.out.println("-------------------------------------------------------------");
        System.out.println("AFTER INSERT OPERATION");
        System.out.println("-----------------------");
        list.insertAfter(30,45);
        list.printList();
        System.out.println("-------------------------------------------------------------");
        System.out.println("AFTER DELETE OPERATION");
        System.out.println("-----------------------");
        list.pop();
        list.printList();
        System.out.println("AFTER DELETE LAST ELEMENT OPERATION");
        System.out.println("------------------------------------");
        list.popLast();
        list.printList();
        System.out.println("AFTER SEARCH  OPERATION");
        System.out.println("------------------------------------");
        System.out.println( list.searchElement(45));
        System.out.println( list.searchElement(70));
        System.out.println("-------------------------------------------------------------");
        System.out.println("AFTER INSERT OPERATION");
        System.out.println("-----------------------");
        list.add(70);
        list.add(30);
        list.add(56);
        list.printList();
        System.out.println("-------------------------------------------------------------");
        System.out.println("AFTER DELETE MIDDLE ELEMENT OPERATION");
        System.out.println("------------------------------------");
        list.deleteMiddleElements(70);
        list.printList();
        System.out.println("-------------------------------------------------------------");
        System.out.println("AFTER SORTED INSERTION OPERATION");
        System.out.println("------------------------------------");
        list.addSorted(40);
        list.addSorted(30);
        list.addSorted(20);
        list.addSorted(10);
        list.addSorted(50);
        list.printList();

    }
}
