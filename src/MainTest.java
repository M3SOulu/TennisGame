
public class MainTest {
	
	public static void main(String args[]){		
		
		TennisGame theGame = new TennisGame();		//0-0
		System.out.println(theGame.getScore());
		theGame.player1Scored();				//15-0
		System.out.println(theGame.getScore()); 
		theGame.player2Scored();				//15-15
		System.out.println(theGame.getScore()); 
		theGame.player2Scored();				//15-30
		System.out.println(theGame.getScore()); 
		theGame.player1Scored();				//30-30
		System.out.println(theGame.getScore()); 
		theGame.player1Scored();				//40-30
		System.out.println(theGame.getScore()); 
		theGame.player2Scored();				//deuce
		System.out.println(theGame.getScore()); 
		theGame.player1Scored();				//Adv - 40
		System.out.println(theGame.getScore()); 
		theGame.player2Scored();				//deuce
		System.out.println(theGame.getScore()); 
		theGame.player2Scored();				//40 - adv
		System.out.println(theGame.getScore()); 
		theGame.player1Scored();				//deuce
		System.out.println(theGame.getScore()); 
		theGame.player2Scored();				//40 - adv
		System.out.println(theGame.getScore()); 
		theGame.player1Scored();				//deuce
		System.out.println(theGame.getScore()); 
		theGame.player2Scored();				//40 - adv
		System.out.println(theGame.getScore()); 
		theGame.player2Scored();				// 2 win
		System.out.println(theGame.getScore());

		
	}

}
