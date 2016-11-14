

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {

	private TennisGame tennisGame;
	
	@Before
	public void setUp() throws Exception {
		tennisGame = new TennisGame();
	}

	@Test
	public void scoreIsZero() throws InvalidScoreException {
		assertEquals(tennisGame.convertScores(0), "love");
	}
	
	@Test
	public void scoreIsOne() throws InvalidScoreException {
		assertEquals(tennisGame.convertScores(1), "15");
	}
	
	@Test
	public void scoreIsTwo() throws InvalidScoreException {
		assertEquals(tennisGame.convertScores(2), "30");
	}
	
	@Test
	public void scoreIsThree() throws InvalidScoreException {
		assertEquals(tennisGame.convertScores(3), "40");
	}
	
	@Test
	public void scoreIsMoreThanThree() throws InvalidScoreException {
		assertEquals(tennisGame.convertScores(4), "advantage");
	}
	
	@Test(expected = InvalidScoreException.class)
	public void invalidScore() throws InvalidScoreException {
		assertEquals(tennisGame.convertScores(-1), "buongiornissimo, caffeeeeeee");
	}
	
	@Test
	public void initialIsLove() throws InvalidScoreException {
		assertEquals(tennisGame.systemScore(), "Initial love - love");
	}
	
	@Test(expected = InvalidPlayerException.class)
	public void assignScoreToPlayer1ThatWins() throws InvalidScoreException, InvalidPlayerException {
		assertEquals(tennisGame.assignScore(1), "player1 scores > Score: 15 - love");
		assertEquals(tennisGame.assignScore(1), "player1 scores > Score: 30 - love");
		assertEquals(tennisGame.assignScore(1), "player1 scores > Score: player1 wins");
		assertEquals(tennisGame.assignScore(1), "player1 scores > Score: player1 wins");
	}
	
	@Test(expected = InvalidPlayerException.class)
	public void assignScoreToPlayer2ThatWins() throws InvalidScoreException, InvalidPlayerException {
		assertEquals(tennisGame.assignScore(2), "player2 scores > Score: love - 15");
		assertEquals(tennisGame.assignScore(2), "player2 scores > Score: love - 30");
		assertEquals(tennisGame.assignScore(2), "player2 scores > Score: player2 wins");
		assertEquals(tennisGame.assignScore(2), "player2 scores > Score: player2 wins");
	}
	
	@Test
	public void playersTie() throws InvalidScoreException, InvalidPlayerException {
		assertEquals(tennisGame.assignScore(1), "player1 scores > Score: 15 - love");
		assertEquals(tennisGame.assignScore(2), "player2 scores > Score: 15 - 15");
		assertEquals(tennisGame.assignScore(1), "player1 scores > Score: 30 - 15");
		assertEquals(tennisGame.assignScore(2), "player2 scores > Score: 30 - 30");
		assertEquals(tennisGame.assignScore(1), "player1 scores > Score: 40 - 30");
		assertEquals(tennisGame.assignScore(2), "player2 scores > Score: deuce");
	}
	
	@Test
	public void player1WinsAfterTied() throws InvalidScoreException, InvalidPlayerException {
		assertEquals(tennisGame.assignScore(1), "player1 scores > Score: 15 - love");
		assertEquals(tennisGame.assignScore(2), "player2 scores > Score: 15 - 15");
		assertEquals(tennisGame.assignScore(1), "player1 scores > Score: 30 - 15");
		assertEquals(tennisGame.assignScore(2), "player2 scores > Score: 30 - 30");
		assertEquals(tennisGame.assignScore(1), "player1 scores > Score: 40 - 30");
		assertEquals(tennisGame.assignScore(2), "player2 scores > Score: deuce");
		assertEquals(tennisGame.assignScore(1), "player1 scores > Score: advantage - 40");
		assertEquals(tennisGame.assignScore(1), "player1 scores > Score: player1 wins");
	}
	
	@Test
	public void player2WinsAfterTied() throws InvalidScoreException, InvalidPlayerException {
		assertEquals(tennisGame.assignScore(1), "player1 scores > Score: 15 - love");
		assertEquals(tennisGame.assignScore(2), "player2 scores > Score: 15 - 15");
		assertEquals(tennisGame.assignScore(1), "player1 scores > Score: 30 - 15");
		assertEquals(tennisGame.assignScore(2), "player2 scores > Score: 30 - 30");
		assertEquals(tennisGame.assignScore(1), "player1 scores > Score: 40 - 30");
		assertEquals(tennisGame.assignScore(2), "player2 scores > Score: deuce");
		assertEquals(tennisGame.assignScore(2), "player2 scores > Score: 40 - advantage");
		assertEquals(tennisGame.assignScore(2), "player2 scores > Score: player2 wins");
	}
}
