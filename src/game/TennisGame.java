package game;

import player.InvalidScoreExceptio;
import player.Player;

public class TennisGame {
	/* the 2 players of the game session */
	Player p1, p2; 
	
	/* the message of the score */
	String message;
	
	public String getMessage() {
		return message;
	}
	
	/* constructors */
	public TennisGame(){
		p1 = new Player();
		p2 = new Player();
		message = "Initial love - love";
	}
	
	/* methods */
	public void pScores(int who) throws InvalidPlayerException, InvalidScoreExceptio{
		Player p;
		if(who == 1){
			p = p1;
		}
		else if(who == 2){
			p = p2;
		}
		else throw new InvalidPlayerException();
		
		if(isDeuce()){
			p.setPunteggio("advantage");
			message = " > Score: " + p1.getPunteggio() + " - " + p2.getPunteggio();
		}
		else if(p.getPunteggio().equalsIgnoreCase("40") || p.getPunteggio().equalsIgnoreCase("advantage")){
			message = " > Score: player" + who + " wins";
		}
		else{
			p.increaseScore();
			if(isDeuce()) {
				message = " > Score: deuce";
			}
			else {
				message = " > Score: " + p1.getPunteggio() + " - " + p2.getPunteggio();
			}
		}
	}

	public void reset() {
		p1 = new Player();
		p2 = new Player();
		message = "Initial love - love";		
	}

	private boolean isDeuce() {
		return p1.getPunteggio().equalsIgnoreCase("40") && p2.getPunteggio().equalsIgnoreCase("40");
	}
	
}
	