public class TennisGame {
	private enum Score {
		LOVE,
		FIFTEEN,
		THIRTY,
		FORTY,
		ADVANTAGE,
		WIN {
			@Override
			public Score next() {
				// You can't score beyond winning
				return this;
			}
		};
		
		public Score next() {
			return Score.values()[this.ordinal() + 1];
		}
	}
	
	private Score[] scores = { Score.LOVE, Score.LOVE };
	
	public static final int PLAYER_1 = 0;
	public static final int PLAYER_2 = 1;
	
	public void playerScored(int player) {
		// Switch 0 -> 1 or vice versa
		int otherPlayer = player ^ 1;
		
		if (scores[otherPlayer] == Score.ADVANTAGE) {
			// It's deuce again
			scores[otherPlayer] = Score.FORTY;
			return;
		}
	
		if (scores[player] == Score.FORTY && scores[otherPlayer] != Score.FORTY) {
			// Player wins
			scores[player] = scores[player].next().next();
		} else {
			scores[player] = scores[player].next();
		}
	}
}
