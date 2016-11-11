import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exceptions.CantGetScoreDescriptionException;

public class TestPlayer {
	
	Player player;
	
	@Before
	public void setUp(){
		//Arrange
		player = new Player();
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
	public void zeroPointsIsDescribedAsLove() throws CantGetScoreDescriptionException{
		//Assert
		assertTrue(player.getScoreDescription().equals("love"));
	}
	
	@Test
	public void ThreePointsAreDescribedAsFourty() throws CantGetScoreDescriptionException{
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
