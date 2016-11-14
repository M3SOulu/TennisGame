
public class TennisGame {
	private Player player1;
	private Player player2;
	
	public TennisGame() {
		this.player1 = new Player();
		this.player2 = new Player();
	}
	
	public String assignScore(int player) throws InvalidScoreException, InvalidPlayerException {
		String result = null;
		
		if(player == 1 && !player1.getIsWinner()) {
			player1.addScore();
			result = "player1 scores > " + systemScore();
		} else if(player == 2 && !player2.getIsWinner()) {
			player2.addScore();
			result = "player2 scores > " + systemScore();
		} else {
			throw new InvalidPlayerException();
		}
		
		return result;
	}
	
	public String systemScore() throws InvalidScoreException {
		String result = null;
		
		if(player1.getScore() >= 3 && (player1.getScore() - player2.getScore()) >= 2) {
			player1.setIsWinner(true);
			result = "Score: player1 wins";
		} else if(player2.getScore() >= 3 && (player2.getScore() - player1.getScore()) >= 2) {
			player2.setIsWinner(true);
			result = "Score: player2 wins";
		} else if(player1.getScore() == 3 && player2.getScore() == 3 && player1.getScore() == player2.getScore()) {
			result = "Score: deuce";
		} else if(player1.getScore() == 0 && player2.getScore() == 0) {
			result = "Initial " + convertScores(player1.getScore()) + " - " + convertScores(player2.getScore());
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
