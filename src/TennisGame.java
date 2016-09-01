
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
		System.out.println(getGameScore());
	}
	
	public String getGameScore() {
		int difference = Math.abs(player1Score - player2Score);
		int topScore = Math.max(player1Score, player2Score);
		
		if (topScore >= 4 && difference >= 2) {
			if (player1Score > player2Score) {
				return new String("Player 1 won");
			} else {
			    return new String("Player 2 won");
			}
		}
		return getStringForPlayerScore(1,player1Score) + " " + getStringForPlayerScore(2,player2Score);
	}
	
	public String getStringForPlayerScore(int player, int score) {
		String name = (player == 1) ? new String("Player 1") : new String("Player 2");
		String result = new String("");
		if (score > 0) {
			if (score == 1) {
				result = new String(" Love");
			} else if (score == 2) {
				result = new String(" 30");
			} else if (score == 3) {
				result = new String(" 40");
			} else {
				if (score >= Math.max(player1Score, player2Score)) {
					result = new String(" Advantage");
				} else {
					result = new String(" 40");
				}
			}
		} else {
			result = new String(" 0");
		}
		return name + result;
	}
	
	
	public static void playGame() {
		// Demonstrate simple game
		TennisGame game = new TennisGame();
		game.startGame();
		game.playerScored(2);
		game.playerScored(2);
		game.playerScored(2);
		game.playerScored(2);
	}
	
	public static void main(String[] args) {
		playGame();
	}
}
