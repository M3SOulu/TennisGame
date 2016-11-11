
public class TennisGame {
	private Player player1;
	private Player player2;
	private int point;
	
	TennisGame() {
		player1 = new Player();
		player2 = new Player();
		point = 0;
	}
	
	String SystemScore(int p) {
		String score = "";
		
		if(player1.getScore() == 0 && player2.getScore() == 0) {
			score = "Initial love - love";
		} 
	}
	
	String addScore(int p) {
		if(p == 1) {
			if(player1.getScore() <= 30){
				player1.setScore(15);
				player1.setPointWin();	
			} else {
				player1.setScore(10);
				player1.setPointWin();
			}
		} else if(p == 2) {
			if(player2.getScore() <= 30){
				player2.setScore(15);
				player2.setPointWin();
			} else {
				player2.setScore(10);
				player2.setPointWin();
			}
		}
		
		return player1.getScore() + " - " + player2.getScore();
	}
	
}
