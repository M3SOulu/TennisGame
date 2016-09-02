public class TennisGame {
	
	int Player1Score = 0;
	int Player2Score = 0;

	public String getscore(){
		
		int a = getplayer1score();
		int b = getplayer2score();
		
		if (a == 4 && b == 4){
			return "Deuce";
		}else if (a < 4 && b < 4){
			String e = (getpoint(a) + "-" + getpoint(b));
			return e;
		}else{
			if (a > b){
				return "Advantage - 40";
			}else if(b > a){
				return "40 - Advantage";
			}else{
				if(b+2 == a){
					return "Player 1 Wins";
				}else{
					return "Player 2 Wins";
				}
			}
		}
		
	}

	public void player1scored(){
		Player1Score++;
	}

	public void player2scored(){
		Player2Score++;
	}
	
	public int getplayer1score(){
		return Player1Score;
	}
	
	public int getplayer2score(){
		return Player2Score;
	}
	
	public String getpoint(int c){
		
		String d;
		
		switch(c){
		
		case 1:
			d = "Love";
		case 2:
			d = "Fifteen";
		case 3:
			d = "Thirty";
		case 4:
			d = "Forty";
		}
			
		return d;
		
	}

}
