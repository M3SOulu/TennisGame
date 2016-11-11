import java.util.ArrayList;

public class TennisGame {
	
	Player player1; 
	Player player2; 
	
	
	
	public TennisGame(String str1, String str2){
		player1 = new Player(str1);
		player2 = new Player(str2);
	}
	
	String getScore(){
		String stringa = "Score: ";
		if(player1.getScore() >=3 && player2.getScore()>=3){
			if( Math.abs( player1.getScore() - player2.getScore()) >= 2  ){
				stringa = stringa + getLeadPlayer().getName()+ " wins";
			}else{
				if(player1.getScore()==player2.getScore()){
					stringa = stringa +" deuce";
				}else{
					if(getLeadPlayer().equals(player1) )
						stringa = stringa + " advantage - 40";
					else 
						stringa = stringa + " 40 - advantage";
				}				
			}
			
		}else{
			stringa = stringa+player1.getScoreString()+" - "+player1.getScoreString();
		}
		return stringa;
	}
	
	Player getLeadPlayer(){
		return (player1.getScore()>player2.getScore()) ? player1 : player2;
	}

}

