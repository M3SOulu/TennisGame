
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPlayerTennis {

	PlayerTennis playerTennis;

	@Before
	public void setUp() throws Exception {
		playerTennis = new PlayerTennis(1);
	}

	@After
	public void tearDown() throws Exception {
		playerTennis.zeroScore();
	}


	@Test
	public void addOnePoint() throws InvalidNumberPoint {
		// Arrange
		// Act
		playerTennis.addPoint();

		// Assert
		assertEquals(15, playerTennis.getScore());
	}

	@Test
	public void addTwoPoint() throws InvalidNumberPoint {
		// Arrange
		// Act
		playerTennis.addPoint();
		playerTennis.addPoint();

		// Assert
		assertEquals(30, playerTennis.getScore());
	}

	@Test
	public void addThreePoint() throws InvalidNumberPoint {
		// Arrange
		// Act
		playerTennis.addPoint();
		playerTennis.addPoint();
		playerTennis.addPoint();

		// Assert
		assertEquals(40, playerTennis.getScore());
	}

	@Test
	public void clearsScore() throws InvalidNumberPoint {
		// Arrange
		// Act
		playerTennis.addPoint();
		playerTennis.addPoint();
		playerTennis.zeroScore();
		// Assert
		assertEquals(0, playerTennis.getScore());
	}
	

	@Test(expected = InvalidNumberPoint.class)
	public void invalidNumberPointInScore() throws InvalidNumberPoint {
		// Arrange
		// Act
		playerTennis.addPoint();
		playerTennis.addPoint();
		playerTennis.addPoint();
		playerTennis.addPoint();
	}
	
}
