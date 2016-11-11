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
	public void testScores() {
		
		game.playSet(game.getPlayer1(), game.getPlayer2());
		Assert.assertEquals(game.printScore(),"Score: 15 - love");
		
		game.playSet(game.getPlayer1(), game.getPlayer2());
		Assert.assertEquals(game.printScore(),"Score: 30 - love");
		
		game.playSet(game.getPlayer1(), game.getPlayer2());
		Assert.assertEquals(game.printScore(),"Score: 40 - love");
	}
	
	@Test
	public void testVictory(){
		
		game.playSet(game.getPlayer1(), game.getPlayer2());	
		game.playSet(game.getPlayer1(), game.getPlayer2());		
		game.playSet(game.getPlayer1(), game.getPlayer2());		
		game.playSet(game.getPlayer1(), game.getPlayer2());
		Assert.assertEquals(game.printScore(),"Score: player1 wins");
		
	}
	
	@Test
	public void testSameScore() {
		
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer2(), game.getPlayer1());

		Assert.assertEquals(game.printScore(),"Score: 15 - 15");	
	}
	
	@Test
	public void testDeuce(){
		
		game.playSet(game.getPlayer1(), game.getPlayer2());	
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		
		Assert.assertEquals(game.printScore(),"deuce");
		
	}
	
	@Test
	public void testAdvantage(){
		
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
	public void testVictoryAfterAdvantage(){
		
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
	public void testDeuceAfterAdvantage(){
		
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
	
	@Test
	public void testAdvantageAfterDeuceAdvantageDeuce(){
		
		game.playSet(game.getPlayer1(), game.getPlayer2());	
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer1(), game.getPlayer2());
		
		Assert.assertEquals(game.printScore(),"Score: advantage - 40");
		
		
	}
	
	@Test
	public void testVictoryAfterAdvantageDeuceAdvantageDeuce(){
		
		game.playSet(game.getPlayer1(), game.getPlayer2());	
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer2(), game.getPlayer1());
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer1(), game.getPlayer2());
		game.playSet(game.getPlayer1(), game.getPlayer2());
		
		Assert.assertEquals(game.printScore(),"Score: player1 wins");
		
		
	}
	

}
