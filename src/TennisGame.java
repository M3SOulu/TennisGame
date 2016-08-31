
public class TennisGame {
	private int points[] = { 0, 0 };
	
	public void playerScored(PlayerId player) {
		++points[getPlayerIndex(player)];
	}
	
	public int getPoints(PlayerId player) {
		return points[getPlayerIndex(player)];
	}
	
	public CallId getCall(PlayerId player) {
		int playerPoints = points[getPlayerIndex(player)];
		int opponentPoints = points[getOpponentIndex(player)];
		
		if (playerPoints == opponentPoints && playerPoints >= 3) {
			return CallId.DEUCE;
		} else if (playerPoints >= 4 && (playerPoints - opponentPoints >= 2)) {
			return CallId.GAME;
		} else if (opponentPoints >= 4 && (opponentPoints - playerPoints >= 2)) {
			return CallId.ADVANTAGE_OUT;
		} else if (playerPoints >= 3 && opponentPoints >= 3) {
			if (playerPoints > opponentPoints) {
				return CallId.ADVANTAGE_IN;
			} else {
				return CallId.ADVANTAGE_OUT;
			}
		} else {
			switch (playerPoints) {
				case 0:  return CallId.LOVE;
				case 1:  return CallId.FIFTEEN;
				case 2:  return CallId.THIRTY;
				case 3:  return CallId.FORTY;
				default: return CallId.UNKNOWN;
			}
		}
	}

	private int getPlayerIndex(PlayerId player) {
		return (player == PlayerId.PLAYER_1) ? 0 : 1;
	}
	
	private int getOpponentIndex(PlayerId player) {
		return (player == PlayerId.PLAYER_1) ? 1 : 0;
	}
	
	public static void main(String [] args) {
		Demo demo = new Demo();
		demo.run();
	}
}
