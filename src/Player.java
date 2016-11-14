
public class Player {
	private int score;
	private boolean isWinner;
	
	Player() {
		this.score = 0;
		this.isWinner = false;
	}
	
	int getScore() {
		return this.score;
	}
	
	void addScore() {
		this.score++;
	}
	
	boolean getIsWinner() {
		return this.isWinner;
	}
	
	void setIsWinner(boolean result) {
		this.isWinner = result;
	}
}
