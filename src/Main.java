
public class Main {
	
	public static final int SIMULATION_COUNT = 10;
	public static final int GAME_COUNT = 3;

	public static void main(String[] args) {
		TennisGame game = new TennisGame(new Player("Player 1"), new Player("Player 2"));
		game.simulateForGames(GAME_COUNT);
		
		//game = new TennisGame(new Player("Player 3"), new Player("Player 4"));
		//game.simulateForRounds(SIMULATION_COUNT);
	}
}
