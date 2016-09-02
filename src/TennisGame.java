
public class TennisGame {
	
	private int player1Score = 0;
	private int player2Score = 0;
	
	// constructor
	public TennisGame() {
		player1Score = 0;
		player2Score = 0;
	}
	
	// First checks if there is a winner, then if game is a draw/advantage
	// and lastly if nothing special is needed
	// -> returns the current score.
	public String getScore() {
		
		// check if there is a winner
		// -> return winner.
		if(player1Score >= 3 && player2Score <= player1Score - 2) {
			return "player 1 wins!";
		} else if(player2Score >= 3 && player1Score <= player2Score - 2) {
			return "player 2 wins!";
		}
		
		// if both players have more than three points and they are the same
		// -> it's a draw.
		// --> return deuce 
		// ---> if it's not a draw calculate advantage 
		// ----> return advantage.
		if(player1Score >= 3 && player2Score >= 3) {
			if(player1Score == player2Score) {
				return "Deuce";
			} else {// advantage calculation
				if(player1Score > player2Score) {
					return "advantage - 40"; // player 1 has advantage
				} else {
					return "40 - advantage"; // player 2 has advantage
				}
			}
		}
		
		// On this point we don't have a winner yet or the game isn't a draw 
		// -> calculate & print score..
		
		// score: "score1 - score2"
		String score = "";
		String score1 = "love";
		String score2 = "love";
		
		// player 1 score
		if(player1Score == 1) {
			score1 = "fifteen";
		} else if (player1Score == 2) {
			score1 = "thirty";
		} else if (player1Score == 3) {
			score1 = "forty";
		}
		
		// player 2 score
		if(player2Score == 1) {
			score2 = "fifteen";
		} else if (player2Score == 2) {
			score2 = "thirty";
		} else if (player2Score == 3) {
			score2 = "forty";
		}
		
		score = score1 + " - " + score2;
		
		return score;
	}
	
	// logic which adds one point to player's x score.
	public void playerScored(int playerNum) {
		if(playerNum == 1) {
			player1Score++;
		} else if(playerNum == 2) {
			player2Score++;
		} else {
			System.out.print("error: incorrect playerNum.");
		}
	}
	
	// debugging purposes 
	// -> scores could be also turned to public... nvm.
	public void SetScores(int[] scores) {
		player1Score = scores[0];
		player2Score = scores[1];
	}
	
	// for debugging by hand...
	// change arguments from run -> run config -> arguments.
	public static void main(String[] args) {
		TennisGame myGame = new TennisGame();
		
		if(args.length != 2) {
			System.out.println("To debug: \n1. player1 score\n2. player2 score");
		}
		
		int args0 = Integer.parseInt(args[0]);
		int args1 = Integer.parseInt(args[1]);
		
		int[] argsint = { args0, args1 };
		
		myGame.SetScores(argsint);
		
		System.out.println(myGame.getScore());
		
	}
	
}
