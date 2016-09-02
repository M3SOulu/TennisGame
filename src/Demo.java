import java.util.Random;

public class Demo {
	private TennisGame mGame;
	
	void run() {
		int maxIterations = 100;
		
		Random random = new Random();
		
		// Simulate 5 games
		for (int i = 0; i < 111; i++) {
			mGame = new TennisGame();
			int j = 0;
			
			System.out.println("New game");
			System.out.println("--------------------");
			
			do {
				if (j++ > maxIterations) {
					System.out.println("Max iterations reached");
					break;
				}
				
				if (random.nextBoolean()) {
					score(PlayerId.PLAYER_1);
				} else {
					score(PlayerId.PLAYER_2);
				}

				judge(PlayerId.PLAYER_1);
				judge(PlayerId.PLAYER_2);
				
			} while (
				mGame.getCall(PlayerId.PLAYER_1) != CallId.WIN &&
				mGame.getCall(PlayerId.PLAYER_2) != CallId.WIN);
			
			System.out.println("--------------------");
		}
	}
	
	void score(PlayerId player) {
		System.out.println("-- Player " + getPlayerString(player) + " scores");
		
		mGame.playerScored(player);
	}
	
	void judge(PlayerId player) {
		System.out.println("Player " + getPlayerString(player)
			+ ": " + getGameStateString(player));
	}
	
	String getPlayerString(PlayerId player) {
		return (player == PlayerId.PLAYER_1) ? "1" : "2";
	}
	
	String getGameStateString(PlayerId player) {
		switch (mGame.getCall(player)) {
			case LOVE:
				return "Love";
			case FIFTEEN:
				return "Fifteen";
			case THIRTY:
				return "Thirty";
			case FORTY:
				return "Forty";
			case WIN:
				return "Win";
			case LOSE:
				return "Lose";
			case DEUCE:
				return "Deuce";
			case ADVANTAGE_IN:
				return "Adantage In";
			case ADVANTAGE_OUT:
				return "Advantage Out";
			default:
				return "Unknown";
		}
	}
}
