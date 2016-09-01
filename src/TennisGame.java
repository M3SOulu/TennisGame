
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
				gameScore = new String("Player 1 won");
			} else {
				gameScore = new String("Player 2 won");
			}
		}
		return new String("foo not complete");
		
	}
}
