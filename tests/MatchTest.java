import static org.junit.Assert.*;

import org.junit.Test;

public class MatchTest {

	@Test
	public void testGetWinner1() 
			throws InvalidScoreException, InvalidPlayerException 
	{
		Player p1 = new Player( new Score( 1 ) );
		Player p2 = new Player( new Score( 0 ) );
		Match p = new Match( p1, p2 );
		assertEquals(p.getWinner(), p1);
	}
	
	@Test
	public void testGetWinner2() 
			throws InvalidScoreException, InvalidPlayerException 
	{
		Player p1 = new Player( new Score( 0 ) );
		Player p2 = new Player( new Score( 1 ) );
		Match p = new Match( p1, p2 );
		assertEquals(p.getWinner(), p2);
	}
	
	@Test
	public void testGetWinner3() 
			throws InvalidScoreException, InvalidPlayerException 
	{
		Player p1 = new Player( new Score( 0 ) );
		Player p2 = new Player( new Score( 0 ) );
		Match p = new Match( p1, p2 );
		assertEquals(p.getWinner(), null);
	}
	
}
