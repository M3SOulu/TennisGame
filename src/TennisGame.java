
public class TennisGame {

	private final String SCORE_ZERO = "love";
	private final String SCORE_ONE = "15";
	private final String SCORE_TWO = "30";
	private final String SCORE_THREE = "40";
	private final String SAME_SCORE = "deuce";
	private final String ADVANTAGE = "Advantage";

	String player1Score = SCORE_ZERO;
	String player2Score = SCORE_ZERO;

	public String getScore() {
		String result = null;
		if (player1Score.equals(player2Score)) {

		} else {
			result = player1Score + "-" + player2Score;
		}
		return result;
	}

	public void player1Scored() {
		if (player1Score.equals(SCORE_ZERO)) {
			player1Score = SCORE_ONE;
		} else if (player1Score.equals(SCORE_ONE)) {
			player1Score = SCORE_TWO;
		} else if (player1Score.equals(SCORE_TWO)) {
			player1Score = SCORE_THREE;
		} else if (player1Score.equals(SCORE_THREE)) {

		}
	}

	public void player2Scored() {
		if (player2Score.equals(SCORE_ZERO)) {
			player2Score = SCORE_ONE;
		} else if (player2Score.equals(SCORE_ONE)) {
			player2Score = SCORE_TWO;
		} else if (player2Score.equals(SCORE_TWO)) {
			player2Score = SCORE_THREE;
		} else if (player2Score.equals(SCORE_THREE)) {

		}
	}

}
