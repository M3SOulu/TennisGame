import java.util.Random;

public class TennisGame {
	

	int score1 = 0;
	int score2 = 0;
	String[] scoreArray = {"love", "15", "30", "40"};
	
	public static void main(String[] args){
		TennisGame firstTry = new TennisGame();
		firstTry.player1scores();
		System.out.println(firstTry.getScores());
	}

	public String getScores() {
		if(score1 >= 3 && score2 >= 3) {
			if(score1 - score2  >= 2){
				return getLeadPlayer() + "won";
			}else if(score1 == score2) {
				return "score is deuce";
			}else {
				return "advantage " + getLeadPlayer();
			}
		}else {
			return scoreArray[score1] + ", " + scoreArray[score2];
		}
	}
	
	public String getLeadPlayer(){
		return (score1 > score2) ? "player1" : "player2";
	}
	
	public void player1scores() {
		score1 =+ 1;
		System.out.println("player 1 scored ");
	}
	
	public void player2scores(){
		score2 =+ 1;
		System.out.println("player 2 scored ");
	}
	
	
}
