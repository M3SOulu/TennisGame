import static org.junit.Assert.*;

import org.junit.Test;

public class MatchTest {

	@Test
	public void test() throws InvalidPlayerException, InvalidScoreException, IllegalPlayerPoint{
		Player p1 = new Player(new Score(0));
		Player p2 = new Player(new Score(0));
		Point po = new Point(p1, p2);
		po.setWinner(p1);
		Match m = new Match(po);
		Point po1 = new Point(p1, p2);
		Point po2 = new Point(p1, p2);
		Point po3 = new Point(p1, p2);
		Point po4 = new Point(p1, p2);
		po1.setWinner(p2);
		po2.setWinner(p1);
		po3.setWinner(p1);
		po4.setWinner(p1);
		
		assertEquals("15-15", m.addPoint(po1)); 
		assertEquals("30-15", m.addPoint(po2));
		assertEquals("40-15", m.addPoint(po3));
		assertEquals("player 1 wins", m.addPoint(po4));
		
		
		
	}
}