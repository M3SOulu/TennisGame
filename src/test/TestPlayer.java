package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import lab.Player;

public class TestPlayer {

	String player1 = "player1";
	Player player;
	
	@Before
	public void setUp(){
		player = new Player(player1);
	}
	
	@Test
	public void TestGetPlayer(){
		//Act
		String ris = player.getPlayer();
		//Assert
		assertEquals("player1", ris);
	}
	
	@Test
	public void TestSetPlayer(){
		//Act 
		player.setPlayer("player2");
		String ris = player.getPlayer();
		//Assert
		assertEquals("player2", ris);
		
	}
}
