import static org.junit.Assert.*;

import org.junit.Test;

public class TennisGameTest {

	@Test
	public void testTennisGame_Start() {
		//Arrange
		TennisGame game = new TennisGame();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Initial score incorrect", "love - love", score);		
	}

	@Test
	public void testTennisGame_FirstPlayerWinsGameStraight()  throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		//Act
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		// Assert
		assertEquals("Player 1 should have won","player1 wins",score);
	}

	@Test
	public void testTennisGame_SecondPlayerWinsGameStraight()  throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		//Act
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		// Assert
		assertEquals("Player 2 should have won","player1 wins",score);
	}

	@Test
	public void testTennisGame_SecondPlayerHasAdvantage()  throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		//Act
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();

		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		// Assert
		assertEquals("Player 2 should have advantage","player2 has advantage",score);
	}

	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_Deuce() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		//Act
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "deuce", score);		
	}
	
	@Test (expected = TennisGameException.class)
	public void testTennisGame_Player1WinsPointAfterGameEnded_ResultsException() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		//Act
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		// This statement should cause an exception
		game.player1Scored();		
		
	}	
	
	@Test
	public void testTennisGame_EahcPlayerWin5Points_Score_Deuce() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		//Act
		game.player1Scored();
		game.player2Scored();

		game.player1Scored();
		game.player2Scored();

		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();

		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "deuce", score);		
	}

}
