package gamblingsimulation;

public class GamblingResult
{
    int finalMoney;
    int goalMoney;
    int gamesPlayed;
    int wins;

    public GamblingResult(int finalMoney, int goalMoney, int gamesPlayed, int wins)
    {
        this.finalMoney = finalMoney;
        this.goalMoney = goalMoney;
        this.gamesPlayed = gamesPlayed;
        this.wins = wins;
    }
}
