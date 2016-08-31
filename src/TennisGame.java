import java.util.Random;

public class TennisGame implements ITennisGame {
	
	private Player player1;
	private Player player2;
	
	public TennisGame(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		player1.startMatch(player2);
	}
	
	public void simulateForRounds(int roundCount) {
		if (roundCount < 1)
			roundCount = 1;

		System.out.println("");
		System.out.println("");
		System.out.println(player1.getName() + " versus " + player2.getName() + "!");
		System.out.println("");
		
		Random rand = new Random();
		for (int i = 0; i < roundCount; i++) {
			if (rand.nextInt() % 2 == 0)
				playerScored(player1);
			else
				playerScored(player2);
		}
		
		System.out.println("\nGame finished!");
		printScore();
	}
	
	public void simulateForGames(int gameCount) {
		if (gameCount < 1)
			gameCount = 1;
		
		System.out.println(player1.getName() + " versus " + player2.getName() + "!");
		System.out.println("Playing for " + gameCount + " games.");
		System.out.println("");

		int gamesPlayed = 0;
		Random rand = new Random();
		while (gamesPlayed < gameCount) {
			if (rand.nextInt() % 2 == 0)
				playerScored(player1);
			else
				playerScored(player2);
			
			gamesPlayed = player1.getGames() + player2.getGames();
		}
		
		if (player1.getGames() > player2.getGames())
			System.out.println("Game finished! Winner is " + player1.getName()
				+ " with " + player1.getGames() + " games!");
		else
			System.out.println("Game finished! Winner is " + player2.getName()
			+ " with " + player2.getGames() + " games!");
	}
	
	public void playerScored(Player player) {
		System.out.println(player.getName() + " scored!");
		
		if (player.getScore() == ScoreValue.advantage) {
			gameScored(player);
		} else if (player.getScore() == ScoreValue.deuce) {
			if (player.getOpponent().getScore() == ScoreValue.advantage)
				player.getOpponent().setScore(ScoreValue.deuce);
			else
				player.setScore(ScoreValue.advantage);

			printScore();
		} else {
			player.incrementScore();
			
			if (player.getScore() == ScoreValue.deuce) {
				if (player.getOpponent().getScore() == ScoreValue.forty) {
					player.getOpponent().setScore(ScoreValue.deuce);
					printScore();
				} else if (player.getScore().ordinal() - player.getOpponent().getScore().ordinal() > 1) {
					gameScored(player);
				}
			} else {
				printScore();
			}
		}
	}
	
	private void gameScored(Player player) {
		player.gameScored();
		player.resetScore();
		player.getOpponent().resetScore();
		
		System.out.println("Game: " + player.getName());
		System.out.println(player1.getName() + " games: " + player1.getGames());
		System.out.println(player2.getName() + " games: " + player2.getGames());
		System.out.println("");
	}
	
	private void printScore() {
		System.out.print("Score: ");
		
		if (player1.getScore() == ScoreValue.advantage) {
			System.out.println("Advantage " + player1.getName());
		} else if (player2.getScore() == ScoreValue.advantage) {
			System.out.println("Advantage " + player2.getName());
		} else if (player1.getScore() == ScoreValue.deuce && player2.getScore() == ScoreValue.deuce) {
			System.out.println("Deuce!");
		} else {
			System.out.println(
					player1.getName() + ": " + player1.getScore() + ", " +
					player2.getName() + ": " + player2.getScore());
		}
		
		System.out.println("");
	}
}
