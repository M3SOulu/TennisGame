
public class Player {

	private int idPlayer;
	protected int score;

	Player(int id) {
		idPlayer = id;
		score = 0;
	}

	public int getScore() {
		return score;
	}

	public int getIdPlayer() {
		return idPlayer;
	}

	public void addPoint() throws InvalidNumberPoint {
		// score++;
	}

	public void zeroScore() {
		score = 0;
	}

}
