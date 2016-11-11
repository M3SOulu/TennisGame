import exceptions.CantGetScoreDescriptionException;

public class Player {

	private String name;
	private int score;

	private static final String[] scoreDescription = { "love", "15", "30", "40" };

	public Player(String name) {
		this.name = name;
		score = 0;
	}

	public void addPoint() {
		score++;
	}

	public String getScoreDescription() throws CantGetScoreDescriptionException {
		if (score > 3)
			throw new CantGetScoreDescriptionException();
		return scoreDescription[score];
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

}
