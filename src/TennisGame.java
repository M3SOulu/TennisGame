import java.util.HashMap;
import java.util.Map;

public class TennisGame {
	
	Map<Integer, Integer> scores = new HashMap<Integer, Integer>();
	private Integer player1Score;
	private Integer player2Score;
	
	public TennisGame(){
		scores.put(0, 0);
		scores.put(1, 15);
		scores.put(2, 30);
		scores.put(3, 40);
		
		player1Score = 0;
		player2Score = 0;
	}
	
	public String getScore(){
		Integer difference = scoreDifference(player1Score, player2Score);
		
				
		if(player1Score >= 3 || player2Score >= 3){
			if(player1Score == player2Score){
				return "DEUCE";			
			}
			if(player1Score > 3 || player2Score > 3){
			if(difference == 1){
				return "ADVANTAGE - " + getTranslatedScore(player2Score);
			}else if (difference == -1){
				return getTranslatedScore(player1Score) + "- ADVANTAGE";
			}
			
			if(difference == 2){
				return "Player 1 Wins!";
			}else if (difference == -2){
				return "Player 2 Wins!";
			}
			}
		}
		 		
		return getTranslatedScore(player1Score) + "-" + getTranslatedScore(player2Score);
	}
	
	public void player1Scored(){
		player1Score++;
	}
	
	public void player2Scored(){
		player2Score++;
	}
	
	
	private Integer scoreDifference(Integer score1, Integer score2){
		Integer difference = score1 - score2;
		return difference;
	}
	
	private Integer getTranslatedScore(Integer score){
		if(score >3){
			score = 3;
		}
		return scores.get(score);
	}

}
