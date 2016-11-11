package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import player.InvalidScoreExceptio;
import player.Player;

public class TestPlayer {
	Player p;
	
	@Before
	public void newPlayer(){
		p = new Player();
	}

	@Test
	public void testInitialScore() {
		Assert.assertEquals("love", p.getPunteggio());
	}
	
	@Test
	public void testIncreaseScoreAt15() throws InvalidScoreExceptio {
		p.increaseScore();
		Assert.assertEquals("15", p.getPunteggio());
	}
	
	@Test
	public void testIncreaseScoreAt40() throws InvalidScoreExceptio {
		p.increaseScore();
		p.increaseScore();
		p.increaseScore();
		Assert.assertEquals("40", p.getPunteggio());
	}
	
	@Test (expected = InvalidScoreExceptio.class)
	public void testIncreaseScoreWithInvalidValue() throws InvalidScoreExceptio {
		p.increaseScore();
		p.increaseScore();
		p.increaseScore();
		p.increaseScore();
	}

}
