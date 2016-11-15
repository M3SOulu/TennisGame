import static org.junit.Assert.*;


import org.junit.Test;

public class TennisGameTest {

	@Test
	public void testSimplyPlayWinner1() throws InvalidPlayerException, InvalidScoreException, IllegalPlayerPoint, IllegalMatchStateException, AlreadyWonMatchException{
		Player p1 = new Player(new Score(0));
		Player p2 = new Player(new Score(0));
		Point po = new Point(p1, p2);
		
		
		
		Point po1 = new Point(p1, p2);
		Point po2 = new Point(p1, p2);
		Point po3 = new Point(p1, p2);
		Point po4 = new Point(p1, p2);
		
		po.setWinner(p1);
		po1.setWinner(p2);
		po2.setWinner(p1);
		po3.setWinner(p1);
		po4.setWinner(p1);
		
		TennisGame m = new TennisGame(po);
		assertEquals("15-love", m.addPoint(po));
		assertEquals("15-15", m.addPoint(po1)); 
		assertEquals("30-15", m.addPoint(po2));
		assertEquals("40-15", m.addPoint(po3));
		assertEquals("player 1 wins", m.addPoint(po4));
		
		
		
	}
	
	

		@Test(expected = AlreadyWonMatchException.class)
		public void testSimplyPlayWinner5() throws InvalidPlayerException, InvalidScoreException, IllegalPlayerPoint, IllegalMatchStateException, AlreadyWonMatchException{
			Player p1 = new Player(new Score(0));
			Player p2 = new Player(new Score(0));
			Point po = new Point(p1, p2);
			po.setWinner(p1);
			TennisGame m = new TennisGame(po);
			Point po1 = new Point(p1, p2);
			Point po2 = new Point(p1, p2);
			Point po3 = new Point(p1, p2);
			Point po4 = new Point(p1, p2);
			Point po5 = new Point(p1, p2);
			po1.setWinner(p2);
			po2.setWinner(p1);
			po3.setWinner(p1);
			po4.setWinner(p1);
			po5.setWinner(p1);
			
			m.addPoint(po);
			m.addPoint(po1);
			m.addPoint(po2);
			m.addPoint(po3);
			m.addPoint(po4);
			m.addPoint(po5);
			
			
			
		}
	

	@Test
	public void testSimplyPlayWinner2() throws InvalidPlayerException, InvalidScoreException, IllegalPlayerPoint, IllegalMatchStateException, AlreadyWonMatchException{
		Player p1 = new Player(new Score(0));
		Player p2 = new Player(new Score(0));
		Point po = new Point(p1, p2);
		
		TennisGame m = new TennisGame(po);
		Point po1 = new Point(p1, p2);
		Point po2 = new Point(p1, p2);
		Point po3 = new Point(p1, p2);
		Point po4 = new Point(p1, p2);
		Point po5 = new Point(p1, p2);
		Point po6 = new Point(p1, p2);
		Point po7 = new Point(p1, p2);
		
		po.setWinner(p1);
		po1.setWinner(p2);
		po2.setWinner(p1);
		po3.setWinner(p1);
		po4.setWinner(p2);
		po5.setWinner(p2);
		po6.setWinner(p1);
		po7.setWinner(p1);
		
		assertEquals("15-love", m.addPoint(po)); 
		assertEquals("15-15", m.addPoint(po1));
		assertEquals("30-15", m.addPoint(po2));
		assertEquals("40-15", m.addPoint(po3));
		assertEquals("40-30", m.addPoint(po4)); 
		assertEquals("deuce", m.addPoint(po5));
		assertEquals("advantage - 40", m.addPoint(po6));
		assertEquals("player 1 wins", m.addPoint(po7));
		
		
	}
	
	@Test
	public void testSimplyPlayWinner3() throws InvalidPlayerException, InvalidScoreException, IllegalPlayerPoint, IllegalMatchStateException, AlreadyWonMatchException{
		Player p1 = new Player(new Score(0));
		Player p2 = new Player(new Score(0));
		
		
		
		Point po = new Point(p1, p2);
		Point po1 = new Point(p1, p2);
		Point po2 = new Point(p1, p2);
		Point po3 = new Point(p1, p2);
		Point po4 = new Point(p1, p2);
		Point po5 = new Point(p1, p2);
		Point po6 = new Point(p1, p2);
		Point po7 = new Point(p1, p2);
		Point po8 = new Point(p1, p2);
		Point po9 = new Point(p1, p2);
		
		TennisGame m = new TennisGame(po);
		
		po.setWinner(p1);
		po1.setWinner(p2);
		po2.setWinner(p1);
		po3.setWinner(p1);
		po4.setWinner(p2);
		po5.setWinner(p2);
		po6.setWinner(p1);
		po7.setWinner(p2);
		po8.setWinner(p2);
		po9.setWinner(p2);
		
		
		assertEquals("15-love", m.addPoint(po)); 
		assertEquals("15-15", m.addPoint(po1));
		assertEquals("30-15", m.addPoint(po2));
		assertEquals("40-15", m.addPoint(po3));
		assertEquals("40-30", m.addPoint(po4)); 
		assertEquals("deuce", m.addPoint(po5));
		assertEquals("advantage - 40", m.addPoint(po6));
		assertEquals("deuce", m.addPoint(po7));
		assertEquals("40 - advantage", m.addPoint(po8));
		assertEquals("player 2 wins", m.addPoint(po9));
		
		
	}
	
	@Test(expected = IllegalPlayerPoint.class)
	public void testExceptionPlay() throws InvalidScoreException, IllegalPlayerPoint, InvalidPlayerException, IllegalMatchStateException, AlreadyWonMatchException{
		
		Player p1 = new Player(new Score(0));
		Player p2 = new Player(new Score(0));
		Player p3 = new Player(new Score(3));
		Point po = new Point(p1, p2);
		Point po1  = new Point(p1, p3);
		TennisGame m = new TennisGame(po);
		m.addPoint(po1);
		
		}

}