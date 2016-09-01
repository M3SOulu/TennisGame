
public class TennisGame {
	private int playerOneScore = 0;
	private int playerTwoScore = 0;
	private boolean gameOver = false;
	
	public String getScore() {
		return "Player1 "+ calcScore(1) + " - " + calcScore(2) + " Player2";
	}

	public void playerScored(int player) {
		if(!gameOver){
			if (player == 1) {
				playerOneScore++;
			} else {
				playerTwoScore++;
			}
			if(playerOneScore > 3 && playerOneScore - playerTwoScore > 1){
				System.out.println("Player 1 wins!");
				gameOver = true;
			}
			else if(playerTwoScore > 3 && playerTwoScore - playerOneScore > 1){
				System.out.println("Player 2 wins!");
				gameOver = true;
			}
			else{
				System.out.println(getScore());
			}
		} else{
			System.out.println("Game Ended");
		}
	}

	public String calcScore(int player) {
		// Regular scores
		if (playerOneScore < 4 && playerTwoScore < 4) {
			// Handle 40 - 40
			if (playerOneScore == 3 && playerTwoScore == 3) {
				return "Deuce";
			}
			int score = 0;
			if (player == 1) {
				score = playerOneScore * 15;
				if (playerOneScore == 3) {
					score = 40;
				}
			}
			if (player == 2) {
				score = playerTwoScore * 15;
				if (playerTwoScore == 3) {
					score = 40;
				}
			}		
			return "" + score;
		} 
		// Advantage cases
		else {
			if (playerOneScore == playerTwoScore) {
				return "Deuce";
			}
			String score = "";
			if (player == 1) {
				if (playerOneScore - playerTwoScore == 1) {
					score = "Advantage";
				}
			}
			if (player == 2) {
				if (playerTwoScore - playerOneScore == 1) {
					score = "Advantage";
				}
			}
			return score;
		}
	}
}
