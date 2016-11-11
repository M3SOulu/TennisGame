import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exceptions.CantGetScoreDescriptionException;
import exceptions.GameAlreadyFinishedException;

public class TestTennisGame {
	
	private TennisGame testGame;
	private final String player1Name = "player1";
	private final String player2Name = "player2";
	
	@Before
	public void setUp() throws Exception {
		testGame = new TennisGame(player1Name, player2Name);
	}

	@Test
	public void initialScoreShouldBeLoveLove() {
		//Assert
		assertEquals("Initial love - love", testGame.showGameScore());
	}
	
	@Test
	public void player1WinningBallShouldShowPlayer1Scores() throws CantGetScoreDescriptionException, GameAlreadyFinishedException {
		//Assert
		assertEquals(player1Name + " scores", testGame.winningBallBy("player1"));
	}
	
	@Test
	public void player2WinningBallShouldShowPlayer2Scores() throws CantGetScoreDescriptionException, GameAlreadyFinishedException {
		//Assert
		assertEquals(player2Name + " scores", testGame.winningBallBy("player2"));
	}
	
	@Test
	public void ifAPlayerWinsABallGameScoreShouldChange() throws CantGetScoreDescriptionException, GameAlreadyFinishedException{
		//Act
		testGame.winningBallBy(player1Name); 
		//Assert
		assertEquals("15 - love", testGame.getGameScore());
	}
	
	//- A game is won by the first player to have won at least four points in total and at least two points more than the opponent.
	@Test
	public void aPlayerWinsIfScores4TimesAnd2TimesMoreThanTheOpponent() throws CantGetScoreDescriptionException, GameAlreadyFinishedException{
		//Arrange
		testGame.winningBallBy(player1Name); // 1 - 0
		assertEquals("15 - love", testGame.getGameScore());
		testGame.winningBallBy(player1Name); // 2 - 0
		assertEquals("30 - love", testGame.getGameScore());
		testGame.winningBallBy(player2Name); // 2 - 1
		assertEquals("30 - 15", testGame.getGameScore());
		testGame.winningBallBy(player1Name); // 3 - 1
		assertEquals("40 - 15", testGame.getGameScore());
		testGame.winningBallBy(player1Name); // 4 - 1 WIN?
		//Assert
		assertEquals(player1Name + " wins", testGame.getGameScore());		
	}
	
	//If at least three points have been scored by each player, and the scores are equal, the score is "deuce"
	@Test
	public void IfAtLeast3PointsHaveBeenScoredByEachPlayerAndScoresAreEqualTheScoreIsDeuce() throws CantGetScoreDescriptionException, GameAlreadyFinishedException{
		//Arrange
		testGame.winningBallBy(player1Name); // 1 - 0
		testGame.winningBallBy(player2Name); // 1 - 1
		testGame.winningBallBy(player1Name); // 2 - 1
		testGame.winningBallBy(player2Name); // 2 - 2
		testGame.winningBallBy(player1Name); // 3 - 2 
		testGame.winningBallBy(player2Name); // 3 - 3
		//Assert
		assertEquals("deuce", testGame.getGameScore());
	}
	
	/*
	 * If at least three points have been scored by each side and a player has one more point than his opponent, 
	 * the score of the game is "advantage" for the player in the lead
	 */
	@Test
	public void ifALeast3PointsHaveBeenScoredByEachPlayerButAPlayerHas1MorePointTheScoreForHimIsAdvantage() throws CantGetScoreDescriptionException, GameAlreadyFinishedException{
		//Arrange
		testGame.winningBallBy(player1Name); // 1 - 0
		testGame.winningBallBy(player2Name); // 1 - 1
		testGame.winningBallBy(player1Name); // 2 - 1
		testGame.winningBallBy(player2Name); // 2 - 2
		testGame.winningBallBy(player1Name); // 3 - 2 
		testGame.winningBallBy(player2Name); // 3 - 3
		testGame.winningBallBy(player1Name); // 4 - 3
		//Assert
		assertEquals("advantage - 40", testGame.getGameScore());		
	}
	
	@Test(expected = GameAlreadyFinishedException.class)
	public void tryingToPlayAFinishedGameShouldRaiseAnException() throws CantGetScoreDescriptionException, GameAlreadyFinishedException{
		//Arrange
		testGame.winningBallBy(player1Name); // 1 - 0
		testGame.winningBallBy(player2Name); // 1 - 1
		testGame.winningBallBy(player1Name); // 2 - 1
		testGame.winningBallBy(player2Name); // 2 - 2
		testGame.winningBallBy(player1Name); // 3 - 2 
		testGame.winningBallBy(player2Name); // 3 - 3
		testGame.winningBallBy(player1Name); // 4 - 3
		testGame.winningBallBy(player1Name); // 1win
		//Act
		testGame.winningBallBy(player1Name);
	}
}
