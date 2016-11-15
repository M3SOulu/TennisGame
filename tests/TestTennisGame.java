import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
/**
 * tester class for tennis game
 * @author Michele
 *
 */
public class TestTennisGame {
	
	private TennisGame game;
	
	@Before
	public  void setUpBeforeClass() throws Exception {
		
		this.game= new TennisGame();
		this.game.initGame();//useless test it
	}

	@Test
	public void testScores() throws EndOfGameException{
		
		game.playSet(game.getPlayer1(), game.getPlayer2());
		Assert.assertEquals(game.printScore(),"Score: 15 - love");
		
		game.playSet(game.getPlayer1(), game.getPlayer2());
		Assert.assertEquals(game.printScore(),"Score: 30 - love");
		
		game.playSet(game.getPlayer1(), game.getPlayer2());
		Assert.assertEquals(game.printScore(),"Score: 40 - love");
	}
	
	@Test
	public void testVictory() throws EndOfGameException{
		
		game.playSet(game.getPlayer1(), game.getPlayer2());	
		game.playSet(game.getPlayer1(), game.getPlayer2());		
		game.playSet(game.getPlayer1(), game.getPlayer2());		
		game.playSet(game.getPlayer1(), game.getPlayer2());
		Assert.assertEquals(game.printScore(),"Score: player1 wins");
		
	}
	
	@Test
	public void testSameScore() throws EndOfGameException{
		
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer2(), game.getPlayer1());

		Assert.assertEquals(game.printScore(),"Score: 15 - 15");	
	}
	
	@Test
	public void testDeuce() throws EndOfGameException{
		
		game.playSet(game.getPlayer1(), game.getPlayer2());	
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		
		Assert.assertEquals(game.printScore(),"deuce");
		
	}
	
	@Test
	public void testAdvantage() throws EndOfGameException{
		
		game.playSet(game.getPlayer1(), game.getPlayer2());	
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		
		Assert.assertEquals(game.printScore(),"Score: 40 - advantage");
	}
	
	@Test
	public void testVictoryAfterAdvantage() throws EndOfGameException{
		
		game.playSet(game.getPlayer1(), game.getPlayer2());	
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		
		Assert.assertEquals(game.printScore(),"Score: player2 wins");
	}
	
	@Test
	public void testDeuceAfterAdvantage() throws EndOfGameException{
		
		game.playSet(game.getPlayer1(), game.getPlayer2());	
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer1(), game.getPlayer2());	
		
		Assert.assertEquals(game.printScore(),"deuce");
	}
	
	@Test(expected=EndOfGameException.class)
	public void testEndOfGameException() throws EndOfGameException{
		
		game.playSet(game.getPlayer1(), game.getPlayer2());	
		game.playSet(game.getPlayer1(), game.getPlayer2());		
		game.playSet(game.getPlayer1(), game.getPlayer2());		
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer1(), game.getPlayer2());
	}


}
