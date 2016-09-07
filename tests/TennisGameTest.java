import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class TennisGameTest {
	private final String P2_WIN_MSG = "player2 wins";
	private final String P1_WIN_MSG = "player1 wins";
	private final int FIFTEEN = 1;
	private final int THIRTY = 2;
	private final int FOURTY = 3;
	private final int ADVANTAGE = 4;
	private final int DEUCE = 5;
	private TennisGame game;
	
	/*String[] scoreNames = {
			"love",
			"fifteen",
			"thirty",
			"fourty",
			"adv",
	};*/

	String[] scoreNames = {
			"love",
			"15",
			"30",
			"40",
			"adv",
			"deuce"
	};

	@Before
	public void setup() {
		game = new TennisGame();
	}
	
	@Test
	public void testTennisGame_Start() {
		//Arrange in setup
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Initial score incorrect", "love - love", score);		
	}
	
	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_Deuce() throws TennisGameException {
		//Arrange in setup
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
		//Arrange in setup
		//Act
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		// This statement should cause an exception
		game.player1Scored();		
		
	}
	
	private String getP1Score() {
		// try catch null pointer exception
		return game.getScore().split(" ")[0];
	}
	
	private String getP2Score() {
		// try catch null pointer exception
		return game.getScore().split(" ")[2];
	}
	
	@Test
	public void correctPlayer1ScoreIncrement_noAdvantage () throws TennisGameException {
		/* Test scores love to 40 */
		for (int i = 0; i < 4; i++) {
			String p1score = getP1Score();
			assertEquals("When adding p1 score, incorrect score: " + game.getScore(),
					scoreNames[i],
					p1score);
			game.player1Scored();
		}
	}
	
	@Test
	public void correctPlayer2ScoreIncrement_noAdvantage () throws TennisGameException {
		/* Test scores love to 40 */
		for (int i = 0; i < 4; i++) {
			String p2score = getP2Score();
			assertEquals("When adding p2 score, incorrect score: " + game.getScore(),
					scoreNames[i],
					p2score);
			game.player2Scored();
		}
	}
	
	@Test
	public void player1WinsAfter4ConsequentPoints () throws TennisGameException {
		for (int i  = 0; i < 4; i++) {
			game.player1Scored();
		}
		
		assertEquals("No victory message when p1 wins",
				P1_WIN_MSG,
				game.getScore());
	}
	
	@Test
	public void player2WinsAfter4ConsequentPoints () throws TennisGameException {
		for (int i  = 0; i < 4; i++) {
			game.player2Scored();
		}
		
		assertEquals("No victory message when p2 wins",
				P2_WIN_MSG,
				game.getScore());
	}
	
	@Test
	public void p1WinWith2ScoresAfterDeuce () throws TennisGameException {
		playToDeuce();
		
		game.player1Scored();
		game.player1Scored();
		
		assertEquals("No win with 2 scores after deuce",
				P1_WIN_MSG,
				game.getScore());
	}
	
	@Test
	public void p2WinWith2ScoresAfterDeuce () throws TennisGameException {
		playToDeuce();
		
		game.player2Scored();
		game.player2Scored();
		
		assertEquals("No win with 2 scores after deuce",
				P2_WIN_MSG,
				game.getScore());
	}
	
	@Test
	public void p1WinWithAdvDeuce2Scores () throws TennisGameException {
		playToDeuce();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		
		assertEquals("No win with 2 scores after deuce",
				P1_WIN_MSG,
				game.getScore());
	}
	
	@Test
	public void p2WinWithAdvDeuce2Scores  () throws TennisGameException {
		playToDeuce();
		
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		
		assertEquals("No win with 2 scores after deuce",
				P2_WIN_MSG,
				game.getScore());
	}
	
	private void playToDeuce() throws TennisGameException {
		for (int i  = 0; i < 3; i++) {
			game.player1Scored();
			game.player2Scored();
		}
	}
	
	@Test
	public void deuceAfterP1Advantage () throws TennisGameException {
		playToDeuce();
		
		game.player2Scored();
		game.player1Scored();
		
		assertEquals("Not deuce when player with 40 scored in advantage situation",
				scoreNames[DEUCE],
				game.getScore());
	}
	
	@Test
	public void deuceAfterP2Advantage () throws TennisGameException {
		playToDeuce();
		
		game.player2Scored();
		game.player1Scored();
		
		assertEquals("Not deuce when player with 40 scored in advantage situation",
				scoreNames[DEUCE],
				game.getScore());
	}
	
	@Test
	public void player1AdvAfterScoringWhenDeuce() throws TennisGameException {
		playToDeuce();
		
		game.player1Scored();
		assertEquals("P1 no advantage when scoring after deuce",
				scoreNames[ADVANTAGE],
				getP1Score());
	}
	
	@Test
	public void player2AdvAfterScoringWhenDeuce() throws TennisGameException {
		playToDeuce();
		
		game.player2Scored();
		assertEquals("P2 no advantage when scoring after deuce",
				scoreNames[ADVANTAGE],
				getP2Score());
	}
	
	@Test
	public void p1WinAfterp2Advantage() throws TennisGameException {
		playToDeuce();
		
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		assertEquals("No win with 3 scores after deuce other player advantage",
				P1_WIN_MSG,
				game.getScore());
	}
	
	@Test
	public void p2WinAfterp1Advantage() throws TennisGameException {
		playToDeuce();
		
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		assertEquals("No win with 3 scores after deuce other player advantage",
				P2_WIN_MSG,
				game.getScore());
	}
	
	@Test
	public void deuceAfterP1AdvP2AdvP1Score() throws TennisGameException {
		playToDeuce();
		
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		
		assertEquals("Not deuce after advantage of both players and losing advantage",
				scoreNames[DEUCE],
				game.getScore());
	}
	
	@Test
	public void deuceAfterP2AdvP1AdvP2Score() throws TennisGameException {
		playToDeuce();
		
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		
		assertEquals("Not deuce after advantage of both players and losing advantage",
				scoreNames[DEUCE],
				game.getScore());
	}
	
	public void p1WinAfterP1AdvP2Adv() throws TennisGameException {
		playToDeuce();
		
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		assertEquals("No win with 3 scores after deuce other player advantage",
				P1_WIN_MSG,
				game.getScore());
	}
	
	@Test
	public void deuceAfterPlayingToDeuce() throws TennisGameException {
		playToDeuce();
		
		assertEquals("Not deuce after playing to deuce",
				scoreNames[DEUCE],
				game.getScore());
	}
}
