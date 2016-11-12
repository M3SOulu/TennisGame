import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameTest {
	private TennisGame game;
	private Player p1;
	private Player p2;
	
	@Before
	public void setUp() throws Exception {
		p1 = new Player("Pier");
		p2 = new Player("Mario");
		game = new TennisGame(p1,p2);
	}

	@Test
	public void startGameTest() {
		//Act
		String gameStatus = game.getScore();
		
		//Assert
		assertTrue("Game status is love - love", gameStatus.equals("love - love"));
	}
	
	@Test
	public void fifteenIsDescriptionForScore1() {
	    //Act
		p1.winPoint();
		
		//Assert
		assertTrue("Game status is 15 - love", game.getScore().equals("15 - love"));
	}
	
	@Test
	public void thirtyIsDescriptionForScore2() {
	    //Act
		p1.winPoint();
		p2.winPoint();
		p1.winPoint();
		
		//Assert
		assertTrue("Game status is 30 - 15", game.getScore().equals("30 - 15"));
	}
	
	@Test
	public void fortyIsDescriptionForScore3() {
	    //Act
		p1.winPoint();
		p2.winPoint();
		p2.winPoint();
		p1.winPoint();
		p2.winPoint();
		
		//Assert
		assertTrue("Game status is 30 - 40", game.getScore().equals("30 - 40"));
	}
	
	@Test
	public void advantageIsDescriptionWhenBothScored3And1PlayerScoresAgain() {
	    //Act
		p1.winPoint();
		p2.winPoint();
		p2.winPoint();
		p1.winPoint();
		p2.winPoint();
		p1.winPoint();
		p1.winPoint();
		
		//Assert
		assertTrue("Game status is advantage - 40", game.getScore().equals("advantage - 40"));
	}
	
	@Test
	public void deuceIsDescriptionWhenBothScore3OrMoreButTheirScoreIsTheSame() {
	    //Act
		p1.winPoint();
		p2.winPoint();
		p2.winPoint();
		p1.winPoint();
		p2.winPoint();
		p1.winPoint();
		p1.winPoint();
		p2.winPoint();
		
		//Assert
		assertTrue("Game status is deuce", game.getScore().equals("deuce"));
	}
	
	@Test
	public void gameShouldBeWonByTheFirstPlayerToHaveWonAtLeastFourPointsInTotalAndWithAtLeastTwoPointsMoreThanTheOpponent() {
		//Act
		p1.winPoint();
		p2.winPoint();
		p2.winPoint();
		p1.winPoint();
		p2.winPoint();
		p1.winPoint();
		p1.winPoint();
		p2.winPoint();
		p1.winPoint();
		p1.winPoint();
		
		//Assert
		assertTrue("Pier won", game.getScore().equals("Pier won"));
	}
	
}
