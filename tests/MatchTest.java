import static org.junit.Assert.*;

import org.junit.Test;

public class MatchTest {

	@Test (expected = InvalidPlayerException.class)
	public void testCreateNewMatchWithoutPlayer() throws InvalidPlayerException
	{
		Match m = new Match( null, null );
	}
	
	@Test
	public void testCreateNewMatchWithPlayer() throws InvalidPlayerException
	{
		Match m = new Match( new Player(), new Player() );
		assertEquals( false, m.isWon() );
	}
	
}
