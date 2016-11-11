import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

	private Player p;
	
	@Before
	public void setUp() throws Exception {
		p = new Player("Mario");
	}

	@Test
	public void winPointTest() {
		//Act
		p.winPoint();
		
		//Assert
		assertTrue("Player score is 1", p.getScore() == 1);
		
	}
	
	@Test
	public void scoreDescriptionTest(){
		//Act
		p.winPoint();
		p.winPoint();
		
		//Assert
		assertTrue("Player point in tennis is 30", p.getScoreDescription().equals("30"));
	}
	
	@Test
	public void equalsTest(){
		//Act
		Player clone = new Player("Mario");
		
		//Assert
		assertTrue("The 2 players are the same", clone.equals(p));
	}

}
