/**
 * class implementing a tennis match between 2 tennis player
 * @author Mikele
 *
 */
public class TennisGame {
	
	private Player p1;
	private Player p2;
	private String state;

	/**
	 * default costructor
	 */
	public TennisGame(){
		
		p1= new Player("player1");
		p2= new Player("player2");
		state=TennisStatus.READY;
		
	}
	
	//getters and setters
	
	public Player getPlayer1(){ return this.p1; }
	
	public Player getPlayer2(){ return this.p2; }
	
	public String getState(){ return this.state;}	
	
	public void setState(String state) {
		
		this.state = state;
	}
	
	/**
	 * initialize a game
	 * 
	 * @return initialization string
	 */
	public String initGame(){
		
		setState(TennisStatus.RUNNING);
	
		return "Initial love - love";
		
		
		
	}
	
	/**
	 * play a set
	 * score the player who score a point and update game status
	 * @param goaler: player who score
	 * @param loser: unliky player
	 */
	public void playSet(Player goaler, Player loser){
		
		switch(goaler.getScore()){
		
		case TennisScore.LOVE:
			
			goaler.setScore(TennisScore.FIFTEEN);
			break;
		
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
				
				this.state=TennisStatus.RUNNING;
				
			}else if(loser.getScore()==TennisScore.ADVANTAGE){
				
				loser.setScore(TennisScore.FORTY);
				
				
			}else{
				
				setState(TennisStatus.END);
				goaler.setScore(TennisScore.WINNER);
			}
			
			break;
		
		case TennisScore.ADVANTAGE:
			
			setState(TennisStatus.END);
			goaler.setScore(TennisScore.WINNER);
			
		default:
			break;
			
		}
		
		checkDeuce();
		
	}
	
	/**
	 * check if the match is in deuce
	 * 
	 * if it is, update game status 
	 */
	public void checkDeuce(){
		
		if(this.p1.getScore()==this.p2.getScore() && this.p1.getScore()==TennisScore.FORTY){
			
			setState(TennisStatus.DEUCE);
			
		}
	}
	
	/**
	 * print the score string of this game
	 * @return score string
	 */
	public String printScore(){
		
		String message="Score: ";
		
		switch(getState()){
		
			case TennisStatus.RUNNING:
			
				message+=p1.printScore()+" - "+p2.printScore();
				break;
			
			case TennisStatus.DEUCE:
			
				message="deuce";
				break;
			
			case TennisStatus.END:
				
				if(p1.getScore()==TennisScore.WINNER){
					
					message+=p1.printScore();
					
				}else{
					
					message+=p2.printScore();
				}
				break;
				
			default:
				break;
			
		}
		
		return message;
	}

}
