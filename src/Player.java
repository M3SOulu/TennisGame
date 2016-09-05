public class Player {
	private String[] ScoreLabel = {"LOVE", "FIFTEEN", "THIRTY", "FOURTY", "ADVANTAGE"};
	private int score;
	private int pointsWon;
	private String name;
	
	Player(String s) {
		name = s;
		score = 0;
		pointsWon = 0;
	}

	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}

	public String getScoreString() {
		return ScoreLabel[this.score];
	}

	public int getPointsWon() {
		return this.pointsWon;
	}

	public void addPoint() {
		this.pointsWon++;
		this.score++;
	}

	public void subScore() {
		this.score--;
	}
}
