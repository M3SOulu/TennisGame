
public class Player {
	
	private String name;
	private ScoreValue score;
	private int games;
	private Player opponent;
	
	public String getName() { return name; }
	public ScoreValue getScore() { return score; }
	public int getGames() { return games; }
	public void setScore(ScoreValue score) { this.score = score; }
	public Player getOpponent() { return opponent; }
	
	public Player(String name) {
		this.name = name;
		resetScore();
		games = 0;
	}
	
	public void startMatch(Player opponent) {
		setOpponent(opponent);
		opponent.setOpponent(this);
	}
	
	public void gameScored() {
		games++;
	}
	
	public void incrementScore() {
		score = score.nextValue();
	}
	
	public void resetScore() {
		score = ScoreValue.love;
	}
	
	private void setOpponent(Player player) {
		this.opponent = player;
	}
}
