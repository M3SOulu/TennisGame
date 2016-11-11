package player;

public class Player {
	
	/* score */
	String score;
	
	public String getPunteggio() {
		return score;
	}

	public void setPunteggio(String score) {
		this.score = score;
	}
	
	/* constructors */
	public Player() {
		score = "love";
	}
	
	public Player(String score) {
		this.score = score;
	}
	
	/* methods */
	public void increaseScore(){
		if(score.equalsIgnoreCase("love")){
			score = "15";
		}
		else if(score.equalsIgnoreCase("15")){
			score = "30";
		}
		else if(score.equalsIgnoreCase("30")){
			score = "40";
		}
	}

}
