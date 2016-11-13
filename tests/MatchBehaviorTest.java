import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatchBehaviorTest {
	private Match m;
	
	@Before
	public void setUp() throws InvalidPlayerException {
		m = new Match( new Player(), new Player() );
	}
	
	@Test
	public void testSetScoring1() throws MatchAlreadyWonException
	{
		m.setScoring( true, false );
		assertEquals( 1, m.getScoring()[ 0 ]);
		assertEquals( 0, m.getScoring()[ 1 ]);
	}
	
	@Test
	public void testSetScoring2() throws MatchAlreadyWonException
	{
		m.setScoring( false, true );
		assertEquals( 0, m.getScoring()[ 0 ]);
		assertEquals( 1, m.getScoring()[ 1 ]);
	}
	
	@Test
	public void testSetScoring3() throws MatchAlreadyWonException
	{
		m.setScoring( false, false );
		assertEquals( 0, m.getScoring()[ 0 ]);
		assertEquals( 0, m.getScoring()[ 1 ]);
	}
	
	@Test
	public void testIsWon1() throws MatchAlreadyWonException
	{
		m.setScoring( true, false );
		m.setScoring( true, false );
		m.setScoring( true, false );
		m.setScoring( true, false );
		
		assertEquals( 4, m.getScoring()[ 0 ]);
		assertEquals( 0, m.getScoring()[ 1 ]);
		assertEquals( true, m.isWon() );
	}
	
	@Test (expected = MatchAlreadyWonException.class)
	public void testIsAlreadyWon() throws MatchAlreadyWonException
	{
		m.setScoring( true, false );
		m.setScoring( true, false );
		m.setScoring( true, false );
		m.setScoring( true, false );
		m.setScoring(true, true);
	}
	
	@Test
	public void testIsWon2() throws MatchAlreadyWonException
	{
		m.setScoring( true, false );
		m.setScoring( true, false );
		m.setScoring( true, false );
		m.setScoring( false, true );
		m.setScoring( true, false );
		
		assertEquals( 4, m.getScoring()[ 0 ] );
		assertEquals( 1, m.getScoring()[ 1 ] );
		assertEquals( true, m.isWon() );
	}
	
	@Test
	public void testIsWon3() throws MatchAlreadyWonException
	{
		m.setScoring( true, false );
		m.setScoring( true, false );
		m.setScoring( true, false );
		m.setScoring( false, true );
		m.setScoring( false, true );
		m.setScoring( true, false );
		
		assertEquals( 4, m.getScoring()[ 0 ] );
		assertEquals( 2, m.getScoring()[ 1 ] );
		assertEquals( true, m.isWon() );
	}
	
	@Test
	public void testIsWon4() throws MatchAlreadyWonException
	{
		m.setScoring( true, false );
		m.setScoring( true, false );
		m.setScoring( true, false );
		m.setScoring( false, true );
		m.setScoring( false, true );
		m.setScoring( false, true );
		m.setScoring( true, false );
		
		assertEquals( 4, m.getScoring()[ 0 ] );
		assertEquals( 3, m.getScoring()[ 1 ] );
		assertEquals( false, m.isWon() );
	}

	@Test
	public void testIsWon5() throws MatchAlreadyWonException
	{
		m.setScoring( true, false );
		m.setScoring( true, false );
		m.setScoring( true, false );
		m.setScoring( false, true );
		m.setScoring( false, true );
		m.setScoring( false, true );
		m.setScoring( true, false );
		m.setScoring( false, true );
		m.setScoring( false, true );
		m.setScoring( false, true );		
		
		assertEquals( 4, m.getScoring()[ 0 ] );
		assertEquals( 6, m.getScoring()[ 1 ] );
		assertEquals( true, m.isWon() );
	}
}
