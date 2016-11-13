import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ScoreTest {
	private Score s;
	
	@Before
	public void setUp()
	{
		s = new Score();
	}
	
	@Test
	public void testToStringScore1(){
		assertEquals("love", s.toString());
	}
	
	@Test
	public void testToStringScore3(){
		s.incrementScore();
		assertEquals("15", s.toString());
	}
	
	@Test
	public void testToStringScore4(){
		s.incrementScore();
		s.incrementScore();
		assertEquals("30", s.toString());
	}
	
	@Test
	public void testCompareToScoreSmaller(){
		s.incrementScore();
		s.incrementScore();
		s.incrementScore();
		assertEquals("40", s.toString());
	}
	
	@Test
	public void testCompareToScoreGreater(){
		s.incrementScore();
		s.incrementScore();
		s.incrementScore();
		s.incrementScore();
		assertEquals( "40", s.toString() );
	}
	
}
