
public class ScoreTennisGame implements Score {

	private int playerAdvantage;// 0 nessuno in vantaggio - 1 player1 in
								// vantaggio -
	// 2 player2 in vantaggio - 3 parità - 4 player 1 win -
	// 5 player 2 win

	ScoreTennisGame() {
		playerAdvantage = 0;
	}

	public String gameScore(Player player1, Player player2) throws InvalidPlayerAdvantage {
		String play = "";

		switch (playerAdvantage) {
		case 0:
			play = scoreString(player1) + " - " + scoreString(player2);
			break;
		case 1:
			play = "advantage - 40";
			break;
		case 2:
			play = "40 - advantage";
			break;
		case 3:
			play = "deuce";
			break;
		case 4:
			play = "player 1 wins";
			break;
		case 5:
			play = "player 2 wins";
			break;
		default:
			throw new InvalidPlayerAdvantage();

		}
		return play;
	}
	
	public void manageAssignPoint(PlayerTennis player, int score2) throws InvalidNumberPoint{
		if (isEqualScoreDeuce(player.getScore(), score2))
			addEqualScore(player.getIdPlayer());
		else
			addNormalScore(player, score2);
	}
	

	private void addEqualScore(int player) {
		if (playerAdvantage == player) {
			playerAdvantage = player + 3;
		} else {
			if (playerAdvantage == 3) {
				playerAdvantage = player;
			} else {
				playerAdvantage = 3;
			}

		}
	}

	private void addNormalScore(PlayerTennis player, int score2) throws InvalidNumberPoint {

		if (player.getScore() == 40) {
			playerAdvantage = player.getIdPlayer() + 3;
		} else {
			player.addPoint();
			if (isEqualScoreDeuce(player.getScore(), score2))
				playerAdvantage = 3;
		}

	}

	private String scoreString(Player p) {
		if (p.getScore() == 0)
			return "love";
		return p.getScore() + "";
	}

	public boolean isEndGame() {
		if (playerAdvantage == 4 || playerAdvantage == 5) {
			playerAdvantage = 0;
			return true;
		}
		return false;
	}

	private boolean isEqualScoreDeuce(int p1, int p2) {
		if (p1 == 40 && p2 == 40)
			return true;
		return false;
	}

}
