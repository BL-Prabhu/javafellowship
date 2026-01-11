package gamblingsimulation;

import java.util.Random;

public class GamblingService
{
    public GamblingResult playGame(int money, int goal)
    {

        int numberOfGames = 0;
        int wins = 0;
        Random random = new Random();

        while (money > 0 && money < goal)
        {
            numberOfGames++;

            if (random.nextInt(2) == 1)
            {
                money++;
                wins++;
            } else {
                money--;
            }
        }

        return new GamblingResult(money, goal, numberOfGames, wins);
    }
}
