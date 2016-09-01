
public class TennisGame {

	private final String SCORE_ZERO = "love";
	private final String SCORE_ONE = "15";
	private final String SCORE_TWO = "30";
	private final String SCORE_THREE = "40";
	private final String SAME_SCORE = "deuce";
	private final String ADVANTAGE = "Advantage";
	private final String PLAYER_ONE_WINS = "Player1 Wins";
	private final String PLAYER_TWO_WINS = "Player2 Wins";

	int player1Score = 0;
	int player2Score = 0;

	public String getCurrentScore() {
		String result = null;
		if (player1Score == player2Score) {
			result = SAME_SCORE;
		} else if (player1Score - player2Score >= 2 && player1Score > 3) {
			result = PLAYER_ONE_WINS;
		} else if (player2Score - player1Score >= 2 && player2Score > 3) {
			result = PLAYER_TWO_WINS;
		} else if (player1Score >= 3 && player2Score >= 3 && player1Score - player2Score == 1) {
			result = ADVANTAGE + "-" + getScoreToDisplay(player2Score);
		} else if (player1Score >= 3 && player2Score >= 3 && player2Score - player1Score == 1) {
			result = getScoreToDisplay(player1Score) + "-" + ADVANTAGE;
		} else {
			result = getScoreToDisplay(player1Score) + "-" + getScoreToDisplay(player2Score);
		}
		return result;
	}

	public void player1Scored() {
		player1Score++;
	}

	public void player2Scored() {
		player2Score++;
	}

	public String getScoreToDisplay(int score) {
		String result = "";
		switch (score) {
		case 0:
			result = SCORE_ZERO;
			break;
		case 1:
			result = SCORE_ONE;
			break;
		case 2:
			result = SCORE_TWO;
			break;
		default:
			result = SCORE_THREE;
			break;
		}

		return result;
	}

	public static void main(String[] args) {
		TennisGame oneTennisGame = new TennisGame();
		oneTennisGame.player1Scored();
		oneTennisGame.player1Scored();
		oneTennisGame.player1Scored();
		oneTennisGame.player2Scored();
		oneTennisGame.player2Scored();
		oneTennisGame.player2Scored();
		oneTennisGame.player1Scored();
		oneTennisGame.player1Scored();
		System.out.println("Current Score is: " + oneTennisGame.getCurrentScore());
	}
}

/*
 * if (player1Score.equals(SCORE_ZERO)) { player1Score = SCORE_ONE; } else if
 * (player1Score.equals(SCORE_ONE)) { player1Score = SCORE_TWO; } else if
 * (player1Score.equals(SCORE_TWO)) { player1Score = SCORE_THREE; } else if
 * (player1Score.equals(SCORE_THREE)) {
 * 
 * }
 */