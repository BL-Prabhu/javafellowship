package singlylinkedlist;

public class Main
{
    public static void main(String[] args)
    {
        SinglyLinkedList sll=new SinglyLinkedList(1);
        sll.getHead();
        sll.getTail();
        System.out.println("LENGTH OF THE LIST : "+sll.getLength());
        sll.printList();
        System.out.println("AFTER APPEND METHOD");
        System.out.println("--------------------");
        sll.append(2);
        sll.append(3);
        sll.getHead();
        sll.getTail();
        System.out.println("LENGTH OF THE LIST : "+sll.getLength());
        sll.printList();
        System.out.println("AFTER INSERT METHOD");
        System.out.println("--------------------");
        sll.insert(1,7);
        sll.getHead();
        sll.getTail();
        System.out.println("LENGTH OF THE LIST : "+sll.getLength());
        sll.printList();
        System.out.println("AFTER REVERSE METHOD");
        System.out.println("--------------------");
        sll.reverse();
        sll.printList();
        sll.getHead();
        sll.getTail();
        System.out.println("LENGTH OF THE LIST : "+sll.getLength());
        System.out.println("AFTER REMOVE METHOD");
        System.out.println("--------------------");
        sll.remove(1);
        sll.getHead();
        sll.getTail();
        System.out.println("LENGTH OF THE LIST : "+sll.getLength());
        sll.printList();
        System.out.println("AFTER REMOVE LAST METHOD");
        System.out.println("--------------------");
        System.out.println("REMOVE LAST ELEMENT : "+sll.removeLast().value);
        sll.getHead();
        sll.getTail();
        System.out.println("LENGTH OF THE LIST : "+sll.getLength());
        sll.printList();
        System.out.println("AFTER PREPEND METHOD");
        System.out.println("--------------------");
        sll.prepend(3);
        sll.getHead();
        sll.getTail();
        System.out.println("LENGTH OF THE LIST : "+sll.getLength());
        sll.printList();
        System.out.println("AFTER REMOVE FIRST METHOD");
        System.out.println("--------------------");
        System.out.println("REMOVED FIRST ELEMENT : "+sll.removeFirst().value);
        sll.getHead();
        sll.getTail();
        System.out.println("LENGTH OF THE LIST : "+sll.getLength());
        sll.printList();
        System.out.println("AFTER GET METHOD");
        System.out.println("--------------------");
       System.out.println( sll.get(1).value);

        System.out.println("AFTER SET METHOD");
        System.out.println("--------------------");
        System.out.println("SET ELEMENT : "+sll.set(0,5));
        sll.getHead();
        sll.getTail();
        System.out.println("LENGTH OF THE LIST : "+sll.getLength());
        sll.printList();

    }
}
