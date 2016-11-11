
public class Player {

	private int score;
	private  String name;
	
	
	public Player( String name) {
		this.score = 0;
		this.name = name;
	}
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
	
	public String printScore(){
		
		String score="";
		
		if(this.score==TennisScore.LOVE){
			
			score="love";
			
		}else if(this.score==TennisScore.ADVANTAGE){
			
			score="advantage";
			
		}else{
			
			score=Integer.toString(this.score);
		}
	
		return score;
	}
	
	
}
