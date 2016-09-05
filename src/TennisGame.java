
public class TennisGame {
int player1 = 0;
int player2 = 0;
int player1Score = 0;
int player2Score = 0;
	public void player1Scored(){
		if (player1%30 == 0) {
			player1 += 10;
		}
		else {
			player1 += 15;
		}
		player1Score++;
	}
	public void player2Scored(){
		if (player2 % 30 == 0){
			player2 += 10;
		}
		else {
			player2 += 15;
		}
		player2Score++;
	}
	public void displayScore(){
	System.out.print("Scores: " + player1 +" - "+ player2 +"\n");
	System.out.print("P1: "+ player1Score+ " P2: " + player2Score+" ");
	if ((player1Score >= 3) || (player2Score >= 3)){
				if (player1Score == player2Score){
				System.out.print("Deuce");
				}
			else if ((player2Score - player1Score) >= 2){
				System.out.print("\nPlayer 1 wins by " + (player2 - player1) + " points\n");
			}
			else if ((player1Score - player2Score) >= 2){
				System.out.print("\nPlayer 2 wins by " + (player1 - player2) + " points\n");
			}
		if (player1Score > player2Score) { System.out.print("Advantage for player 1");}
		if (player1Score < player2Score) { System.out.print("Advantage for player 2");}
		}
	System.out.print("\n\n");
	}

	
	
	private static void newGame() {
	TennisGame tennisgame = new TennisGame();
	tennisgame.player1Scored();				//Simulate a match between two players
	tennisgame.displayScore();
	
	tennisgame.player1Scored();
	tennisgame.displayScore();
	
	tennisgame.player2Scored();
	tennisgame.displayScore();
	
	tennisgame.player2Scored();
	tennisgame.displayScore();
	
	tennisgame.player2Scored();
	tennisgame.displayScore();
	
	tennisgame.player1Scored();
	tennisgame.displayScore();
	
	tennisgame.player2Scored();
	tennisgame.displayScore();

	}
	
	public static void main(String[] args) {
		newGame();
	}
}
