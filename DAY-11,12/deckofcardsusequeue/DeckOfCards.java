package deckofcardsusequeue;
import java.util.Random;

public class DeckOfCards
{

    static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"};

    static String[] deck = new String[52];

    static int getRankValue(String card)
    {
        String rank = card.split(" ")[0];

        for (int i = 0; i < ranks.length; i++)
        {
            if (ranks[i].equals(rank)) return i;
        }
        return -1;
    }

    static class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            next = null;
        }
    }

    static class CustomQueue
    {
        Node front, rear;

       public void enqueue(String card)
        {
            Node temp = new Node(card);
            if (rear == null)
            {
                front = rear = temp;
            }
            else
            {
                rear.next = temp;
                rear = temp;
            }
        }

       public String dequeue()
        {
            if (front == null) return null;
            String data = front.data;
            front = front.next;
            if (front == null) rear = null;
            return data;
        }

       public boolean isEmpty()
        {
            return front == null;
        }

        void printQueue()
        {
            Node temp = front;
            while (temp != null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }


    static class Player
    {
        String name;
        String[] cards = new String[9];
        CustomQueue sortedQueue = new CustomQueue();

        Player(String name)
        {
            this.name = name;
        }


       public void sortCards()
        {
            for (int i = 0; i < cards.length - 1; i++)
            {
                for (int j = i + 1; j < cards.length; j++)
                {
                    if (getRankValue(cards[i]) > getRankValue(cards[j]))
                    {
                        String temp = cards[i];
                        cards[i] = cards[j];
                        cards[j] = temp;
                    }
                }
            }
        }


       public void addToQueue()
        {
            for (int i = 0; i < cards.length; i++)
            {
                sortedQueue.enqueue(cards[i]);
            }
        }
    }


    public static void main(String[] args)
    {

        int index = 0;
        for (String suit : suits)
        {
            for (String rank : ranks)
            {
                deck[index++] = rank + " of " + suit;
            }
        }

        shuffleDeck();

        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");
        Player p3 = new Player("Player 3");
        Player p4 = new Player("Player 4");

        Player[] allPlayers = {p1, p2, p3, p4};

        int cardIndex = 0;
        for (Player p : allPlayers)
        {
            for (int i = 0; i < 9; i++)
            {
                p.cards[i] = deck[cardIndex++];
            }
        }

        for (Player p : allPlayers)
        {
            p.sortCards();
            p.addToQueue();
        }


        CustomQueue playerQueue = new CustomQueue();
        playerQueue.enqueue("Player 1");
        playerQueue.enqueue("Player 2");
        playerQueue.enqueue("Player 3");
        playerQueue.enqueue("Player 4");


        System.out.println(" Final Player Cards");

        for (Player p : allPlayers)
        {
            System.out.println("\n" + p.name + " cards:");
            p.sortedQueue.printQueue();
        }
    }

    public static void shuffleDeck()
    {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++)
        {
            int randomIndex = rand.nextInt(52);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }
}
