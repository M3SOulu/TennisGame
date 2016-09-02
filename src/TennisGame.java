
public class TennisGame {
	
	/*
	 * Mapping of variable values to score values:
	 * 0 -> love
	 * 1 -> fifteen
	 * 2 -> thirty
	 * 3 -> forty
	 * 4 -> advantage
	 */
	int[] scorePlayer;
	String score;
	
	public TennisGame() {
		scorePlayer = new int[2];
		scorePlayer[0] = 0;
		scorePlayer[1] = 0;
		score = "";
	}
	
	/*
	 * input player number in natural language
	 */
	public void playerScored(int playerNumber) {
		scorePlayer[playerNumber-1]++;
		calculateScore();
	}
	
	public String getScore() {
		return score;
	}
	
	private String getPlayerScoreStr(int playerScore) {
		switch (playerScore) {
			case 0:	return "love";
			case 1:	return "fifteen";
			case 2:	return "thirty";
			case 3:	return "forty";
			case 4:	return "advantage";
			default: return "error";
		}
	}
	
	private void calculateScore() {
		if (scorePlayer[0] >= 3 || scorePlayer[1] >= 3)
		{
			// check for win
			for (int i=0; i<2; i++) {
				if (scorePlayer[i] > 3 && scorePlayer[i] > (scorePlayer[(i+1)%2] + 1))
				{
					score = "Player " + (i + 1) + " wins.";
					return;
				}
			}
			
			// check for deuce
			if (scorePlayer[0] == scorePlayer[1]) {
				score = "deuce";
				scorePlayer[0] = 3;
				scorePlayer[1] = 3;
				return;
			}
		}
		
		score = "[player 1] " + getPlayerScoreStr(scorePlayer[0]) + " - " + getPlayerScoreStr(scorePlayer[1]) + " [player 2]";
	}

}
