package gamblingsimulation;

public class GamblingPrinter
{
    public void printResult(GamblingResult result)
    {

        System.out.println("MONEY = " + result.finalMoney);
        System.out.println("WIN MONEY = " + result.goalMoney);
        System.out.println("NUMBER OF GAMES PLAYED = " + result.gamesPlayed);
        System.out.println("NUMBER OF WINS = " + result.wins);

        String message = (result.finalMoney == result.goalMoney) ? "CONGRATS" : "BETTER LUCK NEXT TIME";

        System.out.println(message);
    }
}
