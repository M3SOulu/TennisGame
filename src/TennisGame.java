import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.lang.Integer;

public class TennisGame {
	private final int NO_PLAYER = -1;
	private final int PLAYER_AMOUNT = 2;
	private final int PLAYER_1 = 0;
	private final int PLAYER_2 = 1;
	private boolean interactive;
	private int[] validPlayers;
	private int[] scores;
	private int mScoredPlayer;

	private String[] scoreNames = {
		"Love",
		"Fifteen",
		"Thirty",
		"Fourty",
		"Game",
		"Game"
	};

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
		int winner = -1;

		aTennisGame.setup();

		while (-1 == winner) {
			winner = aTennisGame.playRound();
			aTennisGame.announceScore();
		}

		System.out.println("Winner is " + winner);
	}

	private void setup() {
		scores = new int[PLAYER_AMOUNT];
		validPlayers = new int[PLAYER_AMOUNT];
		mScoredPlayer = NO_PLAYER;

		for (int i = 0; i < PLAYER_AMOUNT; i++) {
			scores[i] = 0;
		}

		validPlayers[0] = PLAYER_1;
		validPlayers[1] = PLAYER_2;

	}

	private int playRound() {
		boolean playerOk = false;

		while (!playerOk) {
			System.out.println("Who scores? > ");
			mScoredPlayer = whoScored() - 1;
			playerOk = validPlayer(mScoredPlayer);

			if (!playerOk)
				System.out.println("invalid player");
		}

		return didPlayerWin() ? mScoredPlayer : -1;
	}

	private boolean didPlayerWin() {
		if (scores[mScoredPlayer] <= 2) {
			scores[mScoredPlayer]++;
		} else {
			if (scores[mScoredPlayer] > scores[lostPlayer()]) {
				scores[mScoredPlayer]++;
				return true;
			} else {
				if (3 == scores[lostPlayer()])
					scores[mScoredPlayer]++;
				scores[lostPlayer()] = 3;
			}
		}

		return false;
	}

	private int lostPlayer() {
		return (mScoredPlayer + 1) % PLAYER_AMOUNT;
	}

	private void announceScore() {
		String[] score = getScore();
		System.out.println((mScoredPlayer + 1) + " scored!");
		System.out.println("Score is now: " + score[0] + score[1]);
	}

	private String[] getScore() {
		String[] totalScore = new String[2];

		totalScore[1] = "";

		if (scores[mScoredPlayer] == scores[lostPlayer()]) {
			totalScore[0] = scoreNames[scores[0]] + " All";
			if (3 == scores[mScoredPlayer])
				totalScore[0] = "Deuce";
		} else if (4 == scores[mScoredPlayer] && scores[lostPlayer()] > 2) {
			totalScore[0] = "Adv " + (mScoredPlayer + 1);
		} else {
			totalScore[0] = scoreNames[scores[0]];
			totalScore[1] = " - " + scoreNames[scores[1]];
		}

		return totalScore;
	}

	// in setup maybe run this for victory sequence
	private boolean validPlayer(int player) {
		for (int i = 0; i < validPlayers.length; i++) {
			if (player == validPlayers[i]) {
				return true;
			}
		}

		return false;
	}

	private int whoScored () {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		int playerNum = -1;

		try {
			input = br.readLine();
			playerNum = Integer.parseInt(input);
		} catch (IOException|NumberFormatException e) {
			System.out.println("Exception while reading which player scored: " + e.getMessage());
		}

		return playerNum;
	}

	public void player1Scored() {

	}

	public void playerScored(int player_num) {

	}
}
