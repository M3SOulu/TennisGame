import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {

	String str1="Giovannni";
	String str2="Michele";
	TennisGame match1;
	
	@Before
	public void setUp() throws Exception {
		match1 = new TennisGame(str1, str2);
	}

	@Test
	public void getLeadPlayerTest() throws SameScoreSoNotLeadPlayerException {
		//Act
		match1.getPlayer1().incScore();
		assertEquals(match1.getLeadPlayer(),match1.getPlayer1());
	}
	
	@Test(expected = SameScoreSoNotLeadPlayerException.class)
	public void getLeadPlayerTest2() throws SameScoreSoNotLeadPlayerException{
		//Act
		Player p = match1.getLeadPlayer();
	}
	
	@Test 
	public void startMatchTestLove_LoveMessage() throws SameScoreSoNotLeadPlayerException{
		//Assert
		assertEquals( match1.getScore() ,"Score: love - love");
	}
	
	@Test 
	public void firstPlayerScoreTestLove_15Message() throws SameScoreSoNotLeadPlayerException{
		//Act
		match1.getPlayer1().incScore();
		//Assert
		assertEquals( match1.getScore() ,"Score: 15 - love");
	}
	
	@Test 
	public void eachPlayerScore2TimesTest30_30Message() throws SameScoreSoNotLeadPlayerException{
		//Act
		match1.getPlayer1().incScore();
		match1.getPlayer1().incScore();
		match1.getPlayer2().incScore();
		match1.getPlayer2().incScore();
		//Assert
		assertEquals( match1.getScore() ,"Score: 30 - 30");
	}
	
	@Test 
	public void player1WinMessageTest() throws SameScoreSoNotLeadPlayerException{
		//Act
		match1.getPlayer1().incScore();
		match1.getPlayer1().incScore();
		match1.getPlayer1().incScore();
		match1.getPlayer1().incScore();
		match1.getPlayer1().incScore();
		
		//Assert
		assertEquals( match1.getScore() ,"Score: "+str1+" wins");
	}

}
