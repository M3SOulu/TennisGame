
public class TennisGame {

	private int player1Score;
	private int player2Score;
	
	public void startGame() {
		player1Score = player2Score = 0;
	}
	
	public void playerScored(int player) {
		if (player == 1) {
			player1Score++;
		} else {
			player2Score++;
		}
		String gameScore = getGameScore();
	}
	
	public String getGameScore() {

		String gameScore = new String("");
		int delta = Math.abs(player1Score - player2Score);
		
		if (delta >= 2) {
			if (player1Score > player2Score) {
				return new String("Player 1 won");
			} else {
			    return new String("Player 2 won");
			}
		}
		return getStringForPlayerScore(1,player1Score) + " " + getStringForPlayerScore(2,player2Score);
	}
	
	public String getStringForPlayerScore(int player, int score) {
		String name = player == 1 ? new String("Player 1") : new String("Player 2");
		String result = new String("");
		if (score == 1) {
			result = new String("Love");
		} else if (score == 2) {
			result = new String("15");
		} else if (score == 3) {
			result = new String("30");
		} else if (score == 4) {
			result = new String("40");
		} else {
			result = new String("Advantage");
		}
	}
}
