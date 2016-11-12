import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTennisGame {
 
	private TennisGame match;
	
	@Before
	public void setUp(){
		match=new TennisGame(new Player("Andrew"),new Player("Marco"));
	}
	
	@Test
	public void test_of_tennisMatch(){
		Assert.assertEquals("Andrew scores > Score: 15 - love",match.scoreP1());
		Assert.assertEquals("Andrew scores > Score: 30 - love",match.scoreP1());
		Assert.assertEquals("Marco scores > Score: 30 - 15",match.scoreP2());
		Assert.assertEquals("Marco scores > Score: 30 - 30",match.scoreP2());
		Assert.assertEquals("Andrew scores > Score: 40 - 30",match.scoreP1());
		Assert.assertEquals("Marco scores > Score: 40 - 40",match.scoreP2());
		

	}
	


}
