package queue;

public class QueueMain
{
    public static void main(String[] args)
    {
        Queue q=new Queue();
        System.out.println("QUEUE IS E,PTY -> "+q.isEmpty());
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        q.printQueue();
        System.out.println("QUEUE IS E,PTY -> "+q.isEmpty());
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("SIZE OF THE QUEUE -> "+q.size());
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("AFTER DEQUEUE OPERATION");
        q.deQueue();
        q.printQueue();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("SIZE OF THE QUEUE -> "+q.size());
        q.add();

    }
}
