import static org.junit.Assert.*;

import org.junit.Test;

public class ScoreTest {

	@Test
	public void testCreateNewScore() throws InvalidScoreException{
		Score s = new Score( 1 );
		assertEquals( 1, s.getScore() );
	}
	
	@Test (expected = InvalidScoreException.class)
	public void testCreateNewInvalidScore1() throws InvalidScoreException{
		Score s = new Score( -1 );
	}

	@Test (expected = InvalidScoreException.class)
	public void testCreateNewInvalidScore2() throws InvalidScoreException{
		Score s = new Score( 4 );
	}
	
	@Test
	public void testToStringScore1() throws InvalidScoreException{
		Score s = new Score( 0 );
		assertEquals("love", s.toString());
	}
	
	@Test
	public void testToStringScore2() throws InvalidScoreException{
		Score s = new Score( 1 );
		assertEquals("15", s.toString());
	}
	
	@Test
	public void testToStringScore3() throws InvalidScoreException{
		Score s = new Score( 2 );
		assertEquals("30", s.toString());
	}
	
	@Test
	public void testToStringScore4() throws InvalidScoreException{
		Score s = new Score( 3 );
		assertEquals("40", s.toString());
	}
	
	@Test
	public void testCompareToScoreSmaller() throws InvalidScoreException{
		Score s = new Score( 1 );
		assertEquals(1, s.compareTo( new Score( 0 ) ));
	}
	
	@Test
	public void testCompareToScoreGreater() throws InvalidScoreException{
		Score s = new Score( 1 );
		assertEquals(-1, s.compareTo( new Score( 2 ) ));
	}
	
	@Test
	public void testCompareToScoreEquals() throws InvalidScoreException{
		Score s = new Score( 1 );
		assertEquals(0, s.compareTo( new Score( 1 ) ));
	}
}
