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
		assertEquals( 0, m.getWinnerPointsPlayer1() );
		assertEquals( 0, m.getWinnerPointsPlayer2() );
	}
	
	@Test
	public void testCreateNewMatchWithPlayerAlreadyPlayed() throws InvalidPlayerException, InvalidScoreException
	{
		Match m = new Match( new Player( new Score( 0 ) ), new Player( new Score( 1 ) ) );
		assertEquals( 0, m.getWinnerPointsPlayer1() );
		assertEquals( 1, m.getWinnerPointsPlayer2() );
	}
	
}
