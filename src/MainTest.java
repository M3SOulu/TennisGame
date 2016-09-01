
public class MainTest {
	
	public static void main(String args[]){
		
		TennisGame theGame = new TennisGame();
		theGame.initScoreMap();
		System.out.println(theGame.getScore(2, 2));
		
	}

}
