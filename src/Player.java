
public class Player {
	
	private String name;
	private int points;
	private boolean advantage;
	private int nScore;
	
	public Player(String str){
		this.name=str;
		this.points=0;
		this.setAdvantage(false);
		this.nScore=0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = this.points + points;
		this.setnScore();
	}

	public boolean isAdvantage() {
		return advantage;
	}

	public void setAdvantage(boolean advantage) {
		this.advantage = advantage;
	}

	public int getnScore() {
		return nScore;
	}

	public void setnScore() {
		this.nScore = this.nScore+1;
	}

}
