import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

/**
 * Tester class for Player class
 * @author Michele
 *
 */
public class TestPlayer {
	
	private Player player;

	@Before
	public void setUp() throws Exception {
		
		this.player= new Player("TennisPlayer");
		
	}

	@Test
	public void testPrintScore() {
		
		player.setScore(TennisScore.LOVE);
		Assert.assertEquals(player.printScore(),"love");
		
		player.setScore(TennisScore.ADVANTAGE);
		Assert.assertEquals(player.printScore(),"advantage");
		
		player.setScore(TennisScore.FIFTEEN);
		Assert.assertEquals(player.printScore(),"15");
		
		player.setScore(TennisScore.WINNER);
		Assert.assertEquals(player.printScore(),"TennisPlayer wins");
	}
	
	@Test
	public void testSetString(){
		
		player.setName("CiccioCappuccio");
		Assert.assertEquals(player.getName(),"CiccioCappuccio");
	}
}
