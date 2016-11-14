import org.junit.After;
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
	public void test_of_tennisMatch_pl1_wins_easily(){
		Assert.assertEquals("Andrew scores > Score: 15 - love",match.scoreP1());
		Assert.assertEquals("Andrew scores > Score: 30 - love",match.scoreP1());
		Assert.assertEquals("Andrew scores > Score: 40 - love",match.scoreP1());
		Assert.assertEquals("Andrew scores > Score: Andrew wins",match.scoreP1());
	}
	
	@Test
	public void test_of_tennisMatch_pl2_wins_easily(){
		Assert.assertEquals("Marco scores > Score: love - 15",match.scoreP2());
		Assert.assertEquals("Marco scores > Score: love - 30",match.scoreP2());
		Assert.assertEquals("Marco scores > Score: love - 40",match.scoreP2());
		Assert.assertEquals("Marco scores > Score: Marco wins",match.scoreP2());
	}
	
	@Test
	public void test_of_tennisMatch_fought_match_p1w(){
		Assert.assertEquals("Marco scores > Score: love - 15",match.scoreP2());
		Assert.assertEquals("Andrew scores > Score: 15 - 15",match.scoreP1());
		Assert.assertEquals("Andrew scores > Score: 30 - 15",match.scoreP1());
		Assert.assertEquals("Andrew scores > Score: 40 - 15",match.scoreP1());
		Assert.assertEquals("Marco scores > Score: 40 - 30",match.scoreP2());
		Assert.assertEquals("Marco scores > Score: deuce",match.scoreP2());
		Assert.assertEquals("Marco scores > Score: 40 - advantage",match.scoreP2());
		Assert.assertEquals("Andrew scores > Score: deuce",match.scoreP1());
		Assert.assertEquals("Andrew scores > Score: advantage - 40",match.scoreP1());
		Assert.assertEquals("Andrew scores > Score: Andrew wins",match.scoreP1());
		
	}
	
	@Test
	public void test_of_tennisMatch_fought_match_p2w(){
		Assert.assertEquals("Marco scores > Score: love - 15",match.scoreP2());
		Assert.assertEquals("Andrew scores > Score: 15 - 15",match.scoreP1());
		Assert.assertEquals("Andrew scores > Score: 30 - 15",match.scoreP1());
		Assert.assertEquals("Andrew scores > Score: 40 - 15",match.scoreP1());
		Assert.assertEquals("Marco scores > Score: 40 - 30",match.scoreP2());
		Assert.assertEquals("Marco scores > Score: deuce",match.scoreP2());
		Assert.assertEquals("Andrew scores > Score: advantage - 40",match.scoreP1());
		Assert.assertEquals("Marco scores > Score: deuce",match.scoreP2());
		Assert.assertEquals("Marco scores > Score: 40 - advantage",match.scoreP2());
		Assert.assertEquals("Marco scores > Score: Marco wins",match.scoreP2());
		
	}
	
	@After
	public void tearDown(){
		match.setWinner(null);
	}

}
