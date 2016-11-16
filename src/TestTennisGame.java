
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
		Assert.assertEquals("Antonio scores > Score: 15 - 15", match.scorePlayerTwo());
		Assert.assertEquals("Antonio scores > Score: 15 - 30", match.scorePlayerTwo());
		Assert.assertEquals("Antonio scores > Score: 15 - 40", match.scorePlayerTwo());
		Assert.assertEquals("Filippo scores > Score: 30 - 40", match.scorePlayerOne());
		Assert.assertEquals("Filippo scores > Score: deuce", match.scorePlayerOne());
		Assert.assertEquals("Filippo scores > Score: advantage - 40", match.scorePlayerOne());
		Assert.assertEquals("Antonio scores > Score: deuce", match.scorePlayerTwo());
		Assert.assertEquals("Antonio scores > Score: 40 - advantage", match.scorePlayerTwo());
		Assert.assertEquals("Antonio scores > Score: Antonio wins", match.scorePlayerTwo());
	}

}
