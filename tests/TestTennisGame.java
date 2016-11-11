import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestTennisGame {
	
	private TennisGame game;
	
	@Before
	public  void setUpBeforeClass() throws Exception {
		
		this.game= new TennisGame();
		this.game.initGame();
	}

	@Test
	public void testfirstHit() {
		
		game.playSet(game.getPlayer1(), game.getPlayer2());
		Assert.assertEquals(game.printScore(),"Score: 15 - love");
		
	}

}
