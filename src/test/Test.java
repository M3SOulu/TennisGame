package test;

import static org.junit.Assert.*;

import lab.Player;
import lab.TennisGame;

public class Test {

	
	@org.junit.Test
	public void test() {
		//Arrange
		String player1 = "player1";
		String player2 = "player2";
		TennisGame game1 = new TennisGame(player1, player2);
		//Act
		String ris = game1.assignScore(player1);
		//Assert
		assertEquals("player1 scores >  Score: 15 - love", ris);
	}
	
	@org.junit.Test
	public void test1() {
		//Arrange
		String player1 = "player1";
		String player2 = "player2";
		TennisGame game1 = new TennisGame(player1, player2);
		//Act
		String ris = game1.assignScore(player1);
		ris = game1.assignScore(player1);
		//Assert
		assertEquals("player1 scores >  Score: 30 - love", ris);
	}
	
	@org.junit.Test
	public void test2() {
		//Arrange
		String player1 = "player1";
		String player2 = "player2";
		TennisGame game1 = new TennisGame(player1, player2);
		//Act
		String ris = game1.assignScore(player1);
		ris = game1.assignScore(player1);
		ris = game1.assignScore(player2);
		//Assert
		assertEquals("player2 scores >  Score: 30 - 15", ris);
	}
	
	@org.junit.Test
	public void test3() {
		//Arrange
		String player1 = "player1";
		String player2 = "player2";
		TennisGame game1 = new TennisGame(player1, player2);
		//Act
		String ris = game1.assignScore(player1);
		ris = game1.assignScore(player1);
		ris = game1.assignScore(player2);
		ris = game1.assignScore(player1);
		ris = game1.assignScore(player1);
		//Assert
		assertEquals("player1 scores >  Score: Player1 win - 15", ris);
	}

}
