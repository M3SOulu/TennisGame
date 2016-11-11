/**
 * Player of a tennis game
 * @author Michele
 *
 */
public class Player {

	private int score;
	private  String name;
	
	/**
	 * default costructor
	 * 
	 * @param name
	 */
	public Player( String name) {
		this.score = TennisScore.LOVE;
		this.name = name;
	}
	
	//getters and setters
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//
	
	/**
	 * print the score a this player
	 * @return
	 */
	public String printScore(){
		
		String score="";
		
		if(this.score==TennisScore.LOVE){
			
			score="love";
			
		}else if(this.score==TennisScore.ADVANTAGE){
			
			score="advantage";
			
		}else if (getScore()==TennisScore.WINNER){
			
			score=getName()+" wins";		
			
		}else{
			
			score=Integer.toString(this.score);
		}
	
		return score;
	}
	
	
}
