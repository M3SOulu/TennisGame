
public class TennisGame {
	
	public static player player1= new player("player1");
	public static player player2= new player("player2");
	
	
	public static  String getScore(){
		if(player1.getplayerScore()==player2.getplayerScore()&&player1.getplayerScore()=="40") return "deuce";
		else	return player1.getplayerScore()+"-"+player2.getplayerScore(); 
	}

	
	
	
	
	


	public static void main(String[] args){
		
	player1.Scores();
	System.out.println(TennisGame.getScore());
	player1.Scores();
	System.out.println(TennisGame.getScore());
	player2.Scores();
	System.out.println(TennisGame.getScore());
	player1.Scores();
	System.out.println(TennisGame.getScore());
	player2.Scores();
	System.out.println(TennisGame.getScore());
	player2.Scores();
	System.out.println(TennisGame.getScore());
	player1.Scores();
	System.out.println(TennisGame.getScore());
	player2.Scores();
	System.out.println(TennisGame.getScore());
	player2.Scores();
	System.out.println(TennisGame.getScore());
	player2.Scores();
	
		
	
		
		
}
	
}
