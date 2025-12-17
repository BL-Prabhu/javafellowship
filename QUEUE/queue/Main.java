package queue;

public class Main
{
    public static void main(String[] args)
    {
        Queue q=new Queue(1);
        q.printQueue();
        q.getFirst();
        q.getLast();
        System.out.println("LENGTH OF THE QUEUE : "+q.getLength());
        System.out.println("AFTER ENQUEUE OPERATION");
        System.out.println("------------------------");
        q.enQueue(2);
        q.printQueue();
        q.getFirst();
        q.getLast();
        System.out.println("LENGTH OF THE QUEUE : "+q.getLength());
        System.out.println("AFTER DEQUEUE OPERATION");
        System.out.println("------------------------");
        System.out.println("DEQUEUE ELEMENT : "+q.deQueue().value);
        q.printQueue();
        q.getFirst();
        q.getLast();
        System.out.println("LENGTH OF THE QUEUE : "+q.getLength());

    }
}
