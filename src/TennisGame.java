import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.lang.Integer;

public class TennisGame {
	private final String NO_PLAYER = "";
	private final int PLAYER_AMOUNT = 2;
	private final int PLAYER_1 = 0;
	private final int PLAYER_2 = 1;
	private int[] scores;
	private boolean noAdvantage;
	private int[] advantage;
	private boolean interactive;
	private String mScoredPlayer;

	public TennisGame() {
		interactive = true;
	}

	public TennisGame(String[] args) {
		int i;
		for (i = 0; i < args.length; i++) {
			recognizeArg(args[i]);
		}
	}

	private void recognizeArg(String arg) {
		switch (arg) {
			case "interactive":
				interactive = true;
			default:
		}
	}

	public static void main(String[] args) {
		TennisGame aTennisGame = new TennisGame();
		String winner = "0";

		aTennisGame.setup();

		while (winner.equals("0")) {
			winner = aTennisGame.playRound();
			aTennisGame.announceScore();
		}

		System.out.println("Winner is " + winner);
	}

	private void setup() {
		scores = new int[PLAYER_AMOUNT];
		advantage = new int[PLAYER_AMOUNT];
		noAdvantage = true;
		mScoredPlayer = NO_PLAYER;

		for (int i = 0; i < PLAYER_AMOUNT; i++) {
			scores[i] = 0;
			advantage[i] = 0;
		}
	}

	private String playRound() {
		boolean playerOk = false;

		while (!playerOk) {
			System.out.println("Who scores? > ");
			mScoredPlayer = whoScored();
			playerOk = validPlayer(mScoredPlayer);

			if (!playerOk)
				System.out.println("invalid player");
		}

		return didPlayerWin() ? mScoredPlayer : "0";
	}

	private boolean didPlayerWin() {
		if (scores[Integer.parseInt(mScoredPlayer) - 1] <= 15) {
			scores[Integer.parseInt(mScoredPlayer) - 1] = scores[Integer.parseInt(mScoredPlayer) - 1] + 15;
		} else if (scores[Integer.parseInt(mScoredPlayer) - 1] == 30) {
			scores[Integer.parseInt(mScoredPlayer) - 1] = scores[Integer.parseInt(mScoredPlayer) - 1] + 10;
		}

		if (false == noAdvantage) {
			advantage[PLAYER_1] = 0;
			advantage[PLAYER_2] = 0;
			noAdvantage = true;
		}

		if ((scores[PLAYER_1] == 40) && (scores[PLAYER_2] == 40)) {
			noAdvantage = false;

			advantage[Integer.parseInt(mScoredPlayer) - 1] = 1;
		}

		//handle advantage
		if ((40 == scores[Integer.parseInt(mScoredPlayer) - 1] && noAdvantage) ||
				(40 == scores[Integer.parseInt(mScoredPlayer) - 1] && advantage[Integer.parseInt(mScoredPlayer) - 1] == 1)) {
			return true;
		}

		return false;
	}

	private void announceScore() {
		System.out.println(mScoredPlayer + " scored!");
		System.out.println("his score is now: " + scores[Integer.parseInt(mScoredPlayer) - 1]);
	}

	// in setup maybe run this for victory sequence
	private boolean validPlayer(String player) {
		String[] validPlayers = new String[PLAYER_AMOUNT];
		validPlayers[0] = "1";
		validPlayers[1] = "2";

		for (int i = 0; i < validPlayers.length; i++) {
			if (player.equals(validPlayers[i])) {
				return true;
			}
		}

		return false;
	}

	private String whoScored () {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";

		try {
			input = br.readLine();
			//Integer.parseInt(input);
		} catch (IOException|NumberFormatException e) {
			System.out.println("Exception: " + e.getMessage());
		}

		return input;
	}

	public void player1Scored() {

	}

	public void playerScored(int player_num) {

	}
}
