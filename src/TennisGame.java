import java.util.HashMap;
import java.util.Map;

public class TennisGame {
	
	Map<Integer, Integer> scores = new HashMap<Integer, Integer>();
	private Integer player1Score;
	private Integer player2Score;
	
	
	public void initScoreMap(){
		scores.put(1, 15);
		scores.put(2, 30);
		scores.put(3, 40);
	}
	
	public String getScore(Integer player1Score, Integer player2Score){
		if(player1Score>3 || player2Score >3){
			return "invalid score.";
		}
		
		this.player1Score=player1Score;
		this.player2Score=player2Score;
		
		//if(player1ScorescoreDifference(player1Score, player2Score)>1)
		
		return scores.get(player1Score) + "-" + scores.get(player2Score);
	}
	
	private Integer scoreDifference(Integer score1, Integer score2){
		Integer difference = score1 - score2;
		if(difference < 0){
			difference = difference * -1;
		}
		
		return difference;
	}

}
