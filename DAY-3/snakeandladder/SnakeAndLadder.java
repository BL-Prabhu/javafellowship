package snakeandladder;


import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder
{
    public static void playSnakeAndLadder()
    {
        Scanner scan=new Scanner(System.in);

        HashMap<Integer,Integer> snakes=new HashMap<Integer, Integer>();
        snakes.put(11,2);
        snakes.put(12,3);
        snakes.put(13,4);
        snakes.put(14,5);
        snakes.put(15,6);

        HashMap<Integer,Integer> ladders=new HashMap<Integer, Integer>();
        ladders.put(10,21);
        ladders.put(20,32);
        ladders.put(30,41);
        ladders.put(40,51);
        ladders.put(50,61);

        int position=1;
        Random random=new Random();
        System.out.println("WELCOME OT THE SNAKE AND LADDER GAME");
        System.out.println("PLEASE PRESS ENTER TO ROLL THE DICE");

        while(position<=100)
        {
            scan.nextLine();

            int dice = random.nextInt(6)+1;
            System.out.println("YOU DICE NUMBER IS : "+dice);

            if(position+dice <=100)
            {
                position=position+dice;
                System.out.println("YOUR POSITION IS : "+position);
            }
            if(snakes.containsKey(position))
            {
                System.out.println("SNAKE");
                position=snakes.get(position);
                System.out.println("YOUR POSITION IS : "+position);
            }
            if(ladders.containsKey(position))
            {
                System.out.println("LADDER");
                position=ladders.get(position);
                System.out.println("YOUR POSITION IS : "+position);
            }

            if(position == 100)
            {
                System.out.println("GAME FINISHED....");
                break;
            }
        }
        System.out.println("YOU FINISHED THE GAME");
    }
    public static void main(String[] args)
    {
        SnakeAndLadder.playSnakeAndLadder();
    }
}