
public interface Score {

	public String gameScore(Player player1, Player player2) throws InvalidPlayerAdvantage;

	public boolean isEndGame();

}
