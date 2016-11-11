import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class TestTennisGame {

	private TennisGame match;
	private Player A, B;
	
	@Before
	public void assegna(){
		A = new Player("Filippo");
		B = new Player("Antonio");
		match = new TennisGame(A,B);
	}
	
	@Test
	public void test() {
		Assert.assertEquals("Filippo scores > Score: 15 - love", match.scorePlayerOne());
	}

}
