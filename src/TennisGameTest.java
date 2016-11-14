

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
}
