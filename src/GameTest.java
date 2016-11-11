import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameTest {
	private TennisGame game;
	
	@Before
	public void setUp() throws Exception {
		game = new TennisGame("Pier", "Matteo");
	}

	@Test
	public void startGameTest() {
		//Act
		String gameStatus = game.getScore();
		
		//Assert
		assertTrue("Game status is love-love", gameStatus.equals("love, love"));
	}
	
}
