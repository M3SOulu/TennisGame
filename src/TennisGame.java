
public class TennisGame {

	private int Player1Score = 0;
	private int Player2Score = 0;
	private String Player1Name;
	private String Player2Name;
	
	public TennisGame(String Player1Name, String Player2Name) {
		this.Player1Name = Player1Name;
		this.Player1Name = Player2Name;
	}		
	
public String getScore() {	
		
	if (Winner()) {
		return PlayerWithHighScore() + " wins";
	}

	if (Advantage()) {
		return "Advantage " + PlayerWithHighScore();
	}
	
	if (Deuce()) {
		return "Deuce";
		 }
	
	return Numbername(Player1Score) + " , " + Numbername(Player2Score);
	
	}

	private boolean Advantage() {
		
		
	if (Player2Score >= 4 && Player2Score == Player1Score + 1)
		return true;
	if (Player1Score >= 4 && Player1Score == Player2Score + 1)
		return true;
	return false;
	
}

	private boolean Winner() {
		
		// check winner
		if(Player2Score >= 4 && Player2Score >= Player1Score + 2 )
			return true;
		if(Player1Score >= 4 && Player1Score >= Player2Score + 2 )
			return true;
		
	return false;
}

	private boolean Deuce() {
		// Deuce
		
		return Player1Score >=3 && Player2Score == Player1Score;
	}

	private String Numbername(int score) {
	//change number name
		
		
		switch (score) {
		case 0:
			return "Love";
		case 1: 
			return "Fifteen";
		case 2:
			return "Thrity";
		case 3:
			return "Love!";
		}
		return null;
	}
	
	
	private String PlayerWithHighScore() {
		
		if (Player1Score > Player2Score) {
			return Player1Name;
		}
		else
		{
			return Player2Name;
		}
	}
	
	public void player1Scored() {
			Player1Score++;
			
		}
		
		
	public void player2Scored() {
			Player2Score++;
			
		}
		
		

}

