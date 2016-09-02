import java.util.Random;

public class TennisGame {
	
	int score1 = 0;
	int score2 = 0;
	String[] scoreArray = {"love", "15", "30", "40"};
	Random rand = new Random();
	
	public static void main(String[] args){
		TennisGame firstTry = new TennisGame();
		
		for(int i = 1; i < 20 ; i++)
		{
			firstTry.scorePoints();
			System.out.println(firstTry.getScores());	
		}
		
	}

	public String getScores() {
		if(score1 >= 3 && score2 >= 3) {
			if(score1 - score2  >= 2){
				return "player 1 won";
			}else if(score1 == score2) {
				return "score is deuce";
			}else if(score2 - score1 >= 2){
				return "player 2 won";
			}else {
				return "advantage " + getLeadPlayer();
			}
		}else if(score1 >=3 && score2 < 2){
			System.exit(0);
			return "player 1 won";
		}else if(score2 >=3 && score1 < 2){
			
			return "player 2 won";
		}else {
			return scoreArray[score1] + ", " + scoreArray[score2];
		}
	
	}
	
	public String getLeadPlayer(){
		if (score1 > score2){
			return "player 1";
		}else{
			return "player 2";
		}
		
	}
	
	public void player1scores() {
		score1++;
		System.out.println("player 1 scored ");
	}
	
	public void player2scores(){
		score2++;
		System.out.println("player 2 scored ");
	}
	
	public void scorePoints(){
		int n = rand.nextInt(2) + 1;
		if (n == 1){
			player1scores();
		}else{
			player2scores();
		}
		
	}
	
}
