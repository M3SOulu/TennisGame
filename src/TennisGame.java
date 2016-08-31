import java.util.Random;

public class TennisGame {

	private int [] tennis;
	
	public void playerScored (Player i) {
		int score = 0;
		boolean adv = false;
		tennis = new int [4];
		tennis[0] = 0;
		tennis[1] = 15;
		tennis[2] = 30;
		tennis[3] = 45;
		
		if (i.counter == 0) {
			score = tennis[0];
		} 
		if (i.counter == 1) {
			score = tennis[1];
		}
		else if (i.counter == 2) {
			score = tennis[2];
		}
		else if (i.counter == 3) {
			score = tennis[3];
		}
		else {
			score  = tennis[3];
			adv = true;
		}
		
		if (adv) {
			System.out.println(score + " ADV");
		}
		else {
			System.out.println(score);
		}
	}
	
	
	public void randomGame (Player pl1, Player pl2) {
		// JUST TO TRY playerScored, NOT FINISHED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		int player;
		boolean winner = false;
		boolean first = false;
		boolean second = false;
		do {
			player = (int) (Math.random() * 2);
			
			if (player == 0) {
				pl1.counter++;
			}
			else {
				pl2.counter++;
			}
			
			if ((pl1.counter == 4) && (pl2.counter < 4)) {
				winner = true;
				first = true;
			}
			else if ((pl2.counter == 4) && (pl1.counter < 4)) {
				winner = true;
				second = true;
			}
			else if ((pl1.counter == 5)) {
				winner = true;
				first = true;
			}
			else if (pl2.counter == 5) {
				winner = true;
				second = false;
			}
			playerScored (pl1);
			System.out.println (" - ");
			playerScored (pl2);
			System.out.println("---------");
		} while (!winner);
		if (winner) {
			System.out.println("Player1 wins");
		}
		else {
			System.out.println("Player2 wins");
		}
	}
}