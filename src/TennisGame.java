/**
 * class implementing tennis 
 * @author Mikele
 *
 */


public class TennisGame {
	
	private Player p1;
	private Player p2;
	private String state;

	
	public TennisGame(){
		
		p1= new Player("player1");
		p2= new Player("player2");
		state=TennisStatus.NULL;
		
	}

	public Player getPlayer1(){ return this.p1; }
	
	public Player getPlayer2(){ return this.p2; }
	
	public String getState(){ return this.state;}
	
	
	public String initGame(){
		
		return "Initial love - love";
		
		
		
	}
	
	public void playSet(Player goaler, Player loser){
		
		switch(goaler.getScore()){
		
		case TennisScore.LOVE:
			
			goaler.setScore(TennisScore.FIFTEEN);
		
		case TennisScore.FIFTEEN:
			
			goaler.setScore(TennisScore.THIRTY);	
			break;
			
		case TennisScore.THIRTY:
			
			goaler.setScore(TennisScore.FORTY);
			break;
		
		case TennisScore.FORTY:
			
			if(this.state==TennisStatus.DEUCE){
				
				goaler.setScore(TennisScore.ADVANTAGE);
				loser.setScore(TennisScore.FORTY);
				
			}else{
				
				this.state=TennisStatus.END;
			}
			
			break;
		
		case TennisScore.ADVANTAGE:
			
			this.state=TennisStatus.END;
		}
		
		checkDeuce();
		
	}
	
	public void checkDeuce(){
		
		if(this.p1.getScore()==this.p2.getScore()){
			
			this.state=TennisStatus.DEUCE;
			
		}
	}
	
	String printScore(){}

}
