
public class Player {
	private String name = "";
	private int gameScore = 0;
	
	
	public void setName(String playerName){
		name = playerName;
	}
	
	public String getName(){
		return name;
	}
	
	public void setScore(){
		gameScore++;
	}
	
	public int getScore(){
		return gameScore;
	}
}
