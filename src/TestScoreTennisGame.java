

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestScoreTennisGame {

	ScoreTennisGame scoreTennis;
	PlayerTennis player1;
	PlayerTennis player2;
	TennisGame playTennis;
	
	@Before
	public void setUp() throws Exception {
		scoreTennis=new ScoreTennisGame();
		player1 = new PlayerTennis(1);
		player2 = new PlayerTennis(2);
		playTennis = new TennisGame();
	}

	@After
	public void tearDown() throws Exception {
		
	}
	

	
	

	@Test
	public void gameScoreLove() throws InvalidNumberPoint, InvalidPlayerAdvantage{
		// Arrange
		player1.addPoint();
		
		// Act
		assertEquals("15 - love", scoreTennis.gameScore(player1, player2));
		assertEquals("love - 15", scoreTennis.gameScore(player2, player1));
	}
	
	@Test
	public void gameScoreDeuce() throws InvalidNumberPlayer, InvalidNumberPoint, InvalidPlayerAdvantage{
		// Arrange
		player1.addPoint();
		player1.addPoint();
		player1.addPoint();
		player2.addPoint();
		player2.addPoint();
		player2.addPoint();
		scoreTennis.manageAssignPoint(player2, player1.getScore());
		
		// Act
		assertEquals("deuce", scoreTennis.gameScore(player1, player2));
	}
	
	@Test
	public void gameScoreAdvantagePlayer1() throws InvalidNumberPoint, InvalidNumberPlayer, InvalidPlayerAdvantage{
		// Arrange
		player1.addPoint();
		player1.addPoint();
		player1.addPoint();
		player2.addPoint();
		player2.addPoint();
		player2.addPoint();
		scoreTennis.manageAssignPoint(player1, player2.getScore());
		scoreTennis.manageAssignPoint(player1, player2.getScore());
		
		// Act
		assertEquals("advantage - 40", scoreTennis.gameScore(player1, player2));
	}
	
	@Test
	public void gameScoreAdvantagePlayer2() throws InvalidNumberPoint, InvalidNumberPlayer, InvalidPlayerAdvantage{
		// Arrange
		player1.addPoint();
		player1.addPoint();
		player1.addPoint();
		player2.addPoint();
		player2.addPoint();
		player2.addPoint();
		scoreTennis.manageAssignPoint(player2, player1.getScore());
		scoreTennis.manageAssignPoint(player2, player1.getScore());
		
		// Act
		assertEquals("40 - advantage", scoreTennis.gameScore(player1, player2));
	}

	@Test
	public void gameScore1Wins() throws InvalidNumberPoint, InvalidPlayerAdvantage{
		// Arrange
		player1.addPoint();
		player1.addPoint();
		player1.addPoint();
		scoreTennis.manageAssignPoint(player1, player2.getScore());
		
		// Act
		assertEquals("player 1 wins", scoreTennis.gameScore(player1, player2));
	}
	
	@Test
	public void gameScore2Wins() throws InvalidNumberPoint, InvalidPlayerAdvantage{
		// Arrange
		player2.addPoint();
		player2.addPoint();
		player2.addPoint();
		scoreTennis.manageAssignPoint(player2, player1.getScore());
		
		// Act
		assertEquals("player 2 wins", scoreTennis.gameScore(player1, player2));
	}
	

	@Test
	public void manageAssignPoint() throws InvalidNumberPoint, InvalidPlayerAdvantage{
		// Arrange
		player2.addPoint();
		player2.addPoint();
		player2.addPoint();
		scoreTennis.manageAssignPoint(player2, player1.getScore());
		
		// Act
		assertEquals("player 2 wins", scoreTennis.gameScore(player1, player2));
	}
	
	@Test(expected = InvalidPlayerAdvantage.class)
	public void invalidPlayerAdvantageManageAssignPoint() throws InvalidPlayerAdvantage, InvalidNumberPoint {
		// Arrange
		player2 = new PlayerTennis(3);
		player2.addPoint();
		player2.addPoint();
		player2.addPoint();
		scoreTennis.manageAssignPoint(player2, player1.getScore());
		
		
		// Act
		assertEquals("player 2 wins", scoreTennis.gameScore(player1, player2));
	}

}
