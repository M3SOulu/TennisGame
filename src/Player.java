public class Player {

	int score;
	boolean advantage;
	boolean won;
	
	Player() {
		score = 0;
		advantage = false;
		won = false;
	}
	
	public int getScore() {
		return score;
	}
	
	public void addPoint(Player opponent) {
		score += 1;
		if(score == 4) {
			if(advantage) {
				won = true;
			} else {
				if(opponent.hasAdvantage()) {
					opponent.setAdvantage(false);
				} else {
					advantage = true;
				}
			}
			score = 3;
		}
	}
	
	public boolean hasAdvantage() {
		return advantage;
	}
	
	public boolean hasWon() {
		return won;
	}
	
	public void setAdvantage(boolean adv) {
		advantage = adv;
	}
}
