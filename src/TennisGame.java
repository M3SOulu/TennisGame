public class TennisGame {
	private Player p1;
	private Player p2;
	private int state;	// 0 = game not finished, 1 = game finished
	private String winner;

	TennisGame(Player player1, Player player2) {
		System.out.println("\n-----------------------------\nNew game: " + player1.getName() + " vs " + player2.getName());
		p1 = player1;
		p2 = player2;
		state = 0;
	}

	public void getScoreString() {
		if (state == 0) {
			System.out.println("\nScore: " + p1.getName() + " - " + p2.getName());
			if (p1.getPointsWon() >= 3 && p2.getPointsWon() >= 3 && state == 0) {
				if (p1.getScore() == p2.getScore()) {
					System.out.println("Deuce");
				}
				else {
					System.out.println(p1.getScoreString() + " - " + p2.getScoreString());
				}
			}
			else {
				System.out.println(p1.getScoreString() + " - " + p2.getScoreString());
			}
			System.out.println("");
		}
		else {
			System.out.println("The game has finished");
			System.out.println(winner + " won");
		}
	}

	public void p1Scored() {
		if (state == 0) {
			if (p2.getScore() == 4) {
				p2.subScore();
			}
			else {
				p1.addPoint();
			}

			// Check for win condition
			if (p1.getScore() < 5 && p1.getScore() - p2.getScore() < 3) {
				System.out.println(p1.getName() + " Scored");
			}
			else {
				System.out.println(p1.getName() + " Wins\n-----------------------------");
				winner = p1.getName();
				state = 1;
			}
		}
	}

	public void p2Scored() {
		if (state == 0) {
			if (p1.getScore() == 4) {
				p1.subScore();
			}
			else {
				p2.addPoint();
			}

			// Check for win condition
			if (p2.getScore() < 5 && p2.getScore() - p1.getScore() < 3) {
				System.out.println(p2.getName() + " Scored");
			}
			else {
				System.out.println(p2.getName() + " Wins\n-----------------------------");
				winner = p2.getName();
				state = 1;
			}
		}
	}

	// example games
	public static void main(String[] args) {
		TennisGame game = new TennisGame(new Player("Player 1"), new Player("Player 2"));
		game.getScoreString();		// 0 - 0
		game.p1Scored();			// 15 - 0
		game.getScoreString();
		game.p2Scored();			// 15 - 15
		game.getScoreString();
		game.p1Scored();			// 30 - 15
		game.getScoreString();
		game.p1Scored();			// 40 - 15
		game.getScoreString();
		game.p1Scored();			// p1 win

		game = new TennisGame(new Player("Player 1"), new Player("Player 2"));
		game.getScoreString();		// 0 - 0
		game.p1Scored();			// 15 - 0
		game.getScoreString();
		game.p2Scored();			// 15 - 15
		game.getScoreString();
		game.p1Scored();			// 30 - 15
		game.getScoreString();
		game.p1Scored();			// 40 - 15
		game.getScoreString();
		game.p2Scored();			// 40 - 30
		game.getScoreString();
		game.p2Scored();			// deuce
		game.getScoreString();
		game.p1Scored();			// p1 adv
		game.getScoreString();
		game.p1Scored();			// p1 win

		game = new TennisGame(new Player("Player 1"), new Player("Player 2"));
		game.getScoreString();		// 0 - 0
		game.p1Scored();			// 15 - 0
		game.getScoreString();
		game.p2Scored();			// 15 - 15
		game.getScoreString();
		game.p1Scored();			// 30 - 15
		game.getScoreString();
		game.p1Scored();			// 40 - 15
		game.getScoreString();
		game.p2Scored();			// 40 - 30
		game.getScoreString();
		game.p2Scored();			// deuce
		game.getScoreString();
		game.p1Scored();			// p1 adv
		game.getScoreString();
		game.p2Scored();			// deuce
		game.getScoreString();
		game.p2Scored();			// p2 adv
		game.getScoreString();
		game.p2Scored();			// p2 win
	}

}
