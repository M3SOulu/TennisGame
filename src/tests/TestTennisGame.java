package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import game.InvalidPlayerException;
import game.TennisGame;
import player.InvalidScoreExceptio;

public class TestTennisGame {
	TennisGame game;
	
	@Before
	public void newGame(){
		game = new TennisGame();
	}
	
	@Test (expected = InvalidPlayerException.class)
	public void testInvalidPlayer() throws InvalidPlayerException, InvalidScoreExceptio{
		game.pScores(3);
	}
	
	@Test
	public void test15ToLove() throws InvalidPlayerException, InvalidScoreExceptio{
		game.pScores(1);
		Assert.assertEquals(" > Score: 15 - love", game.getMessage());
	}
	
	@Test
	public void test15To15() throws InvalidPlayerException, InvalidScoreExceptio{
		game.pScores(1);
		game.pScores(2);
		Assert.assertEquals(" > Score: 15 - 15", game.getMessage());
	}
	
	@Test
	public void testPlayer1Wins() throws InvalidPlayerException, InvalidScoreExceptio{
		game.pScores(1);
		game.pScores(1);
		game.pScores(2);
		game.pScores(2);
		game.pScores(1);
		game.pScores(1);
		Assert.assertEquals(" > Score: player1 wins", game.getMessage());
	}
	
	@Test
	public void testPlayer2Wins() throws InvalidPlayerException, InvalidScoreExceptio{
		game.pScores(1);
		game.pScores(1);
		game.pScores(2);
		game.pScores(2);
		game.pScores(2);
		game.pScores(2);
		Assert.assertEquals(" > Score: player2 wins", game.getMessage());
	}
	
	@Test
	public void testdeuce() throws InvalidPlayerException, InvalidScoreExceptio{
		game.pScores(1);
		game.pScores(1);
		game.pScores(1);
		game.pScores(2);
		game.pScores(2);
		game.pScores(2);
		Assert.assertEquals(" > Score: deuce", game.getMessage());
	}
	
	@Test
	public void testAdvantageTo40() throws InvalidPlayerException, InvalidScoreExceptio{
		game.pScores(1);
		game.pScores(1);
		game.pScores(1);
		game.pScores(2);
		game.pScores(2);
		game.pScores(2);
		game.pScores(1);
		Assert.assertEquals(" > Score: advantage - 40", game.getMessage());
	}
	
	@Test
	public void testPlayer1WinsAfterDeuce() throws InvalidPlayerException, InvalidScoreExceptio{
		game.pScores(1);
		game.pScores(1);
		game.pScores(1);
		game.pScores(2);
		game.pScores(2);
		game.pScores(2);
		game.pScores(1);
		game.pScores(1);
		Assert.assertEquals(" > Score: player1 wins", game.getMessage());
	}
	
}
