package game;

import player.Player;

public class TennisGame {
	/* the 2 players of the game session */
	Player p1, p2; 
	
	/* constructors */
	public TennisGame(){
		p1 = new Player();
		p2 = new Player();
		System.out.println("-----New game begins!-----");
		System.out.println("Initial love - love");
	}
	
	/* methods */
	public void pScores(int who) throws InvalidPlayerException{
		Player p;
		if(who == 1){
			p = p1;
		}
		else if(who == 2){
			p = p2;
		}
		else throw new InvalidPlayerException();
		
		System.out.print("player" + who + " scores");
		if(isDeuce()){
			p.setPunteggio("advantage");
		}
		else if(p.getPunteggio().equalsIgnoreCase("40") || p.getPunteggio().equalsIgnoreCase("advantage")){
			System.out.println(" > Score: player" + who + "wins");
			reset();
		}
		else{
			p.increaseScore();
		}
	}

	private void reset() {
		p1 = new Player();
		p2 = new Player();
		System.out.println("-----New game begins!-----");
		System.out.println("Initial love - love");		
	}

	private boolean isDeuce() {
		return p1.getPunteggio().equalsIgnoreCase("40") && p2.getPunteggio().equalsIgnoreCase("40");
	}
	
}
	