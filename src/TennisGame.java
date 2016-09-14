
public class TennisGame {

	private int pointsPlayer1;
	private int pointsPlayer2;
	
	private boolean hasGameEnded;
	
	public TennisGame() {
		pointsPlayer1 = 0;
		pointsPlayer2 = 0;
		hasGameEnded = false;
	}
	
	private String returnScoreForPlayer(int points) {
		switch(points) {
		case 0: return "love";
		case 1: return "15";
		case 2: return "30";
		case 3: return "40";
		default: return "40";
		}
	}
	
	public void playerScores(int player) {
		if(player == 1) {
			pointsPlayer1++;
		}
		else if (player == 2){
			pointsPlayer2++;
		}
	}
	
	private void checkHasGameEnded() {
		if(pointsPlayer1 > 3 && pointsPlayer1 - pointsPlayer2 > 1) {
			hasGameEnded = true;
		}
		else if(pointsPlayer2 > 3 && pointsPlayer2 - pointsPlayer1 > 1) {
			hasGameEnded = true;
		}
	}
}
