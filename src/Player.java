
public class Player {
	private int score;
	private int pointWin;
	
	int getScore() {
		return this.score;
	}
	
	int getPointWin() {
		return this.pointWin;
	}
	
	void setScore(int score) {
		this.score += score;
	}
	
	void setPointWin() {
		pointWin++;
	}
	
}
