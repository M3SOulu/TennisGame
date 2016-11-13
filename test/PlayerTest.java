import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

	private Player p;
	
	@Before
	public void setUp() throws Exception {
		p = new Player("Matteo");
	}

	@Test
	public void incScoreTest() {
		//Act
		p.incScore();
		//Assert
		assertTrue("Il giocatore fa un punto", p.getScore() == 1);
	}
	
	@Test
	public void getScoreStrigTest(){
		//Act
		p.incScore();
		p.incScore();
		//Assert
		assertTrue("I punti del giocatore sono 30", p.getScoreString().equals("30"));
	}
	
	@Test
	public void equalPlayerTest(){
		//Act
		Player p2 = new Player(p.getName());
		
		//Assert
		assertTrue("I giocatori sono uguali", p.equals(p2)==true);
	}

}
