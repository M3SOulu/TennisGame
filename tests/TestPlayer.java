import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exceptions.CantGetScoreDescriptionException;

public class TestPlayer {
	
	Player player;
	
	@Before
	public void setUp(){
		//Arrange
		player = new Player("playerName");
	}

	@Test
	public void aJustCreatedPlayerHasScoreZero() {
		//Assert
		assertEquals(0, player.getScore());
	}
	
	@Test
	public void addPointIncreasesScore(){
		//Act
		player.addPoint();
		//Assert
		assertEquals(1, player.getScore());
	}
	
	@Test
	public void zeroPointsAreDescribedAsLove() throws CantGetScoreDescriptionException{
		//Assert
		assertTrue(player.getScoreDescription().equals("love"));
	}
	
	@Test
	public void OnePointIsDescribedAsFifteen() throws CantGetScoreDescriptionException{
		//Arrange
		player.addPoint();
		//Assert
		assertTrue(player.getScoreDescription().equals("15"));
	}
	
	@Test
	public void TwoPointsAreDescribedAsTirty() throws CantGetScoreDescriptionException{
		//Arrange
		player.addPoint();
		player.addPoint();
		//Assert
		assertTrue(player.getScoreDescription().equals("30"));
	}
	
	@Test
	public void threePointsAreDescribedAsFourty() throws CantGetScoreDescriptionException{
		//Arrange
		player.addPoint();
		player.addPoint();
		player.addPoint();
		//Assert
		assertTrue(player.getScoreDescription().equals("40"));
	}
	
	@Test (expected = CantGetScoreDescriptionException.class)
	public void TryingToDescribeAScoreGreaterThanThreeShouldRaiseException() throws CantGetScoreDescriptionException{
		//Arrange
		player.addPoint();
		player.addPoint();
		player.addPoint();
		player.addPoint();
		//Act
		player.getScoreDescription();		
	}
	
	

}
