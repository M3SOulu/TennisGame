import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatchStateTest {
	private Match m;
	private int idPlayer1;
	private int idPlayer2;

	@Before
	public void setUp() throws InvalidPlayerException {
		Player p1 = new Player();
		Player p2 = new Player();
		m = new Match( p1, p2 );
		
		idPlayer1 = p1.getId();
		idPlayer2 = p2.getId();
		
	}
	
	@Test
	public void testInitialStringMatch() throws MatchAlreadyWonException
	{
		assertEquals( "Initial love - love", m.getMatchState() );
	}
	
	@Test
	public void testStringMatchFifteenLove() throws MatchAlreadyWonException
	{
		m.setScoring(true, false);
		assertEquals( "Score: 15 - love", m.getMatchState() );
	}
	
	@Test
	public void testStringMatchDuece() throws MatchAlreadyWonException
	{
		m.setScoring(true, false);
		m.setScoring(true, false);
		m.setScoring(true, false);
		m.setScoring(false, true);
		m.setScoring(false, true);
		m.setScoring(false, true);
		assertEquals( "Score: deuce", m.getMatchState() );
	}
	
	@Test
	public void testStringMatchAdvantagePlayer1() throws MatchAlreadyWonException
	{
		m.setScoring(true, false);
		m.setScoring(true, false);
		m.setScoring(true, false);
		m.setScoring(false, true);
		m.setScoring(false, true);
		m.setScoring(false, true);
		m.setScoring(true, false);
		assertEquals( "Score: advantage - 40", m.getMatchState() );
	}
	
	@Test
	public void testStringMatchAdvantagePlayer2() throws MatchAlreadyWonException
	{
		m.setScoring(true, false);
		m.setScoring(true, false);
		m.setScoring(true, false);
		m.setScoring(false, true);
		m.setScoring(false, true);
		m.setScoring(false, true);
		m.setScoring(false, true);
		assertEquals( "Score: 40 - advantage", m.getMatchState() );
	}
	
	@Test
	public void testStringMatchPlayer1Wins() throws MatchAlreadyWonException
	{
		m.setScoring(true, false);
		m.setScoring(true, false);
		m.setScoring(true, false);
		m.setScoring(true, false);
		assertEquals( "Score: Player" + idPlayer1 + " wins", m.getMatchState() );
	}
	
	@Test
	public void testStringMatchPlayer2Wins() throws MatchAlreadyWonException
	{
		m.setScoring(false, true);
		m.setScoring(false, true);
		m.setScoring(false, true);
		m.setScoring(false, true);
		
		assertEquals( "Score: Player" + idPlayer2 + " wins", m.getMatchState() );
	}

}
