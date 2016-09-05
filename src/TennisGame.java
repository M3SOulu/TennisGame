
public class TennisGame {

	
	private int player1Score=0;
	private int player2Score=0;
	
	
	public String scoreCalls(int score){
		
		if (score==0){
			String string = "love";
			return string;
		}
		else if (score==1){
			String string = "15";
			return string;
		}
		else if (score==2){
			String string = "30";
			return string;
		}
		else if (score==3){
			String string = "40";
			return string;
		}
		else if (score==4){
			String string = "game";
			return string;
		}
	}
	

	
	public void player1Scored(){
	
		player1Score++;	
		
	}
	
	public void player2Scored(){
	
		player2Score++;	
		
	}
	
	public String returnScore(){
		
		return scoreCalls(player1Score) + "-" + scoreCalls(player2Score);
	}
	
}
