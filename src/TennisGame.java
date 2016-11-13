
public class TennisGame {

	// private publiche solo per test

	private PlayerTennis player1;
	private PlayerTennis player2;
	private ScoreTennisGame scoreT;

	TennisGame() {
		player1 = new PlayerTennis(1);
		player2 = new PlayerTennis(2);
		scoreT = new ScoreTennisGame();
	}

	public String assignPoint(int player) throws InvalidNumberPlayer, InvalidNumberPoint, InvalidPlayerAdvantage {
		if (!(player == 1 || player == 2))
			throw new InvalidNumberPlayer();

		PlayerTennis playerx;
		int score2;

		if (player == 1) {
			playerx = player1;
			score2 = player2.getScore();
		} else {
			playerx = player2;
			score2 = player1.getScore();
		}

		scoreT.manageAssignPoint(playerx, score2);
		String res = "Score: " + scoreT.gameScore(player1, player2);
		endGame();
		return res;
	}

	protected void endGame() {
		if (scoreT.isEndGame()) {
			player1.zeroScore();
			player2.zeroScore();
		}
	}

}
