
public class Player {
	
	private String name;
	private int point;
	private boolean advantage; 
	
	public Player(String name){
		this.name = name;
		this.point = 0;
		this.advantage = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point += point;
	}

	public boolean isAdvantage() {
		return advantage;
	}

	public void setAdvantage(boolean advantage) {
		this.advantage = advantage;
	}
	
}
