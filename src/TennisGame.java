import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.lang.Integer;

public class TennisGame {
	private final int PLAYER_AMOUNT = 2;
	private int[] scores;
	
	public static void main(String[] args) {
		TennisGame aTennisGame = new TennisGame();
		String winner = "0";
		
		aTennisGame.setup();
		
		while (winner.equals("0")) {
			winner = aTennisGame.playRound(); 
		}
		
		System.out.println("Winner is " + winner);
	}
	
	private void setup() {
		scores = new int[PLAYER_AMOUNT];
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = 0;
		}
	}
	
	private String playRound() {
		boolean playerOk = false;
		String scoredPlayer = "";
		
		
		while (!playerOk) {
			System.out.println("Who scores? > ");
			scoredPlayer = whoScored();
			playerOk = validPlayer(scoredPlayer);
			
			if (!playerOk)
				System.out.println("invalid player");
		}
		
		if (didPlayerWin(scoredPlayer)) {
			System.out.println(scoredPlayer + " scored!");
			System.out.println("his score is now: " + scores[Integer.parseInt(scoredPlayer) - 1]);
			return scoredPlayer;
		} else {
			System.out.println(scoredPlayer + " scored!");
			System.out.println("his score is now: " + scores[Integer.parseInt(scoredPlayer) - 1]);
			return "0";
		}
	}
	
	private boolean didPlayerWin(String scoredPlayer) {
		if (scores[Integer.parseInt(scoredPlayer) - 1] <= 15) {
			scores[Integer.parseInt(scoredPlayer) - 1] = scores[Integer.parseInt(scoredPlayer) - 1] + 15;
		} else if (scores[Integer.parseInt(scoredPlayer) - 1] == 30) {
			scores[Integer.parseInt(scoredPlayer) - 1] = scores[Integer.parseInt(scoredPlayer) - 1] + 10;
		} else if (scores[Integer.parseInt(scoredPlayer) - 1] == 40) {
			scores[Integer.parseInt(scoredPlayer) - 1] = scores[Integer.parseInt(scoredPlayer) - 1] + 5;
		}
		
		//need to handle advantage
		if (40 == scores[Integer.parseInt(scoredPlayer) - 1]) {
			return true;
		}
		
		return false;
	}
	
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
		} catch (IOException e) {
			System.out.println("exception: " + e.getMessage());
		}
		
		return input;
	}
	
	public void player1Scored() {

	}
	
	public void playerScored(int player_num) {
		
	}
}
