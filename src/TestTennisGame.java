
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTennisGame {

	TennisGame playTennis;

	@Before
	public void setUp() throws Exception {
		playTennis = new TennisGame();
	}

	@After
	public void tearDown() throws Exception {
		playTennis.endGame();
	}

	@Test
	public void assignPointTennisGame() throws InvalidNumberPlayer, InvalidNumberPoint, InvalidPlayerAdvantage {

		// Arrange

		// Act

		// Assert
		assertEquals("Score: 15 - love", playTennis.assignPoint(1));
		assertEquals("Score: 15 - 15", playTennis.assignPoint(2));
		assertEquals("Score: 30 - 15", playTennis.assignPoint(1));
		assertEquals("Score: 40 - 15", playTennis.assignPoint(1));
		assertEquals("Score: 40 - 30", playTennis.assignPoint(2));
		assertEquals("Score: deuce", playTennis.assignPoint(2));
		assertEquals("Score: advantage - 40", playTennis.assignPoint(1));
		assertEquals("Score: deuce", playTennis.assignPoint(2));
		assertEquals("Score: 40 - advantage", playTennis.assignPoint(2));
		assertEquals("Score: deuce", playTennis.assignPoint(1));
		assertEquals("Score: advantage - 40", playTennis.assignPoint(1));
		assertEquals("Score: player 1 wins", playTennis.assignPoint(1));
	}

	@Test(expected = InvalidNumberPlayer.class)
	public void invalidNumberPlayerAddPointTennisGame() throws InvalidNumberPlayer, InvalidNumberPoint, InvalidPlayerAdvantage {
		// Arrange
		// Act
		assertEquals("Score: 15 - love", playTennis.assignPoint(3));
	}

	@Test
	public void endGameStartsNewGame() throws InvalidNumberPlayer, InvalidNumberPoint, InvalidPlayerAdvantage {
		// Arrange

		// Act
		assertEquals("Score: love - 15", playTennis.assignPoint(2));
		assertEquals("Score: 15 - 15", playTennis.assignPoint(1));
		assertEquals("Score: 30 - 15", playTennis.assignPoint(1));
		assertEquals("Score: 40 - 15", playTennis.assignPoint(1));
		assertEquals("Score: player 1 wins", playTennis.assignPoint(1));
		assertEquals("Score: 15 - love", playTennis.assignPoint(1));
	}

}
