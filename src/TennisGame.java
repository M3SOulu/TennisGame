import java.util.Map;
import java.util.HashMap;

public class TennisGame {
	private Map<Object, String> strings;
	private Score[] scores = new Score[4];  
	
	Player player1;
	Player player2;
	
	TennisGame() {
		strings = new HashMap<>();
		strings.put(Score.LOVE, "love");
		strings.put(Score.FIFTEEN, "15");
		strings.put(Score.THIRTY, "30");
		strings.put(Score.FORTY, "40");
		strings.put(Other.DEUCE, "deuce");
		strings.put(Other.ADVANTAGE, "advantage");
		strings.put(Other.WON, "won");
		
		scores[0] = Score.LOVE;
		scores[1] = Score.FIFTEEN;
		scores[2] = Score.THIRTY;
		scores[3] = Score.FORTY;
		
		player1 = new Player();
		player2 = new Player(); 
	}
	
	private boolean isDeuce() {
		if(player1.getScore() == player2.getScore() && player1.getScore() == 3) {
			if(!player1.hasAdvantage() && !player2.hasAdvantage()) {
				return true;
			}
		}
		return false;
	}
	
	public String getScore() {
		String firstPlayer;
		String secondPlayer;
		
		if(player1.hasAdvantage()) {
			firstPlayer = strings.get(Other.ADVANTAGE);
			if(player1.hasWon()) {
				firstPlayer = strings.get(Other.WON);
			}
		} else {
			firstPlayer = strings.get(scores[player1.getScore()]);
			if(isDeuce()) {
				firstPlayer = strings.get(Other.DEUCE);
				secondPlayer = strings.get(Other.DEUCE);
			}
		}
		
		if(player2.hasAdvantage()) {
			secondPlayer = strings.get(Other.ADVANTAGE);
			if(player2.hasWon()) {
				secondPlayer = strings.get(Other.WON);
			}
		} else {
			secondPlayer = strings.get(scores[player2.getScore()]);
			if(isDeuce()) {
				firstPlayer = strings.get(Other.DEUCE);
				secondPlayer = strings.get(Other.DEUCE);
			}
		}
		
		
		
		String score = firstPlayer + " - " + secondPlayer;		
		return score;
	}
	
	public void playerScores(int id) {
		switch(id) {
			case 1:
				player1.addPoint(player2);
				break;
			case 2:
				player2.addPoint(player1);
				break;
		}
			
	}
	
	public static void main(String args[]) {
		TennisGame tennis = new TennisGame();  
		System.out.println(tennis.getScore()); // love - love
		tennis.playerScores(1);
		System.out.println(tennis.getScore()); // 15 - love
		tennis.playerScores(1);
		System.out.println(tennis.getScore()); // 30 - love
		tennis.playerScores(2);
		System.out.println(tennis.getScore()); // 30 - 15
		tennis.playerScores(2);
		System.out.println(tennis.getScore()); // 30 - 30
		tennis.playerScores(2);
		System.out.println(tennis.getScore()); // 30 - 40
		tennis.playerScores(1);
		System.out.println(tennis.getScore()); // deuce - deuce
		tennis.playerScores(2);
		System.out.println(tennis.getScore()); // 40 - adv
		tennis.playerScores(1);
		System.out.println(tennis.getScore()); // deuce - deuce
		tennis.playerScores(1);
		System.out.println(tennis.getScore()); // adv - 40
		tennis.playerScores(1);
		System.out.println(tennis.getScore()); // won - 40
	}
}


