import static org.junit.Assert.*;

import org.junit.Test;

public class ScoreTest {

	@Test
	public void testScore() throws InvalidScoreException{
		Score s = new Score( 1 );
		assertEquals("15", s.toString());
	}
	
	@Test (expected = InvalidScoreException.class)
	public void testInvalidScore1() throws InvalidScoreException{
		Score s = new Score( -1 );
	}

	@Test (expected = InvalidScoreException.class)
	public void testInvalidScore2() throws InvalidScoreException{
		Score s = new Score( 4 );
	}
	
	@Test
	public void testStringScore1() throws InvalidScoreException{
		Score s = new Score( 0 );
		assertEquals("love", s.toString());
	}
	
	@Test
	public void testStringScore2() throws InvalidScoreException{
		Score s = new Score( 1 );
		assertEquals("15", s.toString());
	}
	
	@Test
	public void testStringScore3() throws InvalidScoreException{
		Score s = new Score( 2 );
		assertEquals("30", s.toString());
	}
	
	@Test
	public void testStringScore4() throws InvalidScoreException{
		Score s = new Score( 3 );
		assertEquals("40", s.toString());
	}
}
