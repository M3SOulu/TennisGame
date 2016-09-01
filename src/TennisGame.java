
public class TennisGame {
	private Player player1;
	private Player player2;
	
	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public String Score() {
		if (player1.Score() >= 3 && player2.Score() >= 3) {
			if (Math.abs(player2.Score() - player1.Score()) >= 2) {
				return getLeader().getName() + " won!";
			}
			else if (player1.getScore() == player2.getScore()) {
				return "Deuce!";
			}
			else {
				return getLeader().getName() + " Advantage!";
			}
		}
		else {
			return player1.getScoreDescription() + ", " + player2.getScoreDescription();
		}
	}
	
	public Player getLeader() {
        return (player1.Score() > player2.Score()) ? player1 : player2;
    }
	
}
