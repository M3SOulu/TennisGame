
public class TennisGame {
	private Player player1;
	private Player player2;
	private int point;
	
	TennisGame() {
		player1 = new Player();
		player2 = new Player();
		point = 0;
	}
	
	String addScore(int p) {
		String whoScores = "";
		if(p == 1) {
			if(player1.getScore() <= 30){
				player1.setScore(15);
				player1.setPointWin();
				whoScores = "player1 scores > Scores: ";
			} else {
				player1.setScore(10);
				player1.setPointWin();
				whoScores = "player1 scores > Scores: ";
			}
		} else if(p == 2) {
			if(player2.getScore() <= 30){
				player2.setScore(15);
				player2.setPointWin();
				whoScores = "player2 scores > Scores: ";
			} else {
				player2.setScore(10);
				player2.setPointWin();
				whoScores = "player2 scores > Scores: ";
			}
		}
		
		return whoScores;
	}
	
	String convertScore(int score) {
		String convertedScore = "";
		
		if(score == 0) {
			convertedScore = "love";
		} else if(score > 40) {
			convertedScore = "adv";
		}
	}
}
