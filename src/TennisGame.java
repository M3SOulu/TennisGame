
public class TennisGame {
	private Player player1;
	private Player player2;
	
	TennisGame() {
		this.player1 = new Player();
		this.player2 = new Player();
	}
	
	public String systemScore() throws InvalidScoreException {
		String result = null;
		
		if(player1.getScore() == 3 && (player1.getScore() - player2.getScore()) == 2) {
			result = "Score: player1 wins";
		} else if(player2.getScore() == 3 && (player2.getScore() - player1.getScore()) == 2) {
			result = "Score: player2 wins";
		} else if(player1.getScore() == 3 && player2.getScore() == 3 && player1.getScore() == player2.getScore()) {
			result = "Score: deuce";
		} else {
			result = "Score: " + convertScores(player1.getScore()) + " - " + convertScores(player2.getScore());
		}
		
		return result;
	}
	
	public String convertScores(int score) throws InvalidScoreException {
		String result = null;
		
		if(score == 0) {
			result = "love";
		} else if(score == 1) {
			result = "15";
		} else if(score == 2) {
			result = "30";
		} else if(score == 3) {
			result = "40";
		} else if(score > 3){
			result = "advantage";
		} else {
			throw new InvalidScoreException();
		}
		
		return result;
	}
	
}
