
public class TennisGame {
	private int player1Score = 0;
	private int player2Score = 0;
		
	public void playerScored(int i) {
		if(i == 1) {
			player1Score = player1Score + 1;
		} else {
			player2Score = player2Score + 1;
		}
		System.out.println("Player " + i + "scored. " + returnScore());
		
	}
	private String returnScore() {
		if(player1Score >= 4 && player2Score >= 4) {
			if(((player1Score - player2Score)) == 2) {
				return "Player 1 won";
			} else if(((player2Score - player1Score)) == 2) {
				return "Player 2 won";
			} else if(player1Score > player2Score) {
				return "Player 1 Advantage";
			} else if(player2Score > player1Score) {
				return "Player 2 Advantage";
			} else {
			return "Deuce";
			}
		}
		
		String term = "Player 1 ";
		term = term + convertNumber(player1Score);
		term = term + " - ";
		term = term + convertNumber(player2Score);
		term = term + " Player 2";
		return term;
	}
		
	private String convertNumber(int i) {
		String temp = "";
		if(i == 0) {
			return "Love";
		} else if(i == 1) {
			return "15";
		} else if(i == 2) {
			return "30";
		} else if(i == 3) {
			return "40";
		} 
		
		return temp;
	}
}
